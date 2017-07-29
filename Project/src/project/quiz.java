package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.sql.*;

public class quiz extends javax.swing.JFrame implements ActionListener{

    public quiz() {
        initComponents();
         setBounds(300,100,700,550);
         jButton3.setVisible(false);
         this.setTitle("QUIZ");
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
           // con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
            //con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/general_quiz_rank", "root", "");
        } 
        catch (ClassNotFoundException | SQLException ex)
        {
        
            JOptionPane.showMessageDialog(rootPane, ex.toString());   
        }
    }

   
    Timer timer=null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton1.setText("START GAME");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton1);
        jButton1.setBounds(270, 10, 170, 40);

        jButton2.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton2.setText("Next>>");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(170, 340, 120, 30);

        jLabel1.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Question");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(50, 100, 80, 50);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(jRadioButton1);
        jRadioButton1.setBounds(160, 200, 140, 30);

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(jRadioButton2);
        jRadioButton2.setBounds(380, 200, 150, 30);

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(jRadioButton3);
        jRadioButton3.setBounds(160, 260, 140, 30);

        jRadioButton4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(jRadioButton4);
        jRadioButton4.setBounds(380, 260, 150, 30);

        jButton3.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton3.setText("Finish");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(370, 340, 120, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(jTextArea1);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 70, 410, 96);

        jLabel2.setFont(new java.awt.Font("Kokila", 2, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/black blue.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(0, 0, 760, 620);

        jLabel3.setText("jLabel3");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(520, 40, 34, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    java.sql.Connection con;
    //java.sql.Connection con1;
    //java.sql.Connection con2;
    boolean flag=false;
    public void actionPerformed(ActionEvent e)
    {
        if(flag)
        {this.dispose();
        timer.stop();}
       flag=true;       
    }
    
    String table, table1;
    
    public void set_table(String t)
    {
        table1=t+"_rank";
        table=t;
    }
    
    
    int index=1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setVisible(false);
       timer=new Timer(60000, this);
        timer.start();
        //timer.stop();
       start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       next();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        NewClass n1=new NewClass();
        String user=n1.get_user();
        try
        {
            
            //checking if the username already exists
            int flag1=0;
            String s="select Username from "+table1;
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
            
            if(flag1==1)
            {
                String str4="select score from "+table1+" where Username='"+user+"'";
                Statement st4=con.createStatement();
                ResultSet re2=st4.executeQuery(str4);
                re2.next();
                if(score>re2.getInt("score"))
                {
                    String str5="update "+table1+" set score="+score+" where Username='"+user+"'";
                    Statement st5=con.createStatement();
                    st5.executeUpdate(str5);
                }
            }
            else
            {
                String str1="insert into "+table1+" values('"+user+"',"+score+")";
                Statement st1=con.createStatement();
                st1.executeUpdate(str1);
            }
            
            
            String str2="update user_info set "+table+"="+score+" where Username='"+user+"'";
            Statement st2=con.createStatement();
            st2.executeUpdate(str2);
            
            this.dispose();
            //jlogin j1= new jlogin();
            //j1.setVisible(true);
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
    }//GEN-LAST:event_jButton3ActionPerformed
    String ans;
    public void start()
    {
        //JOptionPane.showMessageDialog(rootPane, "start");
        String str= "select * from " + table+" where SNo="+index;
        try
        {
           String user_ans;
           Statement st=con.createStatement();
           ResultSet re= st.executeQuery(str);
           re.next();
           jTextArea1.setText(re.getString("Question"));
           jRadioButton1.setText(re.getString("Option1"));
           jRadioButton2.setText(re.getString("Option2"));
           jRadioButton3.setText(re.getString("Option3"));
           jRadioButton4.setText(re.getString("Option4"));
           ans= re.getString("Answer");
        }
        catch(Exception ex)
        {
           JOptionPane.showMessageDialog(rootPane, "kjdsvnksj");
        }
    }
String user_ans;
ResultSet re;
    public void next()
    { 
            index++;
            if(jRadioButton1.isSelected())
           {
               user_ans=jRadioButton1.getText();
           }
           else if(jRadioButton2.isSelected())
           {
               user_ans=jRadioButton2.getText();
           }
           else if(jRadioButton3.isSelected())
           {
               user_ans=jRadioButton3.getText();
           }
           else if(jRadioButton4.isSelected())
           {
               user_ans=jRadioButton4.getText();
           }
            else
           {
               user_ans="";
           }
       String str= "select * from " + table +" where SNo="+index;
       int marks= count();
       try
       {
           buttonGroup1.clearSelection();  
           Statement st=con.createStatement();
           re= st.executeQuery(str);
           re.next();
           jTextArea1.setText(re.getString("Question"));
           jRadioButton1.setText(re.getString("Option1"));
           jRadioButton2.setText(re.getString("Option2"));
           jRadioButton3.setText(re.getString("Option3"));
           jRadioButton4.setText(re.getString("Option4"));          
           ans= re.getString("Answer"); 
       }
       catch(Exception ex)
       {   
           JOptionPane.showMessageDialog(rootPane,"Your score is " +marks);
           try
           {
                re.close();
                jButton2.setVisible(false);
                jButton3.setLocation(jButton2.getLocation());
                jButton3.setVisible(true);
           }
           catch(Exception ex1)
           {
               JOptionPane.showMessageDialog(rootPane, ex1.toString());
           }
                   
       }
    }
    int score=0;
    public int count()
    {
        if(user_ans.equals(ans))
        {
            score++;
        }
        return score;
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
