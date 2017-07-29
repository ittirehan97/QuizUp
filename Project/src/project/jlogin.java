package project;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class jlogin extends javax.swing.JFrame {

    
    java.sql.Connection con1;
    public jlogin() {
        initComponents();
        setBounds(300,100,650,550);
        this.setTitle("MENU");
        jButton1.setEnabled(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jComboBox2.setVisible(false);
        jButton4.setVisible(false);
        jLabel1.setVisible(false);
        user=n1.get_user();
        
         try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "");
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
        
            JOptionPane.showMessageDialog(rootPane, ex.toString());   
        }
        //getting table names
        try
        {
            String str="select * from personal_ans";
            Statement st=con1.createStatement();
            ResultSet re=st.executeQuery(str);
            while(re.next())
            {
                jComboBox2.addItem(re.getString(1));
                
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        }
        NewClass nw=new NewClass();
        String user_name=nw.get_user();
        for(int i=0;i<jComboBox2.getItemCount();i++)
        {
            if(jComboBox2.getItemAt(i).equals(user_name))
            {
                jButton2.setEnabled(false);
                break;
            }
        }
        if(NewClass.makeownquiz==1)
        {
            jButton2.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Or");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(260, 300, 30, 20);

        jButton1.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton1.setText("Take Quiz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(310, 290, 170, 40);

        jComboBox1.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "current_affairs", "history", "sports", "tv_shows", "personalque" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jComboBox1);
        jComboBox1.setBounds(150, 130, 130, 30);

        jLabel2.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Quiz");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(70, 130, 50, 30);

        jButton2.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton2.setText("Make Your Own QUiz");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(70, 290, 160, 40);

        jButton3.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton3.setText("Back to Selection");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(320, 130, 140, 30);

        jComboBox2.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jComboBox2);
        jComboBox2.setBounds(150, 190, 130, 30);

        jLabel3.setFont(new java.awt.Font("Kokila", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Sign Out");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(400, 20, 60, 17);

        jButton4.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton4.setText("Take Personal Quiz");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton4);
        jButton4.setBounds(320, 360, 170, 40);

        jButton5.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton5.setText("Rankings");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton5);
        jButton5.setBounds(320, 190, 140, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/black blue.png"))); // NOI18N
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(0, 0, 630, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        newMdi nm=new newMdi();
        nm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        jButton3.setLocation(jComboBox1.getLocation());
        jButton3.setSize(jComboBox1.getSize());
        jComboBox1.setVisible(false);
        jButton3.setVisible(true);
        jButton1.setEnabled(true);
        if(jComboBox1.getSelectedItem().equals("personalque"))
        {
            jComboBox2.setVisible(true);
            jButton2.setVisible(true);
            jButton1.setVisible(false);
            jButton4.setVisible(true);
            jLabel1.setVisible(true);
            jButton4.setLocation(jButton1.getLocation());
            
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jButton1.setEnabled(false);
        jButton2.setVisible(false);
        jComboBox1.setLocation(jButton3.getLocation());
        jButton3.setVisible(false);
        jComboBox1.setVisible(true);
        jComboBox2.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        quiz q1=new quiz();
        q1.setVisible(true);
        this.setEnabled(false);
        q1.set_table(jComboBox1.getSelectedItem().toString());
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    NewClass n1= new NewClass();
    String user;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        NewClass.makeownquiz=0;
        NewClass n1= new NewClass();
        n1.set_user("");
        this.dispose();
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
 
       
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        quiz_personal q1=new quiz_personal();
        q1.setVisible(true);
        q1.set_table(jComboBox1.getSelectedItem().toString());
        q1.set_ans_table(jComboBox2.getSelectedItem().toString());
        this.setEnabled(false);
        this.dispose();
        //this.setVisible(false);
        //q1.set_table(jComboBox2.getSelectedItem().toString());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //jComboBox2.addItem(n1.get_user());
        String str= "insert into personal_ans(table_name) values('"+(n1.get_user())+"')";
        try
        {
            Statement st= con1.createStatement();
            st.executeUpdate(str);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        }
        
        MakeOwnQuiz m1=new MakeOwnQuiz();
        m1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if((jComboBox1.getSelectedItem().toString()).equals("personalque"))
        {
            rank_personal r1= new rank_personal();
            r1.set_table(jComboBox2.getSelectedItem().toString());
            r1.display();
            r1.setVisible(true);
            this.dispose();
        }
        else
        {
            ranking r1=new ranking();
            r1.set_table(jComboBox1.getSelectedItem().toString());
            r1.display();
            r1.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(jlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
