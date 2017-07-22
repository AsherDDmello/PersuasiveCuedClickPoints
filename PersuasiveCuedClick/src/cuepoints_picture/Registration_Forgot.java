
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


public class Registration_Forgot extends javax.swing.JFrame implements MouseListener{

    int choiceno;
    String block="";
    String filename="";
    static int MAX;
    static int approved;
    ArrayList pctcollection;
    ArrayList blockcollection;
    ArrayList cuepointscollection;
    public int CHOICENO;
    
    String FULLNAME;
    String LOGINNAME;
    String ROLE;
    String QUESTION;
    String ANSWER;
    
    /** Creates new form RegistrationFrame */
    public Registration_Forgot() {
         MAX=5;
         
         initComponents();
       lblCount.setText("" + (MAX-approved));
        pctcollection=new ArrayList();
        cuepointscollection=new ArrayList();
        blockcollection=new ArrayList();
       
        jLabel9.setVisible(false);
    }
    public  Registration_Forgot(String Fullname,String LoginName,String Role,String Question,String Answer,int choiceno)
    {
        FULLNAME=Fullname;
        LOGINNAME=LoginName;
        ROLE=Role;
        QUESTION=Question;
        ANSWER=Answer;
        this.choiceno=choiceno;
        MAX=5;
         this.choiceno=choiceno;
         if(choiceno==16)
         {
//             choiceno=3;
//              if(choiceno==3)
             this.choiceno=16;
         }
          else
         {
             
             if(choiceno==20)
             {
//                 choiceno=4;
//                 if(choiceno==4)
                 this.choiceno=20;
             }
             else
             {
                  this.choiceno=40;
             }
         }
        // if(choiceno==3)
         //this.choiceno+=13;
        /* else
             if(choiceno==4)
                 this.choiceno+=16;
         else
                 this.choiceno+=35;*/
        initComponents();
       lblCount.setText("" + (MAX-approved));
        pctcollection=new ArrayList();
        cuepointscollection=new ArrayList();
             blockcollection=new ArrayList();
   
    
        jLabel9.setVisible(false);    
        
        jTextField1.setText(LOGINNAME);     
        jTextField1.setEditable(false);
        jTextField2.setText(FULLNAME);   
        jTextField2.setEditable(false);
        jTextField3.setText(ROLE);
        jTextField3.setEditable(false);
        jTextField4.setText(QUESTION);
        jTextField4.setEditable(false);
        jTextField5.setText(ANSWER);    
        jTextField5.setEditable(false);
    }
    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblCount = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cuepoint = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cuePointsIP = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(cuepoints_picture.CuePoints_PictureApp.class).getContext().getResourceMap(Registration_Forgot.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setBounds(new java.awt.Rectangle(20, 20, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1325, 700));
        setName("Form"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(resourceMap.getFont("jButton3.font")); // NOI18N
        jButton1.setForeground(resourceMap.getColor("jButton1.foreground")); // NOI18N
        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 520, 120, 50);

        jButton2.setFont(resourceMap.getFont("jButton3.font")); // NOI18N
        jButton2.setForeground(resourceMap.getColor("jButton2.foreground")); // NOI18N
        jButton2.setIcon(resourceMap.getIcon("jButton2.icon")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 520, 100, 50);

        lblCount.setFont(resourceMap.getFont("lblCount.font")); // NOI18N
        lblCount.setForeground(resourceMap.getColor("lblCount.foreground")); // NOI18N
        lblCount.setName("lblCount"); // NOI18N
        getContentPane().add(lblCount);
        lblCount.setBounds(1270, 10, 30, 30);

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setAutoscrolls(true);
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(630, 80, 640, 480);

        cuepoint.setFont(resourceMap.getFont("cuepoint.font")); // NOI18N
        cuepoint.setForeground(resourceMap.getColor("cuepoint.foreground")); // NOI18N
        cuepoint.setName("cuepoint"); // NOI18N
        getContentPane().add(cuepoint);
        cuepoint.setBounds(830, 600, 130, 30);

        jButton3.setFont(resourceMap.getFont("jButton3.font")); // NOI18N
        jButton3.setForeground(resourceMap.getColor("jButton3.foreground")); // NOI18N
        jButton3.setIcon(resourceMap.getIcon("jButton3.icon")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 520, 120, 50);

        jButton4.setFont(resourceMap.getFont("jButton3.font")); // NOI18N
        jButton4.setIcon(resourceMap.getIcon("jButton4.icon")); // NOI18N
        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.setMinimumSize(new java.awt.Dimension(115, 50));
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1170, 600, 110, 50);

