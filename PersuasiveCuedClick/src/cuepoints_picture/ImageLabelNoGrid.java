
package cuepoints_picture;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JLabel;


public class ImageLabelNoGrid  extends JLabel{
     int x,y;
    int hei,wid,choiceNo;
    String myimage;
   /* public void setImage(String path)
    {
        myimage=path;
    }
    public String getImage()
    {
        return(myimage);
    }
    public ImageLabel()
    {
        
    }*/
    public ImageLabelNoGrid(int x,int y,int height,int width,int choiceNo,String filename)
     {
      this.x=x;
      this.y=y;
      this.hei=height;
      this.wid=width;
      this.choiceNo=choiceNo;
      myimage=filename;
     }
    @Override
    public void paint(Graphics g)
    {
        try{
            
            g.drawImage(Toolkit.getDefaultToolkit().getImage(myimage), x, y, wid,hei, null);
            
            g.setColor(Color.WHITE);
            int y1=0;
            int x1=0;
            for(int i=1;i<=choiceNo;i++)
                {
                y1=(hei/choiceNo)*i;
           //     g.drawLine(0,y1,wid,y1);
                x1=(wid/choiceNo)*i;
              //  g.drawLine(x1, 0, x1, hei);
                }
            repaint();
        }
        catch(Exception ex)
        {
            System.out.println("Error " + ex.getMessage());
        }
     }
}
