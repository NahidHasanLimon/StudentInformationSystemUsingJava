
import java.sql.Connection;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
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
public class Main_Form extends javax.swing.JFrame {

    /**
     * Creates new form Main_Form
     */
     Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
    public Main_Form() {
        initComponents();
        conn=JavaConnectDb.connectrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_sid = new javax.swing.JLabel();
        jComboBox_sem = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox_year = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel_year = new javax.swing.JLabel();
        jLabel_Semester = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_assigned_course = new javax.swing.JTable();
        jButton_Back = new javax.swing.JButton();
        jLabel_retake_credit = new javax.swing.JLabel();
        jLabel_regular_credit = new javax.swing.JLabel();
        jLabel_total_credit = new javax.swing.JLabel();
        jTextField_sid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_sid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_sid.setText("S_ID");
        getContentPane().add(jLabel_sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 20, 90, 30));

        jComboBox_sem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fall", "Summer", "Spring" }));
        jComboBox_sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_semActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_sem, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 20, 80, 30));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setText("Semester");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 20, 90, 30));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setText("Year");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 20, 90, 30));

        jComboBox_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jComboBox_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_yearActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 23, 70, 30));

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, 39));

        jLabel_year.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 2));
        getContentPane().add(jLabel_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 210, 30));

        jLabel_Semester.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 2));
        getContentPane().add(jLabel_Semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 190, 30));

        jTable_assigned_course.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_assigned_course);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 670, 270));

        jButton_Back.setText("Back");
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, -1, -1));

        jLabel_retake_credit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel_retake_credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jLabel_regular_credit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel_regular_credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jLabel_total_credit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel_total_credit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));
        getContentPane().add(jTextField_sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 180, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_semActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_semActionPerformed

    private void jComboBox_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_yearActionPerformed

    }//GEN-LAST:event_jComboBox_yearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            //String sql="SELECT STUDENT_ID,COURSE_CODE,SEMESTER,TYPE,CREDIT FROM COURSE WHERE STUDENT_ID=? and SEMESTER =?";
            

            String gotiid=jTextField_sid.getText();
            String got2=jComboBox_sem.getSelectedItem().toString();
            String got3=jComboBox_year.getSelectedItem().toString();
            String sql="select SEMESTER,COURSE_CODE,YEAR from course where STUDENT_ID ='"+gotiid+"'and SEMESTER='"+got2+"' and YEAR='"+got3+"'";
            //String sql3="SELECT SEMESTER,COURSE_CODE,TYPE FROM COURSE UNION SELECT GRADE,SEMESTER FROM table2";
            try {
                pst=(OraclePreparedStatement) conn.prepareStatement(sql);

                rs=(OracleResultSet) pst.executeQuery();
                jTable_assigned_course.setModel(DbUtils.resultSetToTableModel(rs));
                jLabel_Semester.setText(got2);
                jLabel_year.setText(got3);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);
            }

            /*if(rs.isClosed())
            {

                jTable_course.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No Course Assigned ");

                DefaultTableModel tMOdel = (DefaultTableModel) jTable_course.getModel();
                tMOdel.setRowCount(0);

            }
            */

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        // TODO add your handling code here:
     student_main_form smf2=new student_main_form();
    
        smf2.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Back;
    private javax.swing.JComboBox<String> jComboBox_sem;
    private javax.swing.JComboBox<String> jComboBox_year;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Semester;
    private javax.swing.JLabel jLabel_regular_credit;
    private javax.swing.JLabel jLabel_retake_credit;
    private javax.swing.JLabel jLabel_sid;
    private javax.swing.JLabel jLabel_total_credit;
    private javax.swing.JLabel jLabel_year;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_assigned_course;
    private javax.swing.JTextField jTextField_sid;
    // End of variables declaration//GEN-END:variables
}
