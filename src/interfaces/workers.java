/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import codes.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Isuru Gayan
 */
public class workers extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    public workers() {
        initComponents();
        conn=DBConnect.dbconnect();
        tableLoad();
    }

    public void tableLoad()
    {
        try {
            String sql="select * from cashiers";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"table laod fail");
        }
    }
    
    public void clear()
    {
        fname.setText("");
        lname.setText("");
        age.setText("");
        genderSelect.clearSelection();
        email.setText("");
        phone.setText("");
        uname.setText("");
        fname.requestFocus();
        id.setText("ID");
        add.setVisible(true);
    }
    
    public void tableData()
    {
        int row=table1.getSelectedRow();
        
        id.setText(table1.getValueAt(row, 0).toString());
        fname.setText(table1.getValueAt(row, 1).toString());
        lname.setText(table1.getValueAt(row, 2).toString());
        age.setText(table1.getValueAt(row, 3).toString());
        
        String Gender=table1.getValueAt(row,4).toString();
        if("male".equals(Gender))
        {
            male.setSelected(true);
        }
        else
        {
            female.setSelected(true);
        }
        
        email.setText(table1.getValueAt(row, 5).toString());
        phone.setText(table1.getValueAt(row, 6).toString());
        uname.setText(table1.getValueAt(row, 7).toString());
        
        
        add.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderSelect = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("workers");
        setMinimumSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Age");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("User Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Search");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 110, -1));

        id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id.setText("ID");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 110, 20));

        fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 110, -1));

        age.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 110, -1));

        uname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 110, -1));

        add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 150, -1));

        update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 150, -1));

        delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 150, 40));

        clear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 110, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Email");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 110, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Phone-No");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 110, -1));

        genderSelect.add(male);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        genderSelect.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 800));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 740, -1, -1));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 740, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Workers");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 221, -1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        table1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 760, 510));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru Gayan\\Documents\\NetBeansProjects\\project5\\images\\workerss.png")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 800));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 880, 800));

        setSize(new java.awt.Dimension(1218, 847));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        String Fname=null;
        String Lname=null;
        int Age=0;
        String Gender=null;
        String Email=null;
        int PhoneNo=0;
        String UserName=null;
        
        if(fname.getText().length()==0||lname.getText().length()==0||age.getText().length()==0||email.getText().length()==0||phone.getText().length()==0||uname.getText().length()==0)
        {
            JOptionPane.showMessageDialog(null,"Add fail 1");
        }
        else
        {
            try {
                Fname=fname.getText();
                Lname=lname.getText();
                Age=Integer.parseInt(age.getText());
                
                male.setActionCommand("male");
                female.setActionCommand("female");
                
                Gender=genderSelect.getSelection().getActionCommand();
                
                Email=email.getText();
                PhoneNo=Integer.parseInt(phone.getText());
                UserName=uname.getText();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Add Fail 2");
            }
            
            
            if((PhoneNo!=0)&&(Age!=0)&&Gender!=null)
            {
                try {
                     String sql="insert into cashiers(fname,lname,age,gender,email,phone_no,uname) values('"+Fname+"','"+Lname+"','"+Age+"','"+Gender+"','"+Email+"','"+PhoneNo+"','"+UserName+"')";
                     pst=conn.prepareStatement(sql);
                     pst.execute();
                     tableLoad();
                     clear();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Add Fail 3");
                }
               
                
            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        tableData();
    }//GEN-LAST:event_table1MouseClicked

    private void table1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table1KeyReleased
        tableData();
    }//GEN-LAST:event_table1KeyReleased

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
    }//GEN-LAST:event_clearActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if("ID".equals(id.getText()))
        {
            JOptionPane.showMessageDialog(null,"Update fail");
        }
        else
        {
            int ID=0;
            String Fname=null;
            String Lname=null;
            int Age=0;
            String Gender=null;
            String Email=null;
            int PhoneNo=0;
            String UserName=null;
            
            if(fname.getText().length()==0||lname.getText().length()==0||age.getText().length()==0||email.getText().length()==0||phone.getText().length()==0||uname.getText().length()==0)
            {
                JOptionPane.showMessageDialog(null,"Update fail 1");
            }
            else
            {
                try {
                    ID=Integer.parseInt(id.getText());
                    Fname=fname.getText();
                    Lname=lname.getText();
                    Age=Integer.parseInt(age.getText());

                    male.setActionCommand("male");
                    female.setActionCommand("female");

                    Gender=genderSelect.getSelection().getActionCommand();
                
                    Email=email.getText();
                    PhoneNo=Integer.parseInt(phone.getText());
                    UserName=uname.getText();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Update Fail 2");
                }
            
            
                if((PhoneNo!=0)&&(Age!=0)&&Gender!=null)
                {
                    try {
                         String sql="update cashiers set fname='"+Fname+"',lname='"+Lname+"',age='"+Age+"',gender='"+Gender+"',email='"+Email+"',phone_no='"+PhoneNo+"',uname='"+UserName+"' where cashier_id='"+ID+"'";
                         pst=conn.prepareStatement(sql);
                         pst.execute();
                         tableLoad();
                         clear();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,"Update Fail 3");
                    }  
                }
            }
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if("ID".equals(id.getText()))
        {
            JOptionPane.showMessageDialog(null, "select one");
        }
        else
        {
            int ID=Integer.parseInt(id.getText());
            //System.out.println(ID);
            int check=JOptionPane.showConfirmDialog(null,"Are you sure");
            if(check==0)
            {
                try {
                    //System.out.println(ID);
                    String sql="delete from cashiers where cashier_id='"+ID+"'";
                    pst=conn.prepareStatement(sql);
                    pst.execute();
                    tableLoad();
                    clear();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Sql Error");
                }
                
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        adminMain obj=new adminMain();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        int check=JOptionPane.showConfirmDialog(null,"Are you sure");
        if(check==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        String srch=search.getText();
        
        try {
            String sql="select * from cashiers where cashier_id like '%"+srch+"%' or fname like '%"+srch+"%' or lname like '%"+srch+"%'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Sql Error");
        }
    }//GEN-LAST:event_searchKeyReleased

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
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new workers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.ButtonGroup genderSelect;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField search;
    private javax.swing.JTable table1;
    private javax.swing.JTextField uname;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
