import javax.swing.JButton;
import javax.swing.JFrame;

public class TestInstanceInnerClass {

    public void TestInstanceInnerClass() {
        JFrame frame;
        button1 = new JButton("One");
        button2 = new JButton("Two");
        button2 = new JButton("Two");
        frame = new JFrame("Test Instance Class");
        Container cp = frame.getContentPane();
        cp.add("North", button1);
        cp.add("Center", button2);
        Listener lstnr = new Listener();
        button1.addActionListener(lstnr);
        button2.addActionListener(lstnr);
        frame.setSize(175, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new TestInstanceInnerClass();
    }
}
