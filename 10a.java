import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.applet.Applet;
/*<applet code="Task10.class" width=400 height=350></Applet>*/
public class Task10 extends Applet implements MouseListener
{
String msg=""; public void init()
{
addMouseListener(this);
}
public void mouseClicked(MouseEvent obj)
{
msg="mouse clicked";
repaint();
}
public void mouseEntered(MouseEvent obj)
{
msg="mouse entered";
repaint();
}
public void mouseExited(MouseEvent obj)
{
msg="mouse exit";
repaint();
}
public void mousePressed(MouseEvent obj)
{
msg="mouse pressed";
repaint();
}
public void mouseReleased(MouseEvent obj)
{
msg="mouse released";
repaint();
 51
}
public void mouseMoved(MouseEvent obj)
{
msg="mouse moved";
repaint();
}
public void mouseDragged(MouseEvent obj)
{
msg="mouse Dragged";
repaint();
}
public void paint(Graphics g)
{
Font currentFont=new Font("TimesRoman",Font.BOLD,29);
g.setFont(currentFont);
//FontMetrics, Dimension class are used to display the text in themiddle of the
screen.
FontMetrics fm=g.getFontMetrics();
Dimension d= getSize();
int xc,yc;
xc=d.width/2- fm.stringWidth(msg)/2;
yc=d.height/2+fm.getDescent();
//g.drawString(msg,50,50);
g.drawString(msg,xc,yc);
setBackground(Color.red);
}
}