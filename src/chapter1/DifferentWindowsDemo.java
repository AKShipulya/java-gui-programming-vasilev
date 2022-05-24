package chapter1;

import javax.swing.*;

public class DifferentWindowsDemo {

    public static void main(String[] args) {
        String[] name = {"Message", "Error", "Information", "Question"};
        String[] text = {"Simple window!", "Occur the error!", "Information window!", "Have a question?"};
        int[] style = {JOptionPane.PLAIN_MESSAGE, JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE};

        for (int i = 0; i < 4; i++) {
            JOptionPane.showMessageDialog(null, text[i], name[i], style[i]);
        }
        ImageIcon icon = new ImageIcon("resources/svetofor-128x128.png");
        JOptionPane.showMessageDialog(null, "Wait green please!", "Trafic light", JOptionPane.PLAIN_MESSAGE, icon);
    }
}
