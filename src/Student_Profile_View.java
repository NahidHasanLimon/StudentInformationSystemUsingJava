
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

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


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drimik
 */
public class Student_Profile_View extends javax.swing.JFrame {
  Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
    /**
     * Creates new form Student_Profile_View
     */
    public Student_Profile_View() {
        initComponents();
        conn=JavaConnectDb.connectrDb();
        showProfile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void showProfile()
    {
        int gotin=employee.empid;
        String gotstring=String.valueOf(gotin);
        String sql="select * from PERSONAL_DETAILS where ID=?";
        try {
        
     

      

            pst= (OraclePreparedStatement) conn.prepareStatement(sql);
          
            pst.setString(1, gotstring);

 

            //Excuting Query

                   rs = (OracleResultSet) pst.executeQuery();
            if(rs.next())
            {
                
                String s1 = rs.getString("ID");
                String s2 = rs.getString("FIRST_NAME");
                String s3 = rs.getString("LAST_NAME");
                String s4 = rs.getString("FATHERS_NAME");
                String s5 = rs.getString("MOTHERS_NAME");
                String s6 = rs.getString("ADDRESS");
                String s7 = rs.getString("RELIGION");
                String s8=  rs.getString("DEPARTMENT");
                String s9=  rs.getString("INTAKE");
                String s10=  rs.getString("SECTION");
                String s11=  rs.getString("AGE");
                String s12=  rs.getString("GENDER");
                String s13=  rs.getString("DOB");
               
                            

 
                

                //Sets Records in TextFields.

            
                  
                  id_text.setText(s1);
                 first_nam_text.setText(s2);
                  last_name_txt.setText(s3);
                  fathers_name_text.setText(s4);
                  mothers_name_text.setText(s5);
                 address_txt.setText(s6);
                  religion_txt.setText(s7);
                  dpt_text.setText(s8);
                  Intake_text.setText(s9);
                  Section_text.setText(s10);
                  Age_Text.setText(s11);
                  GENDER_TEXT.setText(s12);
                  DOB_text.setText(s13);
                    
              
                  
                   
                
                
                
                
                

                

            } else {

                JOptionPane.showMessageDialog(null, "Name not Found");

            }
             //image.setIcon(null);        // TODO add your handling code here:
                 try {
            String sql2 = "select PIC from personal_details where ID=?";
              conn =  JavaConnectDb.connectrDb();
              pst = (OraclePreparedStatement) conn.prepareStatement(sql);
              pst.setString(1,id_text.getText());
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
        
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"got some problem");
        
        }
                // TODO add your handling code here:
    }         
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id_text = new javax.swing.JTextField();
        first_nam_text = new javax.swing.JTextField();
        fathers_name_text = new javax.swing.JTextField();
        mothers_name_text = new javax.swing.JTextField();
        last_name_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        dpt_text = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Intake_text = new javax.swing.JTextField();
        Section_text = new javax.swing.JTextField();
        Age_Text = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DOB_text = new javax.swing.JTextField();
        religion_txt = new javax.swing.JTextField();
        GENDER_TEXT = new javax.swing.JTextField();
        image2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 0, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("ID");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 80, 40));

        jLabel3.setBackground(new java.awt.Color(255, 0, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("First_Name");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 40));

        jLabel4.setBackground(new java.awt.Color(255, 0, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Last_Name");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 90, 40));

        jLabel5.setBackground(new java.awt.Color(255, 0, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Father's Name");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 110, 40));

        jLabel6.setBackground(new java.awt.Color(255, 0, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Mother's Name");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 120, 30));

        jLabel7.setBackground(new java.awt.Color(255, 0, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Address");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, 30));

        jLabel8.setBackground(new java.awt.Color(255, 0, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Religion");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 90, 40));

        id_text.setBackground(new java.awt.Color(204, 204, 255));
        id_text.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        id_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        id_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_textActionPerformed(evt);
            }
        });
        getContentPane().add(id_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 210, 40));

        first_nam_text.setBackground(new java.awt.Color(204, 204, 255));
        first_nam_text.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        first_nam_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        first_nam_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_nam_textActionPerformed(evt);
            }
        });
        getContentPane().add(first_nam_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 210, 40));

        fathers_name_text.setBackground(new java.awt.Color(204, 204, 255));
        fathers_name_text.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        fathers_name_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fathers_name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fathers_name_textActionPerformed(evt);
            }
        });
        getContentPane().add(fathers_name_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 210, 40));

        mothers_name_text.setBackground(new java.awt.Color(204, 204, 255));
        mothers_name_text.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        mothers_name_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mothers_name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mothers_name_textActionPerformed(evt);
            }
        });
        getContentPane().add(mothers_name_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 210, 40));

        last_name_txt.setBackground(new java.awt.Color(204, 204, 255));
        last_name_txt.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        last_name_txt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        last_name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_name_txtActionPerformed(evt);
            }
        });
        getContentPane().add(last_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 210, 40));

        address_txt.setBackground(new java.awt.Color(204, 204, 255));
        address_txt.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        address_txt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        address_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_txtActionPerformed(evt);
            }
        });
        getContentPane().add(address_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 210, 40));

        dpt_text.setBackground(new java.awt.Color(204, 204, 255));
        dpt_text.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        dpt_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dpt_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpt_textActionPerformed(evt);
            }
        });
        getContentPane().add(dpt_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 200, 40));

        jLabel9.setBackground(new java.awt.Color(255, 0, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Department");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 90, 40));

        Intake_text.setBackground(new java.awt.Color(204, 204, 255));
        Intake_text.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Intake_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Intake_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Intake_textActionPerformed(evt);
            }
        });
        getContentPane().add(Intake_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 200, 40));

        Section_text.setBackground(new java.awt.Color(204, 204, 255));
        Section_text.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Section_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Section_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Section_textActionPerformed(evt);
            }
        });
        getContentPane().add(Section_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 200, 40));

        Age_Text.setBackground(new java.awt.Color(204, 204, 255));
        Age_Text.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Age_Text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Age_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Age_TextActionPerformed(evt);
            }
        });
        getContentPane().add(Age_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 190, 40));

        jLabel10.setBackground(new java.awt.Color(255, 0, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setText("Intake");
        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 90, 30));

        jLabel11.setBackground(new java.awt.Color(255, 0, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setText("Section");
        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 90, 30));

        jLabel12.setBackground(new java.awt.Color(255, 0, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setText("Age");
        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 90, 30));

        jLabel13.setBackground(new java.awt.Color(255, 0, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setText("gender");
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 90, 30));

        jLabel14.setBackground(new java.awt.Color(255, 0, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 255));
        jLabel14.setText("DOB");
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 90, 30));

        DOB_text.setBackground(new java.awt.Color(204, 204, 255));
        DOB_text.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        DOB_text.setText("DD-MM-YY");
        DOB_text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DOB_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOB_textActionPerformed(evt);
            }
        });
        getContentPane().add(DOB_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 190, 30));

        religion_txt.setBackground(new java.awt.Color(204, 204, 255));
        religion_txt.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        religion_txt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        religion_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                religion_txtActionPerformed(evt);
            }
        });
        getContentPane().add(religion_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 200, 40));

        GENDER_TEXT.setBackground(new java.awt.Color(204, 204, 255));
        GENDER_TEXT.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        GENDER_TEXT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GENDER_TEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GENDER_TEXTActionPerformed(evt);
            }
        });
        getContentPane().add(GENDER_TEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 190, 40));

        image2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 170, 140));

        jButton1.setFont(new java.awt.Font("Myanmar Text", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 255));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, -1, 33));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_textActionPerformed

    private void first_nam_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_nam_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_nam_textActionPerformed

    private void fathers_name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fathers_name_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fathers_name_textActionPerformed

    private void mothers_name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mothers_name_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mothers_name_textActionPerformed

    private void last_name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_last_name_txtActionPerformed

    private void address_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_txtActionPerformed

    private void dpt_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpt_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpt_textActionPerformed

    private void Intake_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Intake_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Intake_textActionPerformed

    private void Section_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Section_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Section_textActionPerformed

    private void Age_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Age_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Age_TextActionPerformed

    private void DOB_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOB_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOB_textActionPerformed

    private void religion_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_religion_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_religion_txtActionPerformed

    private void GENDER_TEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GENDER_TEXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GENDER_TEXTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Student_Welcome_form swf= new Student_Welcome_form();
        swf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Profile_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Profile_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Profile_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Profile_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Profile_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age_Text;
    private javax.swing.JTextField DOB_text;
    private javax.swing.JTextField GENDER_TEXT;
    private javax.swing.JTextField Intake_text;
    private javax.swing.JTextField Section_text;
    private javax.swing.JTextField address_txt;
    private javax.swing.JTextField dpt_text;
    private javax.swing.JTextField fathers_name_text;
    private javax.swing.JTextField first_nam_text;
    private javax.swing.JTextField id_text;
    private javax.swing.JLabel image2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField last_name_txt;
    private javax.swing.JTextField mothers_name_text;
    private javax.swing.JTextField religion_txt;
    // End of variables declaration//GEN-END:variables
String Filename=null;
int s=0;
byte[] person_image=null;
private  ImageIcon format=null;}

