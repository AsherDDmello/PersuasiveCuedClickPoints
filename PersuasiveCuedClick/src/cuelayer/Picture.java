

package cuelayer;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Picture
{
  ArrayList pcts;   //array list for pictures
  
Connection con;     //connecting to database i.e 
  public Picture()//constructor
    {
      pcts=null;    //assigning starting value for picture as null(by definition)
  
  }
  
  public Picture(ArrayList pcts)   //constructor with parameters.
    {
      con=ConnectionModel.getConnection();  //connectionModel is a class file which is imported from the cuelayer package
      this.pcts=pcts;   //this is a keyword used for removing the same name ambiguity
      }
public boolean truncate()
  {
      try{
      PreparedStatement pstmt=con.prepareStatement("truncate table picture");
      int rows=pstmt.executeUpdate();
         if(rows>0)
                return(true);
}
      catch(Exception ex)
      {
          return(false);
      }
      return(false);
      }

  public boolean insertData()   //insertData() is method for storing data from the text boxes
    {
      try                   //try block is used to encounter unwanted errors note:catch block is complusary
      {
       PreparedStatement pstmt=con.prepareStatement("insert into picture values(?,?,?,?,?,?,?,?,?,?)");    //preparestatement is used for sending SQL statements to the database
       FileInputStream fis;         //java.io package FileInputStream is meant for reading streams of raw bytes such as image data
       int idx=0;       //index is taken as 0
       for(int start=1;start<=10;start++)
       {
           System.out.println(""+start);
           File f=new File(pcts.get(idx)+"");
           fis=new FileInputStream(pcts.get(idx)+"");
           pstmt.setBinaryStream(start, fis,(int)f.length());
idx++;
       }
         int rows=pstmt.executeUpdate();
         if(rows>0)
                return(true);
       }
      catch(Exception ex)
      {
          return(false);
      }
      return(false);
  }
  
}


