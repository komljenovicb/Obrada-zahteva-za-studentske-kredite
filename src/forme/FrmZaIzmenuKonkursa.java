/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Banka;
import domen.Konkurs;
import domen.TipKonkursa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import komunikacija.KomunikacijaSaServerom;
import konstante.Operacija;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;

/**
 *
 * @author Bojaana Komljenovic
 */
public class FrmZaIzmenuKonkursa extends javax.swing.JFrame {

    /**
     * Creates new form FrmZaUnosKonkursa
     */
    public FrmZaIzmenuKonkursa() {
        initComponents();
        vratiBanke();
        vratiTipoveKonkursa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKonkursID = new javax.swing.JTextField();
        txtSkolskaGodina = new javax.swing.JTextField();
        txtRokPodnosenjaDok = new javax.swing.JTextField();
        btnIzmeni = new javax.swing.JButton();
        cmbTipKonkursa = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbBanka = new javax.swing.JComboBox<>();
        btnTIp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Forma za izmenu konkursa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel1.setText("KonkursID: ");

        jLabel2.setText("Skolska godina: ");

        jLabel3.setText("Rok podnosenja dokumentacije: ");

        jLabel4.setText("Tip konkursa: ");

        txtKonkursID.setEnabled(false);

        btnIzmeni.setBackground(new java.awt.Color(51, 51, 51));
        btnIzmeni.setForeground(new java.awt.Color(204, 255, 204));
        btnIzmeni.setText("Izmeni konkurs");
        btnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniActionPerformed(evt);
            }
        });

        jLabel6.setText("Banka:");

        btnTIp.setText("Izmeni informacije o tipu konkursa");
        btnTIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTIpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIzmeni, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(txtSkolskaGodina)
                    .addComponent(txtRokPodnosenjaDok)
                    .addComponent(txtKonkursID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipKonkursa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbBanka, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnTIp, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtKonkursID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSkolskaGodina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(txtRokPodnosenjaDok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipKonkursa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTIp))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbBanka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnIzmeni)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniActionPerformed

        int id = Integer.parseInt(txtKonkursID.getText());
        String skolskaGodina = txtSkolskaGodina.getText();
        String rokPodnosenjaDokumentacije = txtRokPodnosenjaDok.getText();
        TipKonkursa tk = (TipKonkursa) cmbTipKonkursa.getSelectedItem();
        Banka b = (Banka) cmbBanka.getSelectedItem();
        Konkurs k = new Konkurs(id, skolskaGodina, rokPodnosenjaDokumentacije, tk, b);
        TransferObjekatZahtev toz = new TransferObjekatZahtev();
        toz.setOperacija(Operacija.IZMENI_KONKURS);
        toz.setZahtev(k);
        KomunikacijaSaServerom.getInstanca().posajiZahtev(toz);
        TransferObjekatOdgovor too = (TransferObjekatOdgovor) KomunikacijaSaServerom.getInstanca().primiOdgovor();
        String poruka = (String) too.getRezultat();
        JOptionPane.showMessageDialog(this, poruka);
        this.dispose();
        FrmListaKonkursa frm = new FrmListaKonkursa();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnIzmeniActionPerformed

    private void btnTIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTIpActionPerformed
        TipKonkursa tk = (TipKonkursa) cmbTipKonkursa.getSelectedItem();
        FrmTK frm = new FrmTK();
        frm.postaviDetalje(tk);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTIpActionPerformed

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
            java.util.logging.Logger.getLogger(FrmZaIzmenuKonkursa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmZaIzmenuKonkursa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmZaIzmenuKonkursa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmZaIzmenuKonkursa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmZaIzmenuKonkursa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmeni;
    private javax.swing.JButton btnTIp;
    private javax.swing.JComboBox<Object> cmbBanka;
    private javax.swing.JComboBox<Object> cmbTipKonkursa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtKonkursID;
    private javax.swing.JTextField txtRokPodnosenjaDok;
    private javax.swing.JTextField txtSkolskaGodina;
    // End of variables declaration//GEN-END:variables

    public void popuniPolja(Konkurs k) {
        txtKonkursID.setText(k.getKonkursID() + "");
        txtRokPodnosenjaDok.setText(k.getRokPodnosenjaDokumentacije());
        txtSkolskaGodina.setText(k.getSkolskaGodina());
        cmbTipKonkursa.setSelectedItem(new TipKonkursa(-1, k.getTipKonkursa().getNazivTipaKonkursa()));

    }

    public void vratiBanke() {
        ArrayList<Banka> banke = new ArrayList<>();
        TransferObjekatZahtev toz = new TransferObjekatZahtev();
        toz.setOperacija(Operacija.VRATI_BANKE);
        KomunikacijaSaServerom.getInstanca().posajiZahtev(toz);
        TransferObjekatOdgovor too = (TransferObjekatOdgovor) KomunikacijaSaServerom.getInstanca().primiOdgovor();
        banke = (ArrayList<Banka>) too.getRezultat();

        for (Banka banka : banke) {
            cmbBanka.addItem(banka);
        }
    }

    private void vratiTipoveKonkursa() {
        ArrayList<TipKonkursa> tipovi = new ArrayList<>();
        TransferObjekatZahtev toz = new TransferObjekatZahtev();
        toz.setOperacija(Operacija.VRATI_TIPOVE_KONKURSA);
        KomunikacijaSaServerom.getInstanca().posajiZahtev(toz);
        TransferObjekatOdgovor too = (TransferObjekatOdgovor) KomunikacijaSaServerom.getInstanca().primiOdgovor();
        tipovi = (ArrayList<TipKonkursa>) too.getRezultat();

        for (TipKonkursa tk : tipovi) {
            cmbTipKonkursa.addItem(tk);
        }
    }
}
