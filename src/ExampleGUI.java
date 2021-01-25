import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExampleGUI {
    private JTextArea thisIsAExampleTextArea;
    private JButton OKButton;
    private JButton cancelButton;
    private JPanel JPANELexample;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Example");
        frame.setContentPane(new ExampleGUI().JPANELexample);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public ExampleGUI() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,"OK");
            }
        });
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Cancel");
                super.mouseClicked(e);
            }
        });
    }

}
