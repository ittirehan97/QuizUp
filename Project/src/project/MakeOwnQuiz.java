package project;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class MakeOwnQuiz extends javax.swing.JFrame {

    
    java.sql.Connection con;
    java.sql.Connection con1;
    java.sql.Connection con2;
    public MakeOwnQuiz() {
        initComponents();
         setBounds(300,100,700,550);
         jButton2.setVisible(false);
         jButton1.setVisible(false);
         jButton3.setVisible(true);
         this.setTitle("MAKE YOUR OWN PERSONAL QUIZ");
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
        
            JOptionPane.showMessageDialog(rootPane, ex.toString());   
        }
        //submit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Question");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(60, 110, 90, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 90, 370, 120);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(jRadioButton1);
        jRadioButton1.setBounds(390, 240, 140, 30);

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseMoved(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jRadioButton2);
        jRadioButton2.setBounds(180, 300, 150, 30);

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(jRadioButton3);
        jRadioButton3.setBounds(390, 300, 150, 30);

        jRadioButton4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jRadioButton4);
        jRadioButton4.setBounds(180, 240, 150, 30);

        jButton1.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton1.setText("Enter");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(150, 370, 140, 30);

        jButton2.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton2.setText("Submit");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(400, 370, 160, 30);

        jButton3.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton3.setText("Start");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(260, 30, 140, 40);

        jLabel2.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\New folder\\black blue.png")); // NOI18N
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(0, 0, 740, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int index=1;
    String[] user_ans=new String[15];
    
    public void submit()
    {
        String str= "select * from personalque where SNo="+index;
        try
        {
           Statement st=con.createStatement();
           ResultSet re= st.executeQuery(str);
           re.next();
           jTextArea1.setText(re.getString("Question"));
           jRadioButton1.setText(re.getString("Option1"));
           jRadioButton2.setText(re.getString("Option2"));
           jRadioButton3.setText(re.getString("Option3"));
           jRadioButton4.setText(re.getString("Option4"));
        }
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(rootPane, ex.toString() );
       }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        if(jRadioButton1.isSelected())
        {
            user_ans[index-1]=jRadioButton1.getText().toString();
            
        }
        else if(jRadioButton2.isSelected())
        {
            user_ans[index-1]=jRadioButton2.getText().toString();
        }
        else if(jRadioButton3.isSelected())
        {
            user_ans[index-1]=jRadioButton3.getText().toString();
        }
        else if(jRadioButton4.isSelected())
        {
            user_ans[index-1]=jRadioButton4.getText().toString();
        }
        
        index++;
        if(index==15)
        {
            jButton2.setVisible(true);
            jButton1.setVisible(false);
        }
        submit();
        buttonGroup1.clearSelection();
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    NewClass n1=new NewClass();
    String user=n1.get_user();
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         
        if(jRadioButton1.isSelected())
        {
            user_ans[index-1]=jRadioButton1.getText().toString();
            
        }
        else if(jRadioButton2.isSelected())
        {
            user_ans[index-1]=jRadioButton2.getText().toString();
        }
        else if(jRadioButton3.isSelected())
        {
            user_ans[index-1]=jRadioButton3.getText().toString();
        }
        else if(jRadioButton4.isSelected())
        {
            user_ans[index-1]=jRadioButton4.getText().toString();
        }
        
       try{
        String str="create table "+user+"(SNo int, Answer varchar(50))";
        Statement st=con.createStatement();
        st.executeUpdate(str);
        for(int i=0; i<15; i++)
        {
            String str1="insert into "+user+"(SNo,Answer) values("+(i+1)+",'"+user_ans[i]+"')";
            Statement stm= con.createStatement();
            stm.executeUpdate(str1);
        }
        jlogin j1=new jlogin();
                j1.setVisible(true);
                this.dispose();
       }catch(Exception ex)
       {
           JOptionPane.showMessageDialog(rootPane, ex.toString());
       }
       
       
       
       try
       {
           String str1="create table "+user+"_rank(Username varchar(50),score int)";
           Statement st1=con.createStatement();
           st1.executeUpdate(str1);
           NewClass.makeownquiz=1;
       }
       
       
       
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(rootPane, ex.toString());
       }
       
       finally
       {
           
           this.dispose();
           jlogin j1= new jlogin();
           j1.setVisible(true);
       }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2MouseMoved

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        submit();
        jButton1.setVisible(true);
        jButton3.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MakeOwnQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeOwnQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeOwnQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeOwnQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeOwnQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
