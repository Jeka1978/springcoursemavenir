package my_spring;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object wrapWithProxy(Object t, Class type) {
        boolean methodWantBenchmark =
                Arrays.stream(type.getMethods()).anyMatch(method -> method.isAnnotationPresent(Benchmark.class));
        if (type.isAnnotationPresent(Benchmark.class) || methodWantBenchmark) {
            if (type.getInterfaces().length == 0) {
               return Enhancer.create(type, (org.springframework.cglib.proxy.InvocationHandler) (proxy, method, args) -> invocationLogic(t, type, method, args));
            }else
            return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), (proxy, method, args) -> invocationLogic(t, type, method, args));
        }
        return t;
    }

    private Object invocationLogic(Object t, Class type, Method method, Object[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
        if (classMethod.isAnnotationPresent(Benchmark.class) || type.isAnnotationPresent(Benchmark.class)) {
            System.out.println("********* BENCHMARK started for method " + method.getName() + " ***********");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end - start);
            System.out.println("********* BENCHMARK ended for method " + method.getName() + " **************");
            return retVal;
        } else {
            return method.invoke(t, args);
        }
    }
}
