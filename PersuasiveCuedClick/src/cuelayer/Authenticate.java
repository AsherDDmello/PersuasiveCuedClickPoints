
package cuelayer;

import java.sql.*;
import java.util.*;
import java.io.*;

public class Authenticate
{
  String username;
  ArrayList myimages;
  ArrayList myblocks;
  ArrayList mypoints;
  Connection con;
  int mylevel;
  public  Authenticate()
  {
      username="";
      myimages=new ArrayList();
      myblocks=new ArrayList();
      mypoints=new ArrayList();
      mylevel=-1;
  }
  
  public ArrayList getMyBlocks()
  {
      return(myblocks);
  }
  public ArrayList getMyPoints()
  {
      return(mypoints);
  }
  public int getLevel()
  {
      return(mylevel);
  }
  public boolean isValid(String username)
  {
      try
      {
          con=ConnectionModel.getConnection();
          Statement stmt=con.createStatement();
          ResultSet rs=stmt.executeQuery("select count(*) from cuepoints_registration where loginname like '" + username + "'");
          rs.next();
          int cnt=rs.getInt(1);
          if(cnt>0)
          {
           stmt=con.createStatement();
           //cuepoints varchar2(128),pct1 blob,
// pct2 blob,pct3 blob,pct4 blob,pct5 blob,blocks varchar2(128));
          rs=stmt.executeQuery("select blocks,cuepoints,pct1,pct2,pct3,pct4,pct5,choiceno from cuepoints_registration where loginname like '" + username + "'");
          rs.next();
          myblocks.add(rs.getString(1));
          mypoints.add(rs.getString(2));
          
          //clear previous images from the dump directory
          File f=new File("D:\\dump");
          if(f.exists()==true)
          {
              if(f.isDirectory()==true)
              {
                File []all=f.listFiles();
                for(int i=0;i<all.length;i++)
                    all[i].delete();
              }
          }
          //read image by image and keep inside a temporary directory where images can be saved.
          Blob b;
          long length;
          InputStream is;
          byte []data;
          FileOutputStream fos;
          String file="Selected";
          for(int i=3;i<=7;i++)
          {
              b=rs.getBlob(i);
              if(b != null){
              length=b.length();
              is=b.getBinaryStream();
              data=new byte[(int)length];
              is.read(data);
              fos=new FileOutputStream("D:\\dump\\" + file + "" + i + ".jpg");
              fos.write(data);
              fos.close();
              }
          }
          mylevel=rs.getInt(8);
            
          return(true);
          }
         else
   return(false);
       }
      catch(Exception ex)
      {
                  return(false);
      }
 //return(false);
  }
}
