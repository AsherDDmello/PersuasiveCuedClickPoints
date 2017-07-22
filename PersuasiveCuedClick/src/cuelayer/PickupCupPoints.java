

package cuelayer;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.text.StyledEditorKit.BoldAction;


public class PickupCupPoints
{
    int choiceno=10;
  ArrayList pcts;   //array list for pictures 
  ArrayList cuepoints;  //array list for cued points
  ArrayList blocks;
Connection con;     //connecting to database i.e 
  public PickupCupPoints()//constructor
    { choiceno=10;
      pcts=null;    //assigning starting value for picture as null(by definition)
      cuepoints=null;   //assigning a null value
      blocks=null;
  }
  public PickupCupPoints(ArrayList pcts,ArrayList points,ArrayList blocks)   //constructor with parameters.
    {
      con=ConnectionModel.getConnection();  //connectionModel is a class file which is imported from the cuelayer package
      this.pcts=pcts;   //this is a keyword used for removing the same name ambiguity
      cuepoints=points; //cuepoints now takes the points from the parameter given
      this.blocks=blocks;
  }

  public boolean insertData(String fname,String lname,String role,String quest,String answer,int MAX)   //insertData() is method for storing data from the text boxes
    {
      try                   //try block is used to encounter unwanted errors note:catch block is complusary
      {
       PreparedStatement pstmt=con.prepareStatement("insert into cuepoints_registration values(?,?,?,?,?,?,?,?,?,?,?,?,?)");    //preparestatement is used for sending SQL statements to the database
       pstmt.setString(1,fname);
       pstmt.setString(2,lname);
       pstmt.setString(3,role);
       pstmt.setString(4,quest);
       pstmt.setString(5,answer);

       String cpoints="";  
       String blockss="";
       for(int i=0;i<MAX;i++)
           blockss+=blocks.get(i) + "#";
       blockss=blockss.substring(0,blockss.length()-1);
       
       for(int i=0;i<MAX;i++)  //initializing an variable i = 0 ,if the i value is less than the cuepoints then display the below code
           //loop continues..the size() defines the number of elements in the list
           cpoints+=cuepoints.get(i) + "#";     // cpoints=cpoints+cuepoints.get(i)+"#"; the hash is used to divide the points
       //abov operation we are taking the values into cpoints
       cpoints=cpoints.substring(0,cpoints.length()-1); //The substring begins with the character at the specified index and extends to the end of this string or upto endIndex - 1 if second argument is given
      //here the substring start from the beginning index of 0 and continues 
       pstmt.setString(6,cpoints);  //Sets the designated parameter i.e .6 to the given Java String value. The driver converts this to an SQL VARCHAR or LONGVARCHAR value (depending on the argument's size relative to the driver's limits on VARCHAR values) when it sends it to the database.
// total number of parameter index is 6 including the cpoints.
       
       
       FileInputStream fis;         //java.io package FileInputStream is meant for reading streams of raw bytes such as image data
       int idx=0;       //index is taken as 0
       for(int start=7;start<=11;start++)
       {
           if(idx<MAX)
           {
           System.out.println(""+start);
           File f=new File(pcts.get(idx)+"");
           fis=new FileInputStream(pcts.get(idx)+"");
           pstmt.setBinaryStream(start, fis,(int)f.length());
           }
 else{
    pstmt.setBinaryStream(start, null,0);
 }
           idx++;
       }
       pstmt.setString(12,blockss);
       
       pstmt.setInt(13,MAX);
         int rows=pstmt.executeUpdate();
         if(rows>0)
                return(true);
       }
      catch(Exception ex)
      {
          System.out.println("Error " + ex);
          return(false);
      }
      return(false);
  }
  
    public boolean updateData(String lname,String fullname, String role, String custQuest, String answer) {
        // code
        try                   
      {
          
    PreparedStatement pstmt=con.prepareStatement("update cuepoints_registration set FULLNAME=?,ROLE=?,QUESTION=?,ANSWER=?,CUEPOINTS=?,PCT1=?,PCT2=?,PCT3=?,PCT4=?,PCT5=?,BLOCKS=? where LOGINNAME='"+lname+"' "); 
      pstmt.setString(1,fullname);
      pstmt.setString(2,role);
      pstmt.setString(3,custQuest);
      pstmt.setString(4,answer);
      
      
       
       String cpoints="";  
       String blockss="";
       for(int i=0;i<blocks.size();i++)
           blockss+=blocks.get(i) + "#";
       blockss=blockss.substring(0,blockss.length()-1);
       
       for(int i=0;i<cuepoints.size();i++)  
           cpoints+=cuepoints.get(i) + "#";   
       cpoints=cpoints.substring(0,cpoints.length()-1); 
       pstmt.setString(5,cpoints); 
       
       
       FileInputStream fis;         
       int idx=0;     
       for(int start=6;start<=10;start++)
       {
           System.out.println(""+start);
           File f=new File(pcts.get(idx)+"");
           fis=new FileInputStream(pcts.get(idx)+"");
         pstmt.setBinaryStream(start, fis,(int)f.length());
           idx++;
       }
     pstmt.setString(11,blockss);
       
     int rows=pstmt.executeUpdate();
      if(rows>0)
       {
           
       }
           
         return(true);
          
       }
      catch(Exception ex)
      {
          System.out.println("Error " + ex);
          
      }
      return(false);      
    }
}

