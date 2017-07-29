package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class quiz_personal extends javax.swing.JFrame implements ActionListener{

    java.sql.Connection con;

    public quiz_personal() {
        initComponents();
        setBounds(300,100,700,550);
        jButton3.setVisible(false);
        this.setTitle("PERSONAL QUIZ");
         try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            //con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/personal_ans", "root", "");
            //con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/personal_quiz_rank", "root", "");    
            //con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");    
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString());   
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton1.setText("Start Page");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(290, 20, 160, 40);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 80, 420, 120);

        jLabel1.setFont(new java.awt.Font("Kokila", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Question");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(50, 100, 110, 50);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jDesktopPane1.add(jRadioButton1);
        jRadioButton1.setBounds(420, 240, 170, 30);

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jDesktopPane1.add(jRadioButton2);
        jRadioButton2.setBounds(420, 300, 170, 30);

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jDesktopPane1.add(jRadioButton3);
        jRadioButton3.setBounds(210, 300, 170, 30);

        jRadioButton4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setBorder(new javax.swing.border.MatteBorder(null));
        jDesktopPane1.add(jRadioButton4);
        jRadioButton4.setBounds(210, 240, 170, 30);

        jButton2.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton2.setText("Next");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(400, 370, 150, 30);

        jButton3.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton3.setText("Finish");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(180, 370, 150, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/black blue.png"))); // NOI18N
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(10, 0, 810, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String table;//table for questions
    String ans_table;
    String[] ans=new String[15];
    
    public void set_table(String t)
    {
        table=t;
    }
    
    public void set_ans_table(String t)
    {
        ans_table=t;
    }
    int index=1;
    //int indexx=0;
     public void start()
    {
        String str= "select * from " + table+" where SNo="+index;
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
    
     public void actionPerformed(ActionEvent e)
    {
        if(flag)
        {this.dispose();
        timer.stop();}
       flag=true;       
    }
     boolean flag=false;
     Timer timer=null;
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setVisible(false);
        timer=new Timer(60000, this);
        timer.start();
        //timer.stop();
       start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jRadioButton1.isSelected())
        {
            ans[index-1]=jRadioButton1.getText().toString();   
        }
        else if(jRadioButton2.isSelected())
        {
            ans[index-1]=jRadioButton2.getText().toString();
        }
        else if(jRadioButton3.isSelected())
        {
            ans[index-1]=jRadioButton3.getText().toString();
        }
        else if(jRadioButton4.isSelected())
        {
            ans[index-1]=jRadioButton4.getText().toString();
        }
        else
        {
            ans[index-1]="";
        }
        
        buttonGroup1.clearSelection();
        index++;
        String str= "select * from " + table+" where SNo="+index;
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
           jButton3.setVisible(true);
           jButton2.setVisible(false);
           jButton3.setLocation(jButton2.getLocation());
           JOptionPane.showMessageDialog(rootPane, "DONE" );
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int count=0;
        int indexx=1;
        NewClass n1=new NewClass();
        String user=n1.get_user();
        
        //for comparing answers
        for(int i=0; i<15; i++)
        {
        try
        {
            String str="select Answer from "+ans_table+" where SNo="+indexx;
            Statement st= con.createStatement();
            ResultSet re= st.executeQuery(str);
            re.next();
            if(ans[i].equalsIgnoreCase(re.getString("Answer")))
            {
                count++;
                
            }
            indexx++;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        }
        }
        //for storing scores
        try
        {
            //checking if the username already exists
            int flag1=0;
            String s="select Username from "+ans_table+"_rank";
            Statement st3=con.createStatement();
            ResultSet re1=st3.executeQuery(s);
            while(re1.next())
            {
                if(user.equals(re1.getString("Username")))
                {
                    flag1=1;
                    break;
                }
            }
            //re1.close();
            
            //if username already exists
            if(flag1==1)
            {
                String str4="select score from "+ans_table+"_rank where Username='"+user+"'";
                Statement st4=con.createStatement();
                ResultSet re2=st4.executeQuery(str4);
                re2.next();
                if(count>re2.getInt("score"))
                {
                    String str5="update "+ans_table+"_rank set score="+count+" where Username='"+user+"'";
                    Statement st5=con.createStatement();
                    st5.executeUpdate(str5);
                }
            }
            else
            {
                String str1="insert into "+ans_table+"_rank values('"+user+"',"+count+")";
                Statement st1=con.createStatement();
                st1.executeUpdate(str1);
            }
            
            String str2="update user_info set personal_quiz="+count+" where Username='"+user+"'";
            Statement st2=con.createStatement();
            st2.executeUpdate(str2);
            
            this.dispose();
            jlogin j1= new jlogin();
            j1.setVisible(true);
            
        }
        catch(Exception ex1)
        {
            JOptionPane.showMessageDialog(rootPane, ex1.toString());
        }
        
        finally
        {
            this.dispose();
            jlogin j1= new jlogin();
            j1.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(quiz_personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz_personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz_personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz_personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz_personal().setVisible(true);
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
