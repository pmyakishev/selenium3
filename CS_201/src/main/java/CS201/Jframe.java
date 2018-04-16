package CS201;

import javax.swing.*;

public class Jframe {
    public static void main(String[] args) {

        JButton jbtnOk = new JButton("OK");
        JButton cancel = new JButton("Cancel");
        JComboBox jcBox = new JComboBox(new String[] {"Freshman", "Sophomor"});

        JPanel panel =new JPanel();
        panel.add(jbtnOk);
        panel.add(jcBox);
        panel.add(cancel);

        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setSize(450,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
