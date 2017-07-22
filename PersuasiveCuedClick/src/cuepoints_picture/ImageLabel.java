
package cuepoints_picture;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.*;

public class ImageLabel extends JLabel {
    int x,y;
    int hei,wid,choiceNo;
    String myimage;
    int RandomXAxis , RandomYAxis;
    public static int XAxis;
    public static int YAxis;
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
    public ImageLabel(int x,int y,int height,int width,int choiceNo,String filename)
     {
      this.x=x;
      this.y=y;
      this.hei=height;
      this.wid=width;
      this.choiceNo=choiceNo;
      myimage=filename;
      RandomXAxis = RandomXAxis();
      RandomYAxis = RandomYAxis();
     }
    @Override
    public void paint(Graphics g)
    {
        try{
            
            g.drawImage(Toolkit.getDefaultToolkit().getImage(myimage), x, y, wid,hei,null);
            
            
            int y1=0;
            int x1=0;
            for(int i=1;i<=choiceNo;i++)
            {
                g.setColor(new Color(0,0,0,0));
                y1=(hei/choiceNo)*i;
                g.drawLine(0,y1,wid,y1);
                x1=(wid/choiceNo)*i;
                g.drawLine(x1, 0, x1, hei);
            }
            
            // Set Overlay 
//today            g.setColor(new Color(225,255,255,128));
       //today     g.fillRect(0, 0, wid, hei);
            
            // setColor(R,G,B,alfa);
         //   g.setColor(Color.BLACK);
     // g.drawRect(x1, y1, wid/choiceNo, hei/choiceNo);

            y1=RandomYAxis;
 x1=RandomXAxis;

     // g.setColor(Color.BLACK);
  //          g.drawRect(x1, y1, wid/choiceNo, hei/choiceNo);

 g.setColor(new Color(225,255,255,128));

g.fillRect(wid/choiceNo+x1,hei/choiceNo+y1,640-x1,640-y1);
//// g.fillRect(wid/choiceNo, hei/choiceNo,0,0);
 g.setColor(new Color(225,255,255,128));
  g.fillRect(0,0,x1,480);
   g.setColor(new Color(225,255,255,128));
 g.fillRect(x1,0,640-x1,y1);
 
  g.setColor(new Color(225,255,255,128));
//   g.fillRect(x1+wid/choiceNo,y1,640-(x1+wid/choiceNo),y1+hei/choiceNo);
  g.fillRect(x1+wid/choiceNo,y1,640-(x1+wid/choiceNo),hei/choiceNo);
    g.setColor(new Color(225,255,255,128));


   g.fillRect(x1,y1+hei/choiceNo,wid/choiceNo,480-(y1+hei/choiceNo));

//            g.setColor(new Color(0,0,0,120));

//           g.fillRect(x1, y1, wid/choiceNo, hei/choiceNo);
       g.drawRect(x1, y1, wid/choiceNo, hei/choiceNo);
            
            XAxis = x1;
            YAxis = y1;
               // Purcuing Rect 
                
            repaint();
            // Applying persuasive cued click points
           
        }
        catch(Exception ex)
        {
            System.out.println("Error " + ex.getMessage());
        }
     }
    
     // Shuffle X Axis Point 
     private int RandomXAxis()
     {
         
         Integer[] array = new Integer[choiceNo];
            for(int i = 1;i<640; i++)
            {
                for (int j = 1; j <= choiceNo; j++) {
                    if(((wid/choiceNo)*j) == i)
                    {
                        array[j] = i;
                    }
                }
            }
            Collections.shuffle(Arrays.asList(array));
            if(array[0] == RandomXAxis)
            {
                RandomXAxis();
            }
            else      
            {
                return array[0];
            }
        return 0;
     }
     
     // Shuffle Y Axis Point 
     private int RandomYAxis()
     {
         Integer[] array = new Integer[choiceNo];
            for(int i = 1;i<480; i++)
            {
                for (int j = 1; j <= choiceNo; j++) {
                    if(((hei/choiceNo)*j) == i)
                    {
                        array[j] = i;
                    }
                }
            }
            Collections.shuffle(Arrays.asList(array));
            if(array[0] == RandomYAxis)
            {
                RandomYAxis();
            }
            else      
            {
                return array[0];
            }
        return 0;
     }
}
