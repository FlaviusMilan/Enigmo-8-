import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.JFrame;import java.awt.Graphics;
import java.awt.Image;import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.imageio.ImageIO;import java.awt.image.BufferedImage;import java.io.File;
import java.awt.Component.*;
import javax.swing.*;
class first1 extends JFrame implements ActionListener 
{
first1() throws IOException
{
BufferedImage bf1 = ImageIO.read(new File("/d:/milan/enigmo4.jpg"));
 
this.setContentPane(new backImage1(bf1));
Icon ic1=new ImageIcon("play.jpg");
JButton b=new JButton(ic1);
b.setBounds(270,200,200,100);
add(b);
b.addActionListener(this);
setSize(800,800);
}
public void actionPerformed(ActionEvent e)
{
try
{
second();
}

catch(Exception ae)
{
}
}
void second()
{
milanpuzzle6 m=new milanpuzzle6();
}
public static void main(String args[])throws IOException
{
first f=new first();
f.setVisible(true);
}
}
class backImage1 extends JComponent {
 
Image i1;
 
public backImage1(Image i1) {
this.i1 = i1;
 
}
 
public void paintComponent(Graphics g1) {
 
g1.drawImage(i1, 80, 80, null);  
 
}
}
