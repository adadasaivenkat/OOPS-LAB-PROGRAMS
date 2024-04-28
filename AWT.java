import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWT extends Frame
{
    Label usLab;
    Label passLab;
    TextField usTF;
    TextField passTF;
    Button submit;
    Button reset;
    AWT()
    {
        usLab=new Label("Username : ");
        passLab=new Label("Password : ");
        usTF=new TextField();
        passTF=new TextField();
        submit=new Button("Submit");
        reset=new Button("Reset");
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
        setTitle("Event registration form");
        setSize(500,500);
        setVisible(true);
        // Add action listeners to buttons
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Successfully registered with username "+usTF.getText()+" and password "+ passTF.getText()+".");
                dispose();
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
        new AWT();
    }    
}