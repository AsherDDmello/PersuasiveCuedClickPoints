
package cuepoints_picture;


import cuelayer.PickupCupPoints;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
import cuelayer.ConnectionModel;
import cuelayer.ConnectionModel;


public class Forgot_Password extends javax.swing.JFrame implements MouseListener{

    int choiceno;
    String block="";
    String filename="";
    static int MAX;
    static int approved;
    ArrayList pctcollection;
    ArrayList blockcollection;
    ArrayList cuepointscollection;
    public int CHOICENO;
    
 
    String QUESTION;
    String ANSWER;
    Registration_Forgot reg;
    
    public Forgot_Password() {
         MAX=5;
         
         initComponents();
       lblCount.setText("" + (MAX-approved));
        pctcollection=new ArrayList();
        cuepointscollection=new ArrayList();
        blockcollection=new ArrayList();
       /* jLabel10.setVisible(false);
        jLabel6.setVisible(false);*/
        jLabel9.setVisible(false);
    }
    public  Forgot_Password(int choiceno)
    {
        CHOICENO=choiceno;
        MAX=5;
         this.choiceno=choiceno;
         if(choiceno==3)
         this.choiceno+=13;
         else
             if(choiceno==4)
                 this.choiceno+=16;
         else
                 this.choiceno+=35;
        initComponents();
       lblCount.setText("" + (MAX-approved));
        pctcollection=new ArrayList();
        cuepointscollection=new ArrayList();
             blockcollection=new ArrayList();
   
        /*jLabel10.setVisible(false);
        jLabel6.setVisible(false);*/
        jLabel9.setVisible(false);    
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCount = new javax.swing.JLabel();
        cuepoint = new javax.swing.JLabel();
        txtLoginName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAnwer = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        lblQuestionName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cuepoints_picture.CuePoints_PictureApp.class).getContext().getResourceMap(Forgot_Password.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setBounds(new java.awt.Rectangle(20, 20, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1325, 700));
        setName("Form"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        lblCount.setFont(resourceMap.getFont("lblCount.font")); // NOI18N
        lblCount.setForeground(resourceMap.getColor("lblCount.foreground")); // NOI18N
        lblCount.setName("lblCount"); // NOI18N
        getContentPane().add(lblCount);
        lblCount.setBounds(1270, 10, 30, 30);

        cuepoint.setFont(resourceMap.getFont("cuepoint.font")); // NOI18N
        cuepoint.setForeground(resourceMap.getColor("cuepoint.foreground")); // NOI18N
        cuepoint.setName("cuepoint"); // NOI18N
        getContentPane().add(cuepoint);
        cuepoint.setBounds(830, 600, 130, 30);

        txtLoginName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtLoginName.setName("txtLoginName"); // NOI18N
        txtLoginName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLoginName);
        txtLoginName.setBounds(380, 100, 220, 30);

        jLabel3.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel3.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 100, 150, 15);

        jLabel7.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel7.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(210, 200, 190, 15);

        jLabel8.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel8.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 250, 180, 17);

        txtAnwer.setBackground(resourceMap.getColor("txtAnwer.background")); // NOI18N
        txtAnwer.setForeground(resourceMap.getColor("txtAnwer.foreground")); // NOI18N
        txtAnwer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtAnwer.setName("txtAnwer"); // NOI18N
        txtAnwer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnwerActionPerformed(evt);
            }
        });
        getContentPane().add(txtAnwer);
        txtAnwer.setBounds(380, 230, 320, 30);

        jLabel9.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
        jLabel9.setForeground(resourceMap.getColor("jLabel9.foreground")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(750, 10, 450, 40);

        jLabel11.setName("jLabel11"); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(470, 60, 110, 80);

        jLabel12.setName("jLabel12"); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(470, 150, 110, 80);

        jLabel14.setName("jLabel14"); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(470, 330, 110, 80);

        jLabel15.setName("jLabel15"); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(470, 420, 110, 80);

        jLabel1.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setToolTipText(resourceMap.getString("jLabel1.toolTipText")); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(1317, 700));
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 670);

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel16.setFont(resourceMap.getFont("jLabel16.font")); // NOI18N
        jLabel16.setForeground(resourceMap.getColor("jLabel16.foreground")); // NOI18N
        jLabel16.setText(resourceMap.getString("jLabel16.text")); // NOI18N
        jLabel16.setName("jLabel16"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addContainerGap(723, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1320, 60);

        jButton5.setBackground(resourceMap.getColor("jButton5.background")); // NOI18N
        jButton5.setText(resourceMap.getString("jButton5.text")); // NOI18N
        jButton5.setName("jButton5"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(290, 290, 150, 30);

        jButton6.setBackground(resourceMap.getColor("jButton6.background")); // NOI18N
        jButton6.setText(resourceMap.getString("jButton6.text")); // NOI18N
        jButton6.setName("jButton6"); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(640, 100, 150, 30);

        lblQuestionName.setFont(resourceMap.getFont("lblQuestionName.font")); // NOI18N
        lblQuestionName.setForeground(resourceMap.getColor("lblQuestionName.foreground")); // NOI18N
        lblQuestionName.setText(resourceMap.getString("lblQuestionName.text")); // NOI18N
        lblQuestionName.setName("lblQuestionName"); // NOI18N
        getContentPane().add(lblQuestionName);
        lblQuestionName.setBounds(380, 200, 280, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     // TODO add your handling code here:
        String anser=txtAnwer.getText();
        if(ANSWER.equalsIgnoreCase(anser))
        {
             try {
              
                  Connection conn=ConnectionModel.getConnection();
                  Statement stmt=conn.createStatement();
                  ResultSet rs=stmt.executeQuery("select FULLNAME,LOGINNAME,ROLE,QUESTION,ANSWER,CHOICENO from CUEPOINTS_REGISTRATION where loginname='"+txtLoginName.getText()+"'");
                  
                  while(rs.next())
                  {
                      String FULLNAME=rs.getString("FULLNAME");
                      String LOGINNAME=rs.getString("LOGINNAME");
                      String ROLE=rs.getString("ROLE");
                      String QUESTION=rs.getString("QUESTION");
                      String ANSWER=rs.getString("ANSWER");
                      int CHOICENO=rs.getInt("CHOICENO");
                      reg=new Registration_Forgot(FULLNAME,LOGINNAME,ROLE,QUESTION,ANSWER,CHOICENO);
                      this.setVisible(false);
                      reg.setVisible(true);
                      
                  }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
              }
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtAnwerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnwerActionPerformed

        
        
         String anser=txtAnwer.getText();
         
        if(QUESTION.equalsIgnoreCase(anser))
        {
             try {
              
                  Connection conn=ConnectionModel.getConnection();
                  Statement stmt=conn.createStatement();
                  ResultSet rs=stmt.executeQuery("select FULLNAME,LOGINNAME,ROLE,QUESTION,ANSWER,CHOICENO from CUEPOINTS_REGISTRATION where loginname='"+txtLoginName.getText()+"'");
                  
                  while(rs.next())
                  {
                      String FULLNAME=rs.getString("FULLNAME");
                      String LOGINNAME=rs.getString("LOGINNAME");
                      String ROLE=rs.getString("ROLE");
                      String QUESTION=rs.getString("QUESTION");
                      String ANSWER=rs.getString("ANSWER");
                      int CHOICENO=rs.getInt("CHOICENO");
                      Registration registeration=new Registration(FULLNAME,LOGINNAME,ROLE,QUESTION,ANSWER,CHOICENO);
                      this.setVisible(false);
                      registeration.setVisible(true);
                      
                  }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
              }
        }
    }//GEN-LAST:event_txtAnwerActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        if(txtLoginName.getText().equals(""))
        {
              JOptionPane.showMessageDialog(this,"Plz Enter the Login Name");
        }
        else
        {
            try {
            Connection conn=ConnectionModel.getConnection();
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select  QUESTION,ANSWER from CUEPOINTS_REGISTRATION where loginname='"+txtLoginName.getText()+"'");
            while(rs.next())
            {
               QUESTION=rs.getString("QUESTION");
               ANSWER=rs.getString("ANSWER");
//               jTextField4.setText(QUESTION);   
               lblQuestionName.setText(QUESTION);
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        }
           
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtLoginNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginNameActionPerformed
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Forgot_Password().setVisible(true);
                
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cuepoint;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblQuestionName;
    private javax.swing.JTextField txtAnwer;
    private javax.swing.JTextField txtLoginName;
    // End of variables declaration//GEN-END:variables

    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}