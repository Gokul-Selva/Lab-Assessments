/*
* Desc: Program that simulates the traffic light
* Author: Gokul
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/**/
public class trafficlightsimulation extends Applet implements ItemListener
{
String msg="";
Checkbox Red,Green,Yellow;
CheckboxGroup cbg;
public void init()
{
cbg=new CheckboxGroup();
Red=new Checkbox("RED",cbg,false);
Green=new Checkbox("GREEN",cbg,false);
Yellow=new Checkbox("YELLOW",cbg,false);
add(Red);
add(Yellow);
add(Green);
Red.addItemListener(this);
Green.addItemListener(this);
Yellow.addItemListener(this);
}
public void itemStateChanged(ItemEvent ie)
{
repaint();
}
public void paint(Graphics g)
{
	int x=50,y=50;
//g.drawOval(10,10,50,50);
if(cbg.getSelectedCheckbox().getLabel()=="RED")
{
g.drawString("Stop",x,y);
} if(cbg.getSelectedCheckbox().getLabel()=="YELLOW")
{
	g.drawString("Ready",x,y);
}
if(cbg.getSelectedCheckbox().getLabel()=="GREEN")
{
	g.drawString("Go",x,y);
}
}
}
