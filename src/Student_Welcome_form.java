
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import static java.lang.String.format;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drimik
 */
public class Student_Welcome_form extends javax.swing.JFrame {
      Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
    
    public Student_Welcome_form() {
        initComponents();
    jLabel_name_D.setText(employee.Empstring);
    CurrentDate();
    JFrame a= new JFrame("Student_Welcome_form");
    a.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
   showimage();
       
         //getname();
    }
  
    public void CurrentDate()
{
    Calendar cal= new GregorianCalendar();
    int month= cal.get(Calendar.MONTH);
    int day=cal.get(Calendar.DAY_OF_MONTH);
    int year=cal.get(Calendar.YEAR);
   label_dat.setText((month+1)+"/"+day+"/"+year);
   int second= cal.get(Calendar.SECOND);
   int minute=cal.get(Calendar.MINUTE);
   int hour=cal.get(Calendar.HOUR);
   label_time.setText(hour+":"+minute+":"+second);

}
    public void showimage()
    {
        int got=employee.empid;
        String gotstring=String.valueOf(got);
         String sql="select * from PERSONAL_DETAILS where ID=?";
         try {
            String sql2 = "select PIC from personal_details where ID=?";
              conn =  JavaConnectDb.connectrDb();
              pst = (OraclePreparedStatement) conn.prepareStatement(sql);
              pst.setString(1,gotstring);
              rs=(OracleResultSet) pst.executeQuery();
              
                
              if(rs.next())
              {
                
             byte [] imagedata = rs.getBytes("pic") ;
             BufferedImage buff_image=ImageIO.read(new ByteArrayInputStream(imagedata));
               format = new ImageIcon(buff_image);
             image2.setIcon(format);
             
             
              }
        } catch (Exception e) {
            e.printStackTrace();
        }
                
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   /* public void  getname()
  {
      
      String getid=String.valueOf(employee.empid);
      String sql="select * from login where id=?";
        conn = JavaConnectDb.connectrDb();
      try {
      pst=(OraclePreparedStatement) conn.prepareStatement(sql);
      pst.setString(1,getid);
      rs=(OracleResultSet) pst.executeQuery();
      while(rs.next())
      {
       String value=rs.getString("name");
       jLabel_Name_display.setText(value);
      }
  
     
      
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e);
      }
    
      finally{try {
              rs.close();
              conn.close();
          } catch (Exception e) {
          }
}
    
            
    }
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Name_d = new javax.swing.JLabel();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jLabel_name_D = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_result = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jB_logout = new javax.swing.JButton();
        image2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        label_dat = new javax.swing.JMenu();
        label_time = new javax.swing.JMenu();

        jLabel_Name_d.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel_Name_d.setForeground(new java.awt.Color(255, 0, 255));
        jLabel_Name_d.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51), 3));

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_name_D.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_name_D.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_name_D.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 5));
        getContentPane().add(jLabel_name_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 270, 60));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Welcome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 110, 50));

        jButton_result.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jButton_result.setForeground(new java.awt.Color(153, 51, 255));
        jButton_result.setText("Result");
        jButton_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_resultActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_result, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 130, 60));

        jButton2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 51, 255));
        jButton2.setText("Fee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 130, 60));

        jButton3.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 51, 255));
        jButton3.setText("Course");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 130, 60));

        jButton4.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 51, 255));
        jButton4.setText("Profile");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 130, 60));

        jB_logout.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jB_logout.setForeground(new java.awt.Color(204, 0, 204));
        jB_logout.setText("Logout");
        jB_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(jB_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 120, 50));

        image2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 3, true));
        getContentPane().add(image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 150, 140));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        label_dat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));
        label_dat.setText("Date");
        jMenuBar1.add(label_dat);

        label_time.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 5));
        label_time.setForeground(new java.awt.Color(255, 0, 51));
        label_time.setText("Time");
        jMenuBar1.add(label_time);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_logoutActionPerformed
        // TODO add your handling code here:
        login_2  c= new login_2();
        c.setVisible(true);
        this.dispose();
        try {
            Date curreDate=GregorianCalendar.getInstance().getTime();
            DateFormat df= DateFormat.getDateInstance();
            String dateString=df.format(curreDate);
            Date d= new Date();
            SimpleDateFormat sdf= new SimpleDateFormat("HH:MM:SS");
            String timeString=sdf.format(d);
            String valueo=timeString;
            String values =dateString;
            int value=employee.empid;
            String valuetype=employee.Empstring;
            String reg="INSERT INTO AUDIT_TABLE(TYPE,EMP_ID,DATE_USE,STATUS) VALUES ('"+valuetype+ "','"+value+ "','"+valueo+" / "+values+"','logged out' )";
            pst=(OraclePreparedStatement) conn.prepareStatement(reg);
            pst.executeQuery();
        } catch (Exception e) {
        }
        finally{try {
            rs.close();
            pst.close();
        } catch (Exception e) {
        }
        }
    }//GEN-LAST:event_jB_logoutActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Student_Profile_View spv=new Student_Profile_View();
        spv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Assigned_Course_View acv=new Assigned_Course_View();
       acv.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        student_fees_view sfv2=new  student_fees_view();
        sfv2.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_resultActionPerformed
Student_Result_View srv=new Student_Result_View();
srv.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton_resultActionPerformed
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student_Welcome_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Welcome_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Welcome_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Welcome_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Welcome_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image2;
    private javax.swing.JButton jB_logout;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_result;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel_Name_d;
    private javax.swing.JLabel jLabel_name_D;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JMenu label_dat;
    private javax.swing.JMenu label_time;
    // End of variables declaration//GEN-END:variables
String Filename=null;
int s=0;
byte[] person_image=null;
private  ImageIcon format=null;
}
