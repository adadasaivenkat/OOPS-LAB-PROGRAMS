import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login extends JFrame
{
    JLabel usLab;
    JLabel passLab;
    JTextField usTF;
    JTextField passTF;
    JButton submit;
    JButton reset;
    Login()
    {
        usLab=new JLabel("Username : ");
        passLab=new JLabel("Password : ");
        usTF=new JTextField();
        passTF=new JTextField();
        submit=new JButton("Submit");
        reset=new JButton("Reset");
        // Set layout
        setLayout(new GridLayout(3,3));
        // Add components to the frame
        this.add(usLab);
        add(usTF);
        add(passLab);
        add(passTF);
        add(submit);
        add(reset);
        // Set frame properties
        setTitle("Login Page");
        setSize(500,500);
        setVisible(true);
        // Add action listeners to buttons
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String username=usTF.getText();
                String password=passTF.getText();
                if(username.equals(password))
                {
                    System.out.println("Successfully login with username "+usTF.getText()+" and password "+ passTF.getText()+".");
                    dispose();
                }
                else
                {
                    System.out.println("Invalid details.");
                }
            }
        });
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                usTF.setText("");
                passTF.setText("");
            }
        });
    }
    public static void main(String[] args)
    {
        new Login();
    }
}