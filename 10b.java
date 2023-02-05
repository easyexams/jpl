import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.applet.Applet;
/*<applet code="Task10b.class" width=400 height=350></Applet>*/
public class Task10b extends Applet implements KeyListener
{
String msg=""; public void init()
{
addKeyListener(this);
//Register Listener with Applet.requestFocus();
//requestFocus() method is present in the Component class. This method makesa request to obtain
the Input Focus for the current program.
//Otherwise program will not receive any keyboard events.
}
public void keyPressed(KeyEvent obj)
{
showStatus("Key Pressed");
}
public void keyReleased(KeyEvent obj)
{
showStatus("Key Released");
}
public void keyTyped(KeyEvent obj)
{
showStatus("Key Typed");
msg=msg+obj.getKeyChar();
repaint();
//getKeyChar() returns the key typed as a character.
//showStatus(String msg) method displays the message on the status bar of theapplet window.
}
public void paint(Graphics g)
{
Font currentFont=new Font("TimesRoman",Font.BOLD,29);
g.setFont(currentFont);
//FontMetrics, Dimension class are used to display the text in the middleof the screen
FontMetrics fm=g.getFontMetrics(); 
Dimension d= getSize();
int xc,yc;
xc=d.width/2-fm.stringWidth(msg)/2;
yc=d.height/2+fm.getDescent();
//g.drawString(msg,50,50); g.drawString(msg,xc,yc); ssetBackground(Color.red);
}
}
