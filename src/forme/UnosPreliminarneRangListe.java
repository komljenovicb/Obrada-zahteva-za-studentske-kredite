/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.IspunjavanjeUslovaKonkursa;
import domen.KoriscenjeKreditaUPrethodnojGodini;
import domen.PreliminarnaRangLista;
import domen.SpisakPrijavljenih;
import domen.StavkaPreliminarneRangListe;
import forme.model.TabelaStavki;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import komunikacija.KomunikacijaSaServerom;
import konstante.Operacija;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;

/**
 *
 * @author Bojana Komljenovic
 */
public class UnosPreliminarneRangListe extends javax.swing.JFrame {

    /**
     * Creates new form UnosRangListe
     */
    public UnosPreliminarneRangListe() {
        initComponents();
        generisiID();
        dajIUK();
        dajKKU();
        popuniSpisakPrijavljenih();
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

        txtOpisRL = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelStavkaPRL = new javax.swing.JPanel();
        btnDodajStavku = new javax.swing.JButton();
        btnIzmeniStavku = new javax.swing.JButton();
        btnObrisiStavku = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStavkePRL = new javax.swing.JTable();
        btnKreirajRangListu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmbSpisakPrijavljenih = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbIUK = new javax.swing.JComboBox<>();
        cmbKKU = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtNapomena = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtID.setEnabled(false);

        jLabel1.setText("#");

        jLabel2.setText("Opis:");

        jLabel3.setText("Datum objavljivanja: ");

        btnDodajStavku.setText("Dodaj stavku");
        btnDodajStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajStavkuActionPerformed(evt);
            }
        });

        btnIzmeniStavku.setText("Izmeni stavku");
        btnIzmeniStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniStavkuActionPerformed(evt);
            }
        });

        btnObrisiStavku.setText("Obrisi stavku");
        btnObrisiStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiStavkuActionPerformed(evt);
            }
        });

        tblStavkePRL.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblStavkePRL);

        btnKreirajRangListu.setText("Kreiraj rang listu");
        btnKreirajRangListu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajRangListuActionPerformed(evt);
            }
        });

        jLabel5.setText("IUK: ");

        jLabel6.setText("Spisak prijavljenih:");

        jLabel7.setText("KKU: ");

        jLabel8.setText("Napomena: ");

        javax.swing.GroupLayout panelStavkaPRLLayout = new javax.swing.GroupLayout(panelStavkaPRL);
        panelStavkaPRL.setLayout(panelStavkaPRLLayout);
        panelStavkaPRLLayout.setHorizontalGroup(
            panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStavkaPRLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStavkaPRLLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(465, 1000, Short.MAX_VALUE))
                    .addGroup(panelStavkaPRLLayout.createSequentialGroup()
                        .addGroup(panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(panelStavkaPRLLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelStavkaPRLLayout.createSequentialGroup()
                                        .addComponent(btnDodajStavku, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(btnIzmeniStavku, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(btnObrisiStavku, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelStavkaPRLLayout.createSequentialGroup()
                                        .addGroup(panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(26, 26, 26)
                                        .addGroup(panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNapomena, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbIUK, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbKKU, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbSpisakPrijavljenih, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnKreirajRangListu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelStavkaPRLLayout.setVerticalGroup(
            panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStavkaPRLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSpisakPrijavljenih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(11, 11, 11)
                .addGroup(panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbIUK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbKKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNapomena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(panelStavkaPRLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajStavku)
                    .addComponent(btnIzmeniStavku)
                    .addComponent(btnObrisiStavku))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKreirajRangListu)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOpisRL, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStavkaPRL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOpisRL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(panelStavkaPRL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajStavkuActionPerformed

        SpisakPrijavljenih s = (SpisakPrijavljenih) cmbSpisakPrijavljenih.getSelectedItem();
        IspunjavanjeUslovaKonkursa iuk = (IspunjavanjeUslovaKonkursa) cmbIUK.getSelectedItem();
        KoriscenjeKreditaUPrethodnojGodini kku = (KoriscenjeKreditaUPrethodnojGodini) cmbKKU.getSelectedItem();
        String napomenaPRL = txtNapomena.getText();

        String datum = txtDatum.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date dat = new Date();

        try {
            dat = sdf.parse(datum);
        } catch (ParseException ex) {
            Logger.getLogger(UnosPreliminarneRangListe.class.getName()).log(Level.SEVERE, null, ex);
        }

        TabelaStavki ts = (TabelaStavki) tblStavkePRL.getModel();

        ArrayList<StavkaPreliminarneRangListe> lista = ts.getStavke();

        StavkaPreliminarneRangListe st = new StavkaPreliminarneRangListe(Integer.parseInt(txtID.getText()), lista.size() + 1, napomenaPRL, 0.0, iuk, kku, s, "insert");

        ts.dodajStavku(st);

    }//GEN-LAST:event_btnDodajStavkuActionPerformed

    private void btnIzmeniStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniStavkuActionPerformed

        int izabraniRed = tblStavkePRL.getSelectedRow();
        if (izabraniRed != -1) {
            TabelaStavki ts = (TabelaStavki) tblStavkePRL.getModel();
            StavkaPreliminarneRangListe sp = ts.vratiStavku(izabraniRed);

            IzmenaStavkeJDialogUnos fiz = new IzmenaStavkeJDialogUnos(this, false);
            fiz.izmeniStavku(sp);

            fiz.setLocationRelativeTo(null);
            this.dispose();
            fiz.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(this, "Izaberite red!");
        }

    }//GEN-LAST:event_btnIzmeniStavkuActionPerformed

    private void btnObrisiStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiStavkuActionPerformed
        int izabraniRed = tblStavkePRL.getSelectedRow();
        if (izabraniRed != -1) {
            TabelaStavki ts = (TabelaStavki) tblStavkePRL.getModel();
            ts.obrisiRed(izabraniRed);
        } else {
            JOptionPane.showMessageDialog(this, "Odaberite red koji zelite da obrisete!");
            return;
        }
    }//GEN-LAST:event_btnObrisiStavkuActionPerformed

    private void btnKreirajRangListuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajRangListuActionPerformed

        int id = Integer.parseInt(txtID.getText());
        String datum = txtDatum.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date dat = new Date();

        if (txtID.getText().isEmpty() || txtOpisRL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Sva polja moraju biti popunjena!");
        }

        try {
            dat = sdf.parse(datum);
        } catch (ParseException ex) {
            Logger.getLogger(UnosPreliminarneRangListe.class.getName()).log(Level.SEVERE, null, ex);
        }
        String opis = txtOpisRL.getText();
        TabelaStavki ts = (TabelaStavki) tblStavkePRL.getModel();
        ArrayList<StavkaPreliminarneRangListe> listaStavki = ts.getStavke();
        PreliminarnaRangLista prl = new PreliminarnaRangLista(id, opis, dat, listaStavki);

        TransferObjekatZahtev toz = new TransferObjekatZahtev();
        toz.setOperacija(Operacija.KREIRAJ_RANG_LISTU);
        toz.setZahtev(prl);
        KomunikacijaSaServerom.getInstanca().posajiZahtev(toz);

        TransferObjekatOdgovor too = (TransferObjekatOdgovor) KomunikacijaSaServerom.getInstanca().primiOdgovor();
        String poruka = (String) too.getRezultat();
        JOptionPane.showMessageDialog(this, poruka);

        this.dispose();
        FrmPreliminarneRangListe frm = new FrmPreliminarneRangListe();
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnKreirajRangListuActionPerformed

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
            java.util.logging.Logger.getLogger(UnosPreliminarneRangListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnosPreliminarneRangListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnosPreliminarneRangListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnosPreliminarneRangListe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnosPreliminarneRangListe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajStavku;
    private javax.swing.JButton btnIzmeniStavku;
    private javax.swing.JButton btnKreirajRangListu;
    private javax.swing.JButton btnObrisiStavku;
    private javax.swing.JComboBox<Object> cmbIUK;
    private javax.swing.JComboBox<Object> cmbKKU;
    private javax.swing.JComboBox<Object> cmbSpisakPrijavljenih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelStavkaPRL;
    private javax.swing.JTable tblStavkePRL;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNapomena;
    private javax.swing.JTextField txtOpisRL;
    // End of variables declaration//GEN-END:variables

    public void postaviTabelu() {

        int id = Integer.parseInt(txtID.getText());
        
        ArrayList<StavkaPreliminarneRangListe> lista = new ArrayList<>();
        TransferObjekatZahtev toz = new TransferObjekatZahtev();
        toz.setOperacija(Operacija.VRATI_STAVKE_RANG_LISTE);
        toz.setZahtev(id);
        KomunikacijaSaServerom.getInstanca().posajiZahtev(toz);
        TransferObjekatOdgovor too = (TransferObjekatOdgovor) KomunikacijaSaServerom.getInstanca().primiOdgovor();
        lista = (ArrayList<StavkaPreliminarneRangListe>) too.getRezultat();
        TabelaStavki ts = new TabelaStavki(lista);
        tblStavkePRL.setModel(ts);

    }

    public void dajIUK() {
        ArrayList<IspunjavanjeUslovaKonkursa> iuk = new ArrayList<>();
        TransferObjekatZahtev toz = new TransferObjekatZahtev();
        toz.setOperacija(Operacija.VRATI_IUK);
        KomunikacijaSaServerom.getInstanca().posajiZahtev(toz);
        TransferObjekatOdgovor too = (TransferObjekatOdgovor) KomunikacijaSaServerom.getInstanca().primiOdgovor();
        iuk = (ArrayList<IspunjavanjeUslovaKonkursa>) too.getRezultat();
        for (IspunjavanjeUslovaKonkursa i : iuk) {
            cmbIUK.addItem(i);
        }
    }

    public void dajKKU() {
        ArrayList<KoriscenjeKreditaUPrethodnojGodini> kku = new ArrayList<>();
        TransferObjekatZahtev toz = new TransferObjekatZahtev();
        toz.setOperacija(Operacija.VRATI_KKU);
        KomunikacijaSaServerom.getInstanca().posajiZahtev(toz);
        TransferObjekatOdgovor too = (TransferObjekatOdgovor) KomunikacijaSaServerom.getInstanca().primiOdgovor();
        kku = (ArrayList<KoriscenjeKreditaUPrethodnojGodini>) too.getRezultat();
        for (KoriscenjeKreditaUPrethodnojGodini k : kku) {
            cmbKKU.addItem(k);
        }
    }

    public void popuniSpisakPrijavljenih() {
        ArrayList<SpisakPrijavljenih> prijavljeni = new ArrayList<>();
        TransferObjekatZahtev toz = new TransferObjekatZahtev();
        toz.setOperacija(Operacija.VRATI_SPISAK_PRIJAVLJENIH);
        KomunikacijaSaServerom.getInstanca().posajiZahtev(toz);
        TransferObjekatOdgovor too = (TransferObjekatOdgovor) KomunikacijaSaServerom.getInstanca().primiOdgovor();
        prijavljeni = (ArrayList<SpisakPrijavljenih>) too.getRezultat();
        for (SpisakPrijavljenih s : prijavljeni) {
            cmbSpisakPrijavljenih.addItem(s);
        }
    }

    public void sacuvajIzmene(int rbr, String napomena, KoriscenjeKreditaUPrethodnojGodini kku, IspunjavanjeUslovaKonkursa iuk) {
        TabelaStavki ts = (TabelaStavki) tblStavkePRL.getModel();
        ts.sacuvajIzmene(rbr, napomena, kku, iuk);
    }

    public void generisiID() {

        TransferObjekatZahtev toz = new TransferObjekatZahtev();
        toz.setOperacija(Operacija.VRATI_ID);
        KomunikacijaSaServerom.getInstanca().posajiZahtev(toz);

        TransferObjekatOdgovor too = (TransferObjekatOdgovor) KomunikacijaSaServerom.getInstanca().primiOdgovor();
        int id = (int) too.getRezultat();

        txtID.setText(id + "");
    }
}
