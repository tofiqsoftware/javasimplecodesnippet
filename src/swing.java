import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing extends JFrame implements ActionListener {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Example");

        // Set frame size and make it visible
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel panel = new JPanel();


        JLabel username = new JLabel("username");
        JTextField textfield1 = new JTextField();
        JLabel password = new JLabel("password");
        JTextField textfield2 = new JTextField();
        JButton login = new JButton("login");
        JCheckBox check= new JCheckBox("remember me");

//        JDialog dialog = new JDialog();
//        JLabel l = new JLabel("this is a message dialog part");
//        dialog.add(l);
//        dialog.setSize(150,150);
//        dialog.setVisible(true);



panel.setLayout(null);
panel.setBackground(Color.PINK);

username.setBounds(50,30,100,30);
textfield1.setBounds(120,30,100,30);
 textfield1.setBackground(Color.ORANGE);
 textfield2.setForeground(Color.BLUE);
password.setBounds(50,70,100,30);
textfield2.setBounds(120,70,100,30);
textfield2.setBackground(Color.ORANGE);
textfield2.setForeground(Color.BLUE);
check.setBounds(100,110,90,30);
check.setBackground(Color.green);
login.setBounds(120,150,80,30);
login.setBackground(Color.green);

        // Add ActionListener to the button
login.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(panel, "yo've logged in !");
       }
        });




        panel.add(username);
        panel.add(textfield1);
        panel.add(password);
        panel.add(textfield2);
        panel.add(login);
        panel.add(check);
//        frame.add(dialog);
        frame.add(panel);












    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
