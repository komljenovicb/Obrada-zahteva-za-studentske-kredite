/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.PreliminarnaRangLista;
import forme.model.TabelaPreliminarnihRangListi;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import komunikacija.KomunikacijaSaServerom;
import konstante.Operacija;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;

/**
 *
 * @author Bojana Komljenovic
 */
public class FrmPreliminarneRangListe extends javax.swing.JFrame {

    /**
     * Creates new form FrmPreliminarneRangListe
     */
    public FrmPreliminarneRangListe() {
        initComponents();
        postaviTabelu();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPRL = new javax.swing.JTable();
        btnIzmeniPRL = new javax.swing.JButton();
        btnKreirajPRL = new javax.swing.JButton();
        btnObrisiPRL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Preliminarne rang liste:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        tblPRL.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPRL);

        btnIzmeniPRL.setText("Izmeni PRL");
        btnIzmeniPRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniPRLActionPerformed(evt);
            }
        });

        btnKreirajPRL.setText("Kreiraj PRL");
        btnKreirajPRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajPRLActionPerformed(evt);
            }
        });

        btnObrisiPRL.setText("Obrisi PRL");
        btnObrisiPRL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiPRLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnKreirajPRL, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnIzmeniPRL, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObrisiPRL, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKreirajPRL)
                    .addComponent(btnIzmeniPRL)
                    .addComponent(btnObrisiPRL))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Preliminarne rang liste:");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzmeniPRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniPRLActionPerformed

        int izabraniRed = tblPRL.getSelectedRow();
        TabelaPreliminarnihRangListi tprl = (TabelaPreliminarnihRangListi) tblPRL.getModel();
        PreliminarnaRangLista prl = tprl.vratiPRL(izabraniRed);

        this.dispose();
        FrmZaIzmenuPRL frm = new FrmZaIzmenuPRL();
        frm.postaviInfo(prl.getSifraPRL(), prl.getOpisPRL(), prl.getDatumObjavljivanjaPRL(), prl.getListaStavki());
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);

    }//GEN-LAST:event_btnIzmeniPRLActionPerformed


    private void btnObrisiPRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiPRLActionPerformed
        int indeks = tblPRL.getSelectedRow();
        if (indeks != -1) {

            TabelaPreliminarnihRangListi tk = (TabelaPreliminarnihRangListi) tblPRL.getModel();

            TransferObjekatZahtev toz = new TransferObjekatZahtev();
            toz.setOperacija(Operacija.OBRISI_PRL);

            PreliminarnaRangLista prl = tk.vratiPRL(indeks);
            toz.setZahtev(prl);
            KomunikacijaSaServerom.getInstanca().posajiZahtev(toz);

            this.dispose();
            FrmPreliminarneRangListe frm = new FrmPreliminarneRangListe();
            frm.setVisible(true);
            frm.setLocationRelativeTo(null);
            tk.obrisiRed(indeks);
            
        } else {
            JOptionPane.showMessageDialog(this, "Niste izabrali red!");
        }
    }//GEN-LAST:event_btnObrisiPRLActionPerformed

    private void btnKreirajPRLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajPRLActionPerformed
        UnosPreliminarneRangListe prl = new UnosPreliminarneRangListe();
        prl.setLocationRelativeTo(null);
        prl.setVisible(true);
    }//GEN-LAST:event_btnKreirajPRLActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPreliminarneRangListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPreliminarneRangListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPreliminarneRangListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPreliminarneRangListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPreliminarneRangListe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmeniPRL;
    private javax.swing.JButton btnKreirajPRL;
    private javax.swing.JButton btnObrisiPRL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPRL;
    // End of variables declaration//GEN-END:variables

    private void postaviTabelu() {

        ArrayList<PreliminarnaRangLista> preliminarneRangListe = new ArrayList<>();
        TransferObjekatZahtev toz = new TransferObjekatZahtev();
        toz.setOperacija(Operacija.VRATI_PRL);
        KomunikacijaSaServerom.getInstanca().posajiZahtev(toz);
        TransferObjekatOdgovor too = (TransferObjekatOdgovor) KomunikacijaSaServerom.getInstanca().primiOdgovor();
        preliminarneRangListe = (ArrayList<PreliminarnaRangLista>) too.getRezultat();
        TabelaPreliminarnihRangListi tpr = new TabelaPreliminarnihRangListi(preliminarneRangListe);
        tblPRL.setModel(tpr);

    }
}
