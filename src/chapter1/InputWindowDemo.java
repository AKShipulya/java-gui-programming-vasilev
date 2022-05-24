package chapter1;

import javax.swing.*;

public class InputWindowDemo {

    public static void main(String[] args) {

        String text;
        int mType = JOptionPane.INFORMATION_MESSAGE;
        String mCaption = "User choice";
        ImageIcon image = new ImageIcon("resources/svetofor-128x128.png");

        try {
            String input;
            input = JOptionPane.showInputDialog("Put a text here!");
            char first = input.charAt(0);
            input = JOptionPane.showInputDialog(null, "Put a number", "Number", JOptionPane.WARNING_MESSAGE);
            int last = Integer.parseInt(input) % 10;
            String[] color = {"Red", "Yellow", "Green"};

            // TODO: 5/24/22 страница 27, еще раз все перепроверь!!!
            input = (String) JOptionPane.showMessageDialog(null,"Let show color: ", color[color.length - 1], mType, image);

            if (input == null) {
                throw new Exception();
            }
            text = "First letter (symbol) in the text: " + first + "\n";
            text += "Last digit in the number: " + last + "\n";
            text += "Color choice: " + input;
        } catch (Exception exception) {
            text = "User has canceled the process \n";
            text += "or incorrect value has been putted";
            mType = JOptionPane.ERROR_MESSAGE;
        }
        JOptionPane.showMessageDialog(null, text, mCaption, mType);
    }
}
