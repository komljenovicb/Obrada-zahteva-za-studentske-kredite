/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.model;

import domen.Konkurs;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bojana Komljenovic
 */
public class TabelaKonkursa extends AbstractTableModel {

    private ArrayList<Konkurs> konkursi = new ArrayList<>();
    String[] header = {"#", "Skolska godina", "Rok podnosenja dokumentacije", "Tip konkursa", "Banka"};

    public TabelaKonkursa() {
    }

    public TabelaKonkursa(ArrayList<Konkurs> konkursi) {
        this.konkursi = konkursi;
    }

    @Override
    public int getRowCount() {
        return konkursi.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    public ArrayList<Konkurs> getKonkursi() {
        return konkursi;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Konkurs k = konkursi.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return k.getKonkursID();
            case 1:
                return k.getSkolskaGodina();
            case 2:
                return k.getRokPodnosenjaDokumentacije();
            case 3:
                return k.getTipKonkursa().getNazivTipaKonkursa();
            case 4:
                return k.getBanka().getNazivBanke();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int i) {
        return header[i];
    }

    public void obrisiRed(int indeks) {
        konkursi.remove(indeks);
        fireTableDataChanged();
    }

    public Konkurs vratiKonkurs(int index) {
        return konkursi.get(index);
    }


}
