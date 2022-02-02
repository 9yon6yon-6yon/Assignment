import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUITest extends JFrame implements WindowListener, ActionListener {
    JFrame frame = new JFrame();
    JTextField tf1 = new JTextField(10);
    JTextField tf2 = new JTextField(10);
    JButton swap = new JButton("Swap!");
    JPanel jp = new JPanel();

    public GUITest() {
        frame.setSize(275, 120);
        swap.addActionListener(this);
        swap.setActionCommand("swp");
        frame.add(jp);
        jp.add(tf1);
        jp.add(tf2);
        jp.add(swap);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand() == "swp") {
           String s1 = tf1.getText();
           String s2 = tf2.getText();
           tf1.setText(s2);
            tf2.setText(s1);
        }

    }


    public void windowOpened(WindowEvent windowEvent) {

    }

    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);

    }

    public void windowClosed(WindowEvent windowEvent) {

    }


    public void windowIconified(WindowEvent windowEvent) {

    }


    public void windowDeiconified(WindowEvent windowEvent) {

    }


    public void windowActivated(WindowEvent windowEvent) {

    }


    public void windowDeactivated(WindowEvent windowEvent) {

    }

    public static void main(String[] args) {
        new GUITest();
    }
}

