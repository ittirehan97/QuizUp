package project;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Map;
import javax.swing.JOptionPane;

public class newMdi extends javax.swing.JFrame {

    java.sql.Connection con;
    public newMdi() {
        initComponents();
        setBounds(380,150,550,450);
        this.setTitle("LOGIN");
       try {
            Class.forName("com.mysql.jdbc.Driver");   
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","");
        } catch (ClassNotFoundException | SQLException ex) {
        
            JOptionPane.showMessageDialog(rootPane, ex.toString());
                
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Sign Up");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        desktopPane.add(jLabel4);
        jLabel4.setBounds(310, 280, 55, 20);

        jLabel3.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Don't have an account?");
        desktopPane.add(jLabel3);
        jLabel3.setBounds(150, 280, 150, 22);

        jButton1.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1);
        jButton1.setBounds(230, 230, 150, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        desktopPane.add(jTextField1);
        jTextField1.setBounds(230, 140, 150, 30);

        jLabel1.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("User Name");
        desktopPane.add(jLabel1);
        jLabel1.setBounds(140, 140, 80, 22);

        jLabel2.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Password");
        desktopPane.add(jLabel2);
        jLabel2.setBounds(140, 190, 80, 22);
        desktopPane.add(jPasswordField1);
        jPasswordField1.setBounds(230, 180, 150, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Project\\src\\project\\red.jpg")); // NOI18N
        desktopPane.add(jLabel5);
        jLabel5.setBounds(130, 100, 310, 210);

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Project\\src\\project\\black blue.png")); // NOI18N
        desktopPane.add(jLabel6);
        jLabel6.setBounds(0, 0, 690, 620);

        getContentPane().add(desktopPane);
        desktopPane.setBounds(0, 0, 580, 445);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

            jsignup jsu=new jsignup();
            this.desktopPane.add(jsu);
            jsu.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    NewClass n1= new NewClass();
    String username;
    String password;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        username=jTextField1.getText();
        password=jPasswordField1.getText();
        int flag=0;
        
        String str="select Username from user_info";
        try
        {
            Statement st= con.createStatement();
            ResultSet re= st.executeQuery(str);
            while(re.next())
            {
                if(username.equals(re.getString("Username")))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                String str1="select Password from user_info where Username='"+username+"'";
                try
                {
                    Statement st1=con.createStatement();
                    ResultSet re1=st1.executeQuery(str1);
                    re1.next();
                    if(password.equals(re1.getString("Password")))
                    {
                        n1.set_user(username);
                        JOptionPane.showMessageDialog(rootPane, "Successfully Logged in!!!");
                        jlogin j1=new jlogin();
                        j1.setVisible(true);
                        //jButton1.setEnabled(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Incorrect Password!!");
                    }
                }
                catch(Exception ex1)
                {
                    JOptionPane.showMessageDialog(rootPane, ex1.toString());
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "user wasnt found");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(newMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newMdi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
