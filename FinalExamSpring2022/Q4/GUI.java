package FinalExamSpring2022.Q4;

import javax.swing.*;

import java.awt.event.ActionEvent;

import java.awt.event.WindowEvent;


public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JButton b2, b3;
        JPanel p = new JPanel();
        b2 = new JButton("2");
        b3 = new JButton("3");

        frame.add(p);
        p.add(new JButton(new AbstractAction("1") {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                b2.setText("2");
                b3.setText("3");
            }
        }));
        p.add(b2);
        p.add(b3);
        p.add(new JButton(new AbstractAction("4") {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                b2.setText("3");
                b3.setText("2");
            }
        }));
        frame.setVisible(true);
    }
}
