
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puspita
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanjangBalok = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLebarBalok = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTinggiBalok = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        BtnBalok = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSisiKubus = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jJariBola = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel8.setText("Masukkan Panjang :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 40, 110, 20);
        jPanel1.add(jPanjangBalok);
        jPanjangBalok.setBounds(160, 40, 140, 30);

        jLabel9.setText("cm");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 50, 30, 14);
        jPanel1.add(jLebarBalok);
        jLebarBalok.setBounds(160, 90, 140, 30);

        jLabel10.setText("cm");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 100, 40, 14);

        jLabel11.setText("Masukkan Lebar    :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 94, 100, 20);

        jLabel12.setText("Masukkan Tinggi    :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 144, 100, 20);
        jPanel1.add(jTinggiBalok);
        jTinggiBalok.setBounds(160, 140, 140, 30);

        jLabel13.setText("cm");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(310, 150, 30, 14);

        BtnBalok.setText("Hitung");
        BtnBalok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBalokActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBalok);
        BtnBalok.setBounds(130, 200, 120, 40);

        jTabbedPane1.addTab("Balok", jPanel1);

        jPanel2.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Masukkan Panjang Sisi");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(60, 30, 170, 40);

        jSisiKubus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSisiKubusActionPerformed(evt);
            }
        });
        jPanel2.add(jSisiKubus);
        jSisiKubus.setBounds(50, 100, 110, 40);

        jLabel15.setText("cm");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(180, 110, 50, 14);

        jButton3.setText("Volume");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(90, 170, 90, 30);

        jTabbedPane1.addTab("Kubus", jPanel2);

        jPanel3.setLayout(null);
        jPanel3.add(jJariBola);
        jJariBola.setBounds(70, 100, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Masukkan Panjang Jari-jari");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(60, 30, 240, 50);

        jLabel5.setText("cm");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(230, 110, 70, 14);

        jButton1.setText("Volume");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(120, 160, 120, 40);

        jTabbedPane1.addTab("Bola", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 60, 390, 350);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        jLabel1.setText("Program Pencari Volume Bangun Ruang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 0, 250, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        float jari;
        jari = Integer.parseInt(jJariBola.getText());
        float hasil1 = (float) (4/3*3.14*jari*jari*jari);
        try {
            JOptionPane.showMessageDialog(null,"Luas Permukaan Bola Adalah : "
            +hasil1,"luas",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e,"Gagal",
                    JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnBalokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBalokActionPerformed
        int panjang,lebar,tinggi;
        panjang = Integer.parseInt(jPanjangBalok.getText());
        lebar = Integer.parseInt(jLebarBalok.getText());
        tinggi = Integer.parseInt(jTinggiBalok.getText());
        int hasil = panjang*lebar*tinggi;
        try {
            JOptionPane.showMessageDialog(null,"Volume Balok Anda :"+hasil,"luas",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e,"Gagal",
                    JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBalokActionPerformed

    private void jSisiKubusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSisiKubusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSisiKubusActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int sisi;
        sisi = Integer.parseInt(jSisiKubus.getText());
        int hasil = sisi*sisi*sisi;
        
        try {
            JOptionPane.showMessageDialog(null,"Luas permukaan kubus adalah :"
            +hasil, "luas",JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e,"Gagal",
                    JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBalok;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jJariBola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLebarBalok;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jPanjangBalok;
    private javax.swing.JTextField jSisiKubus;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTinggiBalok;
    // End of variables declaration//GEN-END:variables
}
