/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.model;

import domen.PreliminarnaRangLista;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bojana Komljenovic
 */
public class TabelaPreliminarnihRangListi extends AbstractTableModel {

    ArrayList<PreliminarnaRangLista> prl;
    String[] header = {"#", "Datum objavljivanja", "Opis"};

    public TabelaPreliminarnihRangListi() {
        prl = new ArrayList<>();
    }

    public TabelaPreliminarnihRangListi(ArrayList<PreliminarnaRangLista> prl) {
        this.prl = prl;
    }

    @Override
    public int getRowCount() {
        return prl.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int row, int column) {

        PreliminarnaRangLista p = prl.get(row);
        switch (column) {
            case 0:
                return p.getSifraPRL();
            case 1:
                return p.getDatumObjavljivanjaPRL();
            case 2:
                return p.getOpisPRL();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int i) {
        return header[i];
    }

    public void obrisiRed(int indeks) {
        prl.remove(indeks);
    }

    public PreliminarnaRangLista vratiPRL(int izabraniRed) {
        return prl.get(izabraniRed);
    }

}
