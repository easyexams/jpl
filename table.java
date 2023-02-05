import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/*<applet code="task13.class" height=310 width=400></applet>*/
public class task13 extends Japplet {
public void init()
{
Container contentpane=getContentPane();
Contentpane.setLayout(new BorderLayout());
final String[] colheads={“Name”,”Phone”,”Fax”};
final object[][]data={{“vijay”,”1234”,”1234”},{“Vinod”,”3456”,”3456”},
{“siva”,”1256”,”1256”}};
Jtable table=new Jtable(data,colheads);
int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
int h=ScrollPaneConstants.HORIZANTAL_SCROLLBAR_AS_NEEDED;
JScrollPane jsp=new JScrollpane(table,v,h);
contentPane.add(jsp,BorderLayout.CENTER);
}
}
