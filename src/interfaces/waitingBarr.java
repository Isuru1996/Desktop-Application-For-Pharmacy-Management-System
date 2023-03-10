/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Isuru Gayan
 */
public class waitingBarr extends javax.swing.JFrame implements Runnable{
   
    int hint;
    String cashierUserName;
    /**
     * Creates new form waitingBarr
     */
    public waitingBarr(int a) {
        initComponents();
        Thread t=new Thread(this);
        t.start();
        hint=a;
    }
    
    public waitingBarr(int a,String cashierUserName) {
        initComponents();
        Thread t=new Thread(this);
        t.start();
        hint=a;
        this.cashierUserName=cashierUserName;
    }
    
     @Override
    public void run() {
        for(int i=0;i<=100;i++)
        {
            try {
                Thread.sleep(20);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
            count.setText(i+"%");
            progress.setValue(i);
        }
        
        if(hint==1)
        {
            adminMain obj=new adminMain();
            obj.setVisible(true);
        }
        if(hint==2)
        {
            cashierMain obj=new cashierMain(cashierUserName);
            obj.setVisible(true);
        }
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        count = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Waiting");
        setMinimumSize(new java.awt.Dimension(600, 300));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 570, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Please Wait");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        count.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        count.setForeground(new java.awt.Color(51, 51, 255));
        count.setText(" ");
        jPanel1.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isuru Gayan\\Documents\\NetBeansProjects\\project5\\images\\progress.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        setSize(new java.awt.Dimension(600, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(waitingBarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(waitingBarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(waitingBarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(waitingBarr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new waitingBarr(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel count;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables

   
}