        jLabel2.setBackground(resourceMap.getColor("jLabel2.background")); // NOI18N
        jLabel2.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel2.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 150, 130, 15);

        jTextField1.setBackground(resourceMap.getColor("jTextField5.background")); // NOI18N
        jTextField1.setFont(resourceMap.getFont("jTextField3.font")); // NOI18N
        jTextField1.setForeground(resourceMap.getColor("jTextField5.foreground")); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField1.setName("txtLoginName"); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(100, 100, 220, 30);

        jLabel3.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel3.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 150, 15);

        jTextField2.setBackground(resourceMap.getColor("jTextField5.background")); // NOI18N
        jTextField2.setFont(resourceMap.getFont("jTextField3.font")); // NOI18N
        jTextField2.setForeground(resourceMap.getColor("jTextField5.foreground")); // NOI18N
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField2.setName("jTextField2"); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(100, 140, 220, 30);

        jLabel4.setBackground(resourceMap.getColor("jLabel5.background")); // NOI18N
        jLabel4.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel4.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 180, 90, 15);

        jTextField3.setBackground(resourceMap.getColor("jTextField5.background")); // NOI18N
        jTextField3.setFont(resourceMap.getFont("jTextField3.font")); // NOI18N
        jTextField3.setForeground(resourceMap.getColor("jTextField5.foreground")); // NOI18N
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField3.setName("jTextField3"); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(100, 180, 220, 30);

        jLabel5.setBackground(resourceMap.getColor("jLabel5.background")); // NOI18N
        jLabel5.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel5.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 220, 210, 15);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        cuePointsIP.setBackground(resourceMap.getColor("jTextField5.background")); // NOI18N
        cuePointsIP.setColumns(20);
        cuePointsIP.setForeground(resourceMap.getColor("jTextField5.foreground")); // NOI18N
        cuePointsIP.setRows(5);
        cuePointsIP.setBorder(new javax.swing.border.LineBorder(null, 1, true));
        cuePointsIP.setName("cuePointsIP"); // NOI18N
        jScrollPane1.setViewportView(cuePointsIP);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 240, 400, 100);

        jLabel7.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel7.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 380, 190, 15);

        jTextField4.setBackground(resourceMap.getColor("jTextField5.background")); // NOI18N
        jTextField4.setFont(resourceMap.getFont("jTextField3.font")); // NOI18N
        jTextField4.setForeground(resourceMap.getColor("jTextField5.foreground")); // NOI18N
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField4.setName("jTextField4"); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(20, 400, 320, 30);

        jLabel8.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel8.setForeground(resourceMap.getColor("jLabel8.foreground")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 440, 180, 17);

        jTextField5.setBackground(resourceMap.getColor("jTextField5.background")); // NOI18N
        jTextField5.setFont(resourceMap.getFont("jTextField3.font")); // NOI18N
        jTextField5.setForeground(resourceMap.getColor("jTextField5.foreground")); // NOI18N
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField5.setName("jTextField5"); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(20, 460, 320, 30);

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

        jLabel13.setName("jLabel13"); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(470, 240, 110, 80);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        //write logic of saving data of the user including pictures and cuepoints selected by him
        PickupCupPoints pcp=new PickupCupPoints(pctcollection,cuepointscollection,blockcollection);
        boolean result=pcp.updateData(jTextField1.getText(),jTextField2.getText(),jTextField3.getText(),jTextField4.getText(),jTextField5.getText());
        if(result)
        {
           
           /* jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel13.setVisible(false);
            jLabel14.setVisible(false);
            jLabel15.setVisible(false);
           */ 
          
           jLabel9.setVisible(true);
            jLabel9.setText(""+" UPDATE SUCCESSFULL");
            jLabel9.setForeground(Color.green);
            JOptionPane.showMessageDialog(this,"Your Password Has been Reset Successfully");
            JOptionPane.showMessageDialog(this,"WELCOME TO YOUR ACCOUNT");
            useraccount mm=new useraccount();
        this.setVisible(false);
      
        mm.setVisible(true);
            //JOptionPane.showMessageDialog(this,"Registration Successfully Done");
         
        }
        else
        {
            JOptionPane.showMessageDialog(this,"oops..! something is missing.. please ensure that registration form and images are completed ");
            
            jLabel9.setText("INCOMPLETE REGISTRATION"+"");
            jLabel9.setForeground(Color.BLACK);
           
            jLabel9.setVisible(true);
            
            
          
            //JOptionPane.showMessageDialog(this,"Not Successfully Registered");
        }
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MainMenu mm=new MainMenu();
        this.setVisible(false);
      
        mm.setVisible(true);
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         pctcollection.add(filename);
        cuepointscollection.add(cuepoint.getText());
        blockcollection.add(block); 
        
        approved++;
        lblCount.setText("" + (MAX-approved));
        if(approved>=MAX) {
            JOptionPane.showMessageDialog(this,"Your Images are over For CuePoints");
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            return;
        }
        else
        updateCuePoints();
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         JFileChooser jfc=new JFileChooser();
        FileNameExtensionFilter ext=new FileNameExtensionFilter("Image Files", "JPG");
        jfc.setFileFilter(ext);
        int rc=jfc.showOpenDialog(this);
        if(rc==JFileChooser.APPROVE_OPTION) 
        {
            filename=jfc.getSelectedFile().getAbsolutePath();
            ImageLabel imglbl=new ImageLabel(0,0,jPanel2.getBounds().height,jPanel2.getBounds().width,choiceno,filename);
            JOptionPane.showMessageDialog(this,imglbl.toString());
            jPanel2.removeAll();
        imglbl.revalidate();
        imglbl.repaint();
        imglbl.addMouseListener(this);
        jPanel2.add(imglbl); 
        
        //imgLbl.addMouseListener(this);
       // jPanel2.add(getMyLines(0,0,jPanel2.getBounds().height,jPanel2.getBounds().width,choiceno,filename));
        jPanel2.revalidate();
        jPanel2.repaint();
        //revalidate();
        repaint();
       
        }
        if(rc==JFileChooser.APPROVE_OPTION)
          
                {
   filename=jfc.getSelectedFile().getAbsolutePath();
            ImageIcon ic=new ImageIcon(jfc.getSelectedFile().getAbsolutePath());
                    Image img1=ic.getImage();
            Image modified1= img1.getScaledInstance(110,80, 2);
            ic=new ImageIcon(modified1);
            
            if((MAX-approved)==5){
                
            jLabel11.setIcon(ic);
            }
            else if((MAX-approved)==4){
                
                 jLabel12.setIcon(ic);
            }
            else if((MAX-approved)==3){
                
                 jLabel13.setIcon(ic);
            }
            else if((MAX-approved)==2){
                
                 jLabel14.setIcon(ic);
            }
            else if((MAX-approved)==1){
                
                 jLabel15.setIcon(ic);
            }
                }
        
    }
     public void mouseClicked(MouseEvent e)
    {
       // JOptionPane.showMessageDialog(this, "hi");
  
        cuepoint.setText(e.getX() + "," + e.getY());
     }
    public void mouseEntered(MouseEvent e)
    {
        //JOptionPane.showMessageDialog(this, "hi");
    }
    public void mouseExited(MouseEvent e)
    {
        //JOptionPane.showMessageDialog(this, "hi");
    }
    public void mousePressed(MouseEvent e)
    {
        Point p=e.getLocationOnScreen();
  block=getCodeforClick(p);
   System.out.println("Block coordinates " + block);
  /*        
        //JOptionPane.showMessageDialog(this, "pwid:"+pWid+" phei:"+pHei);
        Point p=e.getLocationOnScreen();
        //JOptionPane.showMessageDialog(this, "hi:"+p.x+" "+p.y);
        String code=getCodeforClick(p);
  //      txtOutput.setText(txtOutput.getText()+code);
         * */
    }
    public void mouseReleased(MouseEvent e)
    {
        //JOptionPane.showMessageDialog(this, "hi");
    }
    private void updateCuePoints()
    {

        cuePointsIP.setText("");
     for(int i=0;i<pctcollection.size();i++)
     {
         cuePointsIP.append(pctcollection.get(i) + "#" + cuepointscollection.get(i) +"\r\n");
     }
    
    }

    private String getCodeforClick(Point p)
    {
       // JOptionPane.showMessageDialog(this, "Panel x:"+pnl.getBounds().x+" y:"+pnl.getBounds().y);
        int dx=jPanel2.getBounds().x-this.getBounds().x+6;
        int dy=90;
        System.out.println(dx+" "+dy);
       
        int x=p.x-dx;
        int y=p.y-dy;
        //JOptionPane.showMessageDialog(this, "point x:"+x+" y:"+p.y+"\npwid:"+pWid+" phei+"+pHei);
        
        String code="";
        for(int i=1;i<=choiceno+2;i++)
        {
            if(x<((jPanel2.getBounds().getWidth()/choiceno)*i))
            {
            code+=choiceno+""+i;
            break;
            }
         }
        for(int i=1;i<=choiceno+2;i++)
        {
         if(y<((jPanel2.getBounds().getHeight()/choiceno)*i))
            {
            code+=choiceno+""+i;
            break;
            }
        }
      //JOptionPane.showMessageDialog(this, "grid no:"+code);
        return code;
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Registration_Forgot().setVisible(true);
                
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cuePointsIP;
    private javax.swing.JLabel cuepoint;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblCount;
    // End of variables declaration//GEN-END:variables
}