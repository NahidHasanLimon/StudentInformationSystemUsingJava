
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import static java.lang.String.format;
import java.sql.Connection;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.html.HTML;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drimik
 */
public class ADD_FACULTY extends javax.swing.JFrame {
  Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
   
    public ADD_FACULTY() {
        initComponents();
        conn=JavaConnectDb.connectrDb();
          jdate_text.setText("numeric");  
    }
  public ImageIcon ResizeImage(String ImagePath)
    {
      ImageIcon MyImage= new ImageIcon(ImagePath);
      Image img = MyImage.getImage();
      Image newImg= img.getScaledInstance(image.getWidth(),image.getHeight(),Image.SCALE_SMOOTH);
      ImageIcon image= new ImageIcon(newImg);
      return image;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Department = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id_text = new javax.swing.JTextField();
        first_nam_text = new javax.swing.JTextField();
        fathers_name_text = new javax.swing.JTextField();
        mothers_name_text = new javax.swing.JTextField();
        last_name_txt = new javax.swing.JTextField();
        Age_Text = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DOB_text = new javax.swing.JTextField();
        religion_txt = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        address_txt1 = new javax.swing.JTextField();
        image = new javax.swing.JLabel();
        address_txt = new javax.swing.JTextField();
        dpt_text = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Department1 = new javax.swing.JLabel();
        qualification_text = new javax.swing.JTextField();
        Department2 = new javax.swing.JLabel();
        salary_text = new javax.swing.JTextField();
        Department3 = new javax.swing.JLabel();
        jdate_text = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Faculty_ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 130, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("First_Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Last_Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 130, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Father's Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, 40));

        Department.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Department.setText("Department");
        getContentPane().add(Department, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, 38));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("Religion");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 90, 38));

        id_text.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        id_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_textActionPerformed(evt);
            }
        });
        getContentPane().add(id_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 190, 30));

        first_nam_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        first_nam_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_nam_textActionPerformed(evt);
            }
        });
        getContentPane().add(first_nam_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 190, 30));

        fathers_name_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fathers_name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fathers_name_textActionPerformed(evt);
            }
        });
        getContentPane().add(fathers_name_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 190, 30));

        mothers_name_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mothers_name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mothers_name_textActionPerformed(evt);
            }
        });
        getContentPane().add(mothers_name_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 190, 30));

        last_name_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        last_name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_name_txtActionPerformed(evt);
            }
        });
        getContentPane().add(last_name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, 30));

        Age_Text.setText("iiii");
        Age_Text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Age_Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Age_TextMouseClicked(evt);
            }
        });
        Age_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Age_TextActionPerformed(evt);
            }
        });
        Age_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Age_TextKeyPressed(evt);
            }
        });
        getContentPane().add(Age_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 110, 31));

        jLabel12.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel12.setText("Age");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 90, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel13.setText("gender");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 80, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel14.setText("ADDRESS");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 100, 30));

        DOB_text.setText("DD-MM-YY");
        DOB_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DOB_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOB_textActionPerformed(evt);
            }
        });
        getContentPane().add(DOB_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 210, 30));

        religion_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        religion_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                religion_txtActionPerformed(evt);
            }
        });
        getContentPane().add(religion_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 190, 30));

        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButton1.setText("Male");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseReleased(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 100, -1));

        jRadioButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 90, -1));

        address_txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_txt1ActionPerformed(evt);
            }
        });
        getContentPane().add(address_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 203, 30));

        image.setBackground(new java.awt.Color(0, 0, 0));
        image.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        image.setForeground(new java.awt.Color(255, 153, 153));
        image.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 255, 0), new java.awt.Color(0, 102, 51)));
        image.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 220, 160));

        address_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        address_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_txtActionPerformed(evt);
            }
        });
        getContentPane().add(address_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 170, 102));

        dpt_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dpt_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpt_textActionPerformed(evt);
            }
        });
        getContentPane().add(dpt_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 170, 40));

        jButton3.setText("Display");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, 50));

        jButton2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, 100, 50));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Drimik\\Documents\\ICON\\error.jpg")); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1002, 33, 50, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 255));
        jButton1.setText("Choose");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, 170, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setText("Mother's Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, 40));

        Department1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Department1.setText("Qualifiaction");
        getContentPane().add(Department1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, 38));

        qualification_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        qualification_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualification_textActionPerformed(evt);
            }
        });
        getContentPane().add(qualification_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 170, 40));

        Department2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Department2.setText("Basic_Salary");
        getContentPane().add(Department2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 85, 38));

        salary_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salary_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salary_textActionPerformed(evt);
            }
        });
        getContentPane().add(salary_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 170, 40));

        Department3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Department3.setText("Joining Date");
        getContentPane().add(Department3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 85, 38));

        jdate_text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdate_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdate_textActionPerformed(evt);
            }
        });
        getContentPane().add(jdate_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 170, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel15.setText("DOB");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 100, 30));

        jLabel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 4), "Add Faculty", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 820, 510));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3), "Button", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(51, 0, 255))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 550, 20));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 3), "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(255, 0, 102))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 510));

        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 3), "Academic Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(255, 0, 102))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 340, 240));

        jButton6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 51));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 580, 110, 50));

        jButton7.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 51));
        jButton7.setText("EXIT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 110, 50));

        setSize(new java.awt.Dimension(854, 638));
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

    private void Age_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Age_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Age_TextActionPerformed

    private void DOB_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOB_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOB_textActionPerformed

    private void religion_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_religion_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_religion_txtActionPerformed

    private void jRadioButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1MouseReleased

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        ;  // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void address_txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_txt1ActionPerformed

    private void address_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_txtActionPerformed

    private void dpt_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpt_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpt_textActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        image.setIcon(null);        // TODO add your handling code here:
        try {
            String sql = "select PIC from faculty_details where ID=?";
            conn =  JavaConnectDb.connectrDb();
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,id_text.getText());
            rs=(OracleResultSet) pst.executeQuery();

            if(rs.next())
            {

                byte [] imagedata = rs.getBytes("pic") ;
                BufferedImage buff_image=ImageIO.read(new ByteArrayInputStream(imagedata));
                format = new ImageIcon(buff_image);
                image.setIcon(format);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try{
            String sql = "INSERT INTO faculty_details"
            +"(F_ID,first_name,last_name,fathers_name,mothers_name,address,religion,department,age,gender,dob,pic,qualification,basic_salary,joining_date)"
            +"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            conn =  JavaConnectDb.connectrDb();
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1,id_text.getText());
            pst.setString(2,first_nam_text.getText());
            pst.setString(3,last_name_txt.getText());
            pst.setString(4,fathers_name_text.getText());
            pst.setString(5, mothers_name_text.getText());
            pst.setString(6, address_txt.getText());
            pst.setString(7, religion_txt.getText());
            pst.setString(8,dpt_text.getText());
           

          
            pst.setString(9,Age_Text.getText());
            if(jRadioButton1.isSelected())
            {pst.setString(10,"Male");}

            if(jRadioButton2.isSelected())
            { pst.setString(10,"Female");
            }

            pst.setString(11,DOB_text.getText());
            try {
                  pst.setBytes(12, person_image);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, image);
            }
          
            pst.setString(13,qualification_text.getText());
             pst.setString(14,salary_text.getText());
             pst.setString(15,jdate_text.getText());
             
            //pst.executeUpdate();
            try {
                      pst.executeQuery();
                       JOptionPane.showMessageDialog(null, "inserted successfully");
                      
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
      

            JOptionPane OptionPane=JOptionPane();

           

        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null,"check the constraint ID must be DIGIT  ");

        }
        
                   finally{
                       try {
                           rs.close();
                           pst.close();
                       } catch (Exception e) {
                       }
                   }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser chooser= new JFileChooser();
        chooser.showOpenDialog(null);
        File f=  chooser.getSelectedFile();
        int Result = 0;
        if(Result==JFileChooser.APPROVE_OPTION)
        {

            Filename= f.getAbsolutePath();
            address_txt1.setText(Filename);
            image.setIcon(ResizeImage(Filename));
        }

            
        } catch (Exception e) {
        }
        
        try{

            File image=new File (Filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf= new byte[1024];
            for(int readNum ;(readNum = fis.read(buf))!=-1;)

            {
                bos.write(buf,0,readNum);
            }
            person_image= bos.toByteArray();

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void qualification_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualification_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qualification_textActionPerformed

    private void salary_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salary_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salary_textActionPerformed

    private void jdate_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdate_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdate_textActionPerformed

    private void Age_TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Age_TextMouseClicked
  jdate_text.setText("");  
  Age_Text.setText("");
 // TODO add your handling code here:
    }//GEN-LAST:event_Age_TextMouseClicked

    private void Age_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Age_TextKeyPressed
        jdate_text.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_Age_TextKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 student_main_form st1=new student_main_form();
        st1.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(ADD_FACULTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADD_FACULTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADD_FACULTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADD_FACULTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADD_FACULTY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age_Text;
    private javax.swing.JTextField DOB_text;
    private javax.swing.JLabel Department;
    private javax.swing.JLabel Department1;
    private javax.swing.JLabel Department2;
    private javax.swing.JLabel Department3;
    private javax.swing.JTextField address_txt;
    private javax.swing.JTextField address_txt1;
    private javax.swing.JTextField dpt_text;
    private javax.swing.JTextField fathers_name_text;
    private javax.swing.JTextField first_nam_text;
    private javax.swing.JTextField id_text;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jdate_text;
    private javax.swing.JTextField last_name_txt;
    private javax.swing.JTextField mothers_name_text;
    private javax.swing.JTextField qualification_text;
    private javax.swing.JTextField religion_txt;
    private javax.swing.JTextField salary_text;
    // End of variables declaration//GEN-END:variables
String Filename=null;
int s=0;
byte[] person_image=null;
private  ImageIcon format=null;
private JOptionPane JOptionPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
