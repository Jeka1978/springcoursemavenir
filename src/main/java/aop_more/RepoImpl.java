package aop_more;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class RepoImpl implements Repo {
    @Override
    public String getText() {
        throw new DBException("fire all dba!!!");
//        return "I drink and I know Things, Thats what I do";
    }
}
