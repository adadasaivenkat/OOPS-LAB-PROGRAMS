import java.applet.*;
import java.awt.*;
/*
    <applet code="AppletClasses.class" width="500" height="500"> </applet>
*/
@SuppressWarnings("removal")
public class AppletClasses extends Applet
{
    public void paint(Graphics g)
    {
        g.setFont(new Font("Arial",Font.BOLD,30));
        g.drawString("Hello,World!", 150, 250);
    }
}