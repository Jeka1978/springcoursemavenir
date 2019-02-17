package my_spring;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class PopupSpeaker implements Speaker {
    @Override
    public void say(String message) {
        JOptionPane.showMessageDialog(null,message);
    }
}
