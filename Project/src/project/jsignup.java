package project;

import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.management.timer.Timer;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author Hp
 */
public class jsignup extends javax.swing.JInternalFrame {

 
    java.sql.Connection con;
    public jsignup() {
        initComponents();
        jButton2.setEnabled(false);
        setBounds(100,00,400,500);
        this.setTitle("SIGN UP FORM");
        //jsu.setEnabled(true);
         try {
            Class.forName("com.mysql.jdbc.Driver");   //com.mysql.jdbc.Driver
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","");
        } catch (ClassNotFoundException | SQLException ex) {
        
            JOptionPane.showMessageDialog(rootPane, ex.toString());   
        }
         jRadioButton2.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        jLabel2.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N

        setBackground(java.awt.SystemColor.activeCaption);
        setClosable(true);
        setMaximizable(true);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 30, 130, 20);

        jLabel3.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel3.setText("DoB");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 70, 90, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 30, 83, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(180, 70, 84, 30);

        jLabel4.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel4.setText("Phone NO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 300, 90, 14);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(180, 140, 88, 30);

        jLabel5.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel5.setText("Email ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 150, 130, 14);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(180, 180, 88, 30);

        jCheckBox1.setFont(new java.awt.Font("Kokila", 1, 14)); // NOI18N
        jCheckBox1.setText("I accept the");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(60, 340, 81, 25);

        jLabel6.setFont(new java.awt.Font("Kokila", 3, 14)); // NOI18N
        jLabel6.setText("Terms and Conditions");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 340, 100, 17);

        jButton1.setFont(new java.awt.Font("Kokila", 3, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(79, 370, 90, 25);

        jLabel7.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 110, 90, 14);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Kokila", 1, 14)); // NOI18N
        jRadioButton1.setText("Male");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(180, 110, 60, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Kokila", 1, 14)); // NOI18N
        jRadioButton2.setText("Female");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(240, 110, 59, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Kokila", 1, 14)); // NOI18N
        jRadioButton3.setText("Other");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(310, 110, 53, 23);

        jLabel8.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel8.setText("Username");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 190, 130, 14);

        jLabel9.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel9.setText("Password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 230, 130, 14);

        jLabel10.setFont(new java.awt.Font("Kokila", 1, 18)); // NOI18N
        jLabel10.setText("Confirm password");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 270, 130, 14);

        jButton2.setFont(new java.awt.Font("Kokila", 3, 14)); // NOI18N
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(219, 370, 80, 25);
        jPanel1.add(jTextField7);
        jTextField7.setBounds(180, 300, 88, 30);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(180, 260, 90, 30);
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(180, 220, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String name, dob, gender, email, username, pass, confirm_pass;
    long phone_no;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //storing data in variables
        
        
        int flag=0;
        int flag1=0;
        //checking if password is correct or not
        Component[] com=jPanel1.getComponents();
        for(Component c:com)
        {
            if(c instanceof JTextField && ((JTextField)c).getText().length()==0)
            {
                flag1=1;
                break;
                //JOptionPane.showMessageDialog(c, "All fields are mandatory");
            }
            
        }
        if(flag1==1)
        {
            JOptionPane.showMessageDialog(rootPane, "All fields are mandatory");
        }
        else
        {
            name=jTextField1.getText();
        dob=jTextField2.getText();
        if(jRadioButton1.isSelected())
        {
            gender=jRadioButton1.getText();
        }
        else if(jRadioButton2.isSelected())
        {
            gender=jRadioButton2.getText();
        }
        else
        {
            gender=jRadioButton3.getText();
        }
        email=jTextField3.getText();
        username=jTextField4.getText();
        pass=jPasswordField1.getText();
        confirm_pass=jPasswordField2.getText();
        phone_no=Long.parseLong(jTextField7.getText());
            //JOptionPane.showMessageDialog(rootPane, "Field is empty!");
            if(pass.equals(confirm_pass))
            {
            //checking if username is unique or not
            String str="select Username from user_info";
            try
            {
            Statement st=con.createStatement();
            ResultSet re= st.executeQuery(str);
            while(re.next())
            {
                if(username.equals(re.getString("Username")))
                {
                    JOptionPane.showMessageDialog(rootPane, "This username already exists");
                    flag=1;
                    reset();
                    break;
                }
            }
            if(flag==0)
            {
                submit();
            }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.toString());
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Password mismatched");
            reset();
        }
        }
        
       
    }//GEN-LAST:event_jButton2ActionPerformed

    public void submit()
    {
        String str="insert into user_info(Name,Dob,Gender,Email_id,Username,Password,Phone_no) values('"+name+"','"+dob+"','"+gender+"','"+email+"','"+username+"','"+pass+"',"+phone_no+")";
        try
        {
            Statement st=con.createStatement();
            st.executeUpdate(str);
            JOptionPane.showMessageDialog(rootPane, "Successfully signed up!!");
            this.dispose();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        }
        
    }
    
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if(jCheckBox1.isSelected())
            jButton2.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1ActionPerformed
public void reset()
{
    jButton2.setEnabled(false);
    Component[] comp=jPanel1.getComponents();
        for(Component c:comp)
        {
            if(c instanceof JCheckBox)
            {
                ((JCheckBox)c).setSelected(false);
            }
            if(c instanceof JTextField)
            {
                ((JTextField)c).setText("");
            }
             if(c instanceof JRadioButton)
            {
                buttonGroup1.clearSelection();
            }
             if(c instanceof JPasswordField)
             {
                 ((JPasswordField)c).setText("");
             }
        }
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
