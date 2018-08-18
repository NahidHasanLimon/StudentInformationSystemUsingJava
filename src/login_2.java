
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;
import java.util.Calendar;
import java.util.Date;
import  java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Drimik
 */
public class login_2 extends javax.swing.JFrame {

    Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;

    /**
     * Creates new form login_2
     */
    public login_2() {
        initComponents();
         conn = JavaConnectDb.connectrDb();
        CurrentDate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        ps = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        loginbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_forgot_password = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        lbl_dat = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 51));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 51), 4), "Login ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 255, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.setDoubleBuffered(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("User_ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 129, 120, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Trouble in Login ?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 390, -1, 34));

        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 210, 34));

        ps.setText("1234");
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 212, 34));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "student", "teacher", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, -1));

        loginbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginbutton.setIcon(new javax.swing.ImageIcon("G:\\Movie\\new'\\button.png")); // NOI18N
        loginbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbuttonMouseClicked(evt);
            }
        });
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 200, 50));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, 40));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 255));
        jLabel4.setText("Types");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, 34));

        jButton_forgot_password.setBackground(new java.awt.Color(255, 255, 255));
        jButton_forgot_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_forgot_password.setForeground(new java.awt.Color(51, 51, 255));
        jButton_forgot_password.setText("Forgot Password");
        jButton_forgot_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_forgot_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_forgot_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 387, 219, 30));

        jButton1.setIcon(new javax.swing.ImageIcon("G:\\Movie\\new'\\error.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, -10, 40, 50));

        jMenuBar1.setBackground(new java.awt.Color(0, 255, 51));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 255));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        lbl_dat.setBackground(new java.awt.Color(255, 204, 204));
        lbl_dat.setText("Date");
        jMenuBar1.add(lbl_dat);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public void CurrentDate()
{
    Calendar cal= new GregorianCalendar();
    int month= cal.get(Calendar.MONTH);
    int day=cal.get(Calendar.DAY_OF_MONTH);
    int year=cal.get(Calendar.YEAR);
   lbl_dat.setText((month+1)+"/"+day+"/"+year);
   int second= cal.get(Calendar.SECOND);
   int minute=cal.get(Calendar.MINUTE);
   int hour=cal.get(Calendar.HOUR);
   lbl_time.setText(hour+":"+minute+":"+second);

}
   
    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void loginbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbuttonMouseClicked

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
      
        String access2=jComboBox1.getSelectedItem().toString();
        
        String sql = "select * from LOGIN where USER_ID=? and  PASSWORD=? and TYPE=?";
        try {
           
            int count = 0;

            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, un.getText());
            pst.setString(2, ps.getText());
            pst.setString(3, jComboBox1.getSelectedItem().toString());
            rs = (OracleResultSet) pst.executeQuery();
            String access = (jComboBox1.getSelectedItem().toString());
            while (rs.next()) {
                  
                   
                
               String s =jComboBox1.getSelectedItem().toString();
                 int id=rs.getInt(1);
                   employee.empid=id;
                    
                   String what=rs.getString("name");
                employee.Empstring=what;
                 String whattype=rs.getString("TYPE");
                employee.Emptype=whattype;
                
                     
                    
                 count = count + 1;
                 
                
                

             
            }

            if (access == "admin") {

                if (count == 1) {
                    
                    
                    JOptionPane.showMessageDialog(null, "succesfully verified");
                  student_main_form sdmf=new student_main_form();
                  sdmf.setVisible(true);
                  this.dispose();
                    Date curreDate=GregorianCalendar.getInstance().getTime();
                    DateFormat df= DateFormat.getDateInstance();
                    String dateString=df.format(curreDate);
                   Date d= new Date();
                    SimpleDateFormat sdf= new SimpleDateFormat("HH:MM:SS");
                    String timeString=sdf.format(d);
                    String valueo=timeString;
                    String values =dateString;
                    int value=employee.empid;
                    String valuetype=employee.Emptype;
                    String reg="INSERT INTO AUDIT_TABLE(TYPE,EMP_ID,DATE_USE,STATUS) VALUES ('"+valuetype+ "','"+value+ "','"+valueo+" / "+values+"','logged in' )";
                pst=(OraclePreparedStatement) conn.prepareStatement(reg);
                pst.executeQuery();
                } else {
                    JOptionPane.showMessageDialog(null, "invalid Admin or Password ");
                }

            }
            else if (access == "student") {

                if (count == 1) {
                    JOptionPane.showMessageDialog(null, "succesfully verified");
                   //tudent_1 d =new Student_1();
                   //String Access2;
                   //Access2=access;    
         //NEw Student Welcome Form
               Student_Welcome_form swf=new Student_Welcome_form();
              swf.setVisible(true);
              this.dispose();
              
                    student_main_form mf= new student_main_form();
                  // mf.setVisible(true);
                  mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    student_main_form.jLabel_loggedid.setText(un.getText());
              
                    student_main_form.lbl_total.setText(Integer.toString(MyFunction.countData("LOGIN")));
                  // d.setVisible(true);
                  Date curreDate=GregorianCalendar.getInstance().getTime();
                    DateFormat df= DateFormat.getDateInstance();
                    String dateString=df.format(curreDate);
                   Date d= new Date();
                    SimpleDateFormat sdf= new SimpleDateFormat("HH:MM:SS");
                    String timeString=sdf.format(d);
                    String valueo=timeString;
                    String values =dateString;
                    int value=employee.empid;
                     String valuetype=employee.Emptype;
                    String reg="INSERT INTO AUDIT_TABLE(TYPE,EMP_ID,DATE_USE,STATUS) VALUES ('"+valuetype+ "','"+value+ "','"+valueo+" / "+values+"','logged in' )";
                pst=(OraclePreparedStatement) conn.prepareStatement(reg);
                pst.executeQuery();
                  
                } else {
                    JOptionPane.showMessageDialog(null, "invalid student name or Password ");
                }

            }

            else  if (access == "teacher") {

                if (count == 1) {
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "invalid teacher name or Password ");
                }

            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_loginbuttonActionPerformed

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton_forgot_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_forgot_passwordActionPerformed
   Forgot_Password obbb=new Forgot_Password();
   obbb.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton_forgot_passwordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        
    splash splash = new splash();
      splash.setVisible(true);
        try {
            for(int i=0;i<=100;i++)
            {
                
                Thread.sleep(40);
             splash.loading_num.setText(Integer.toString(i)+"%");
             splash.jProgressBar1.setValue(i);
             
             splash.jProgressBar1.setValue(i);
             
            
             if(i==100)
             {
                 splash.setVisible(false);
                 splash.dispose();
                 
             }
            }
        } catch (Exception e) {
        }

        
        
         
     
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login_2().setVisible(true);
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_forgot_password;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu lbl_dat;
    private javax.swing.JMenu lbl_time;
    public static javax.swing.JButton loginbutton;
    public static javax.swing.JPasswordField ps;
    public static javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
