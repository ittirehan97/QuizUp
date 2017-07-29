package project;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class rank_personal extends javax.swing.JFrame {

    java.sql.Connection con;
    DefaultTableModel model=new DefaultTableModel();
    
    public rank_personal() {
        initComponents();
        setBounds(300,100,700,550);
        this.setTitle("RANKINGS");
        jTable1.setModel(model);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");//driver from java end
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 40, 452, 402);

        jButton1.setFont(new java.awt.Font("Kokila", 3, 18)); // NOI18N
        jButton1.setText("BACK TO MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 460, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/black blue.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 720, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        jlogin j1= new jlogin();
        j1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    String table;
    
    public void set_table(String t)
    {
        table=t+"_rank";
    }
    
    public void display()
    {
        try
            {
                String str="select * from "+table+" order by score desc";
                Statement st=con.createStatement();
                ResultSet re=st.executeQuery(str);

                ResultSetMetaData my_col_info=re.getMetaData();
                String[] col_list=new String[my_col_info.getColumnCount()];

                for(int i=0;i<col_list.length;i++)
                {
    
                    col_list[i]=my_col_info.getColumnLabel(i+1).toString();
                }
                model.setColumnIdentifiers(col_list);

                while(re.next())
                {
                    int col_count=col_list.length;
                    Object[] new_row=new Object[col_count];
                    for(int i=0;i<col_count;i++)
                    {
                        new_row[i]=re.getObject(i+1); 
                    }
                    model.addRow(new_row);
                }
            }
            catch(Exception ex1)
            {
                JOptionPane.showMessageDialog(rootPane, ex1.toString());
            }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rank_personal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
