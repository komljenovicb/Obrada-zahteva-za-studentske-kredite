/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.model;

import domen.IspunjavanjeUslovaKonkursa;
import domen.KoriscenjeKreditaUPrethodnojGodini;
import domen.StavkaPreliminarneRangListe;
import domen.StavkaSpiska;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Bojana Komljenovic
 */
public class TabelaStavki extends AbstractTableModel {

    ArrayList<StavkaPreliminarneRangListe> stavke = new ArrayList<>();
    // String[] header = {"RBRStavke", "Ime i prezime", "Mesto", "ESPB", "Ostetljiva drustvena grupa", "G.U.", "G.S.", "Uspeh", "Prihod", "Napomena PRL", "IUK", "KK"};
    String[] header = {"RBRStavke", "Student", "Mesto", "ESPB", "ukupno", "Osetljiva drustvena grupa", "Godina upisa", "Uspeh", "Prosecan prihod", "Napomena PRL", "IUK", "KK"};

    public TabelaStavki() {
    }

    public TabelaStavki(ArrayList<StavkaPreliminarneRangListe> stavke) {
        this.stavke = stavke;
    }

    public ArrayList<StavkaPreliminarneRangListe> getStavke() {
        return stavke;
    }

    @Override
    public int getRowCount() {
        return stavke.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        StavkaPreliminarneRangListe sp = stavke.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sp.getRbrStavke();
            case 1:
                for (StavkaPreliminarneRangListe st : stavke) {
                    for (StavkaSpiska stavkaSpiska : st.getSp().getListaStavki()) {
                        if (stavkaSpiska.getRbrStavkeSpiska() == st.getRbrStavke()) {
                            return stavkaSpiska.getPrijava().getStudent().getImePrezime();
                        }
                    }
                }
            case 2:
                for (StavkaPreliminarneRangListe st : stavke) {
                    for (StavkaSpiska stavkaSpiska : st.getSp().getListaStavki()) {
                        if (stavkaSpiska.getRbrStavkeSpiska() == st.getRbrStavke()) {
                            return stavkaSpiska.getPrijava().getStudent().getMestoRodjenja();
                        }
                    }
                }
            case 3:
                for (StavkaPreliminarneRangListe st : stavke) {
                    for (StavkaSpiska stavkaSpiska : st.getSp().getListaStavki()) {
                        if (stavkaSpiska.getRbrStavkeSpiska() == st.getRbrStavke()) {
                            return stavkaSpiska.getPrijava().getStudent().getEspb();
                        }
                    }
                }
            case 4:
                for (StavkaPreliminarneRangListe st : stavke) {
                    for (StavkaSpiska stavkaSpiska : st.getSp().getListaStavki()) {
                        if (stavkaSpiska.getRbrStavkeSpiska() == st.getRbrStavke()) {
                            return st.getUkupno();
                        }
                    }
                }
            case 5:
                for (StavkaPreliminarneRangListe st : stavke) {
                    for (StavkaSpiska stavkaSpiska : st.getSp().getListaStavki()) {
                        if (stavkaSpiska.getRbrStavkeSpiska() == st.getRbrStavke()) {
                            return stavkaSpiska.getPrijava().getStudent().isOsetljivaDrustvenaGrupa();
                        }
                    }
                }
            case 6:
                for (StavkaPreliminarneRangListe st : stavke) {
                    for (StavkaSpiska stavkaSpiska : st.getSp().getListaStavki()) {
                        if (stavkaSpiska.getRbrStavkeSpiska() == st.getRbrStavke()) {
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                            return sdf.format(stavkaSpiska.getPrijava().getStudent().getDatumUpisaFakulteta());
                        }
                    }
                }
            case 7:
                for (StavkaPreliminarneRangListe st : stavke) {
                    for (StavkaSpiska stavkaSpiska : st.getSp().getListaStavki()) {
                        if (stavkaSpiska.getRbrStavkeSpiska() == st.getRbrStavke()) {
                            return stavkaSpiska.getPrijava().getStudent().getUspeh();
                        }
                    }
                }
            case 8:
                for (StavkaPreliminarneRangListe st : stavke) {
                    for (StavkaSpiska stavkaSpiska : st.getSp().getListaStavki()) {
                        if (stavkaSpiska.getRbrStavkeSpiska() == st.getRbrStavke()) {
                            return stavkaSpiska.getPrijava().getStudent().getProsecanPrihodPoClanu();
                        }
                    }
                }

            case 9:
                return sp.getNapomenaPRL();
            case 10:
                return sp.getIuk();
            case 11:
                return sp.getKku();
            default:
                return "N/A";
        }
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public String getColumnName(int i) {
        return header[i];
    }

    public void obrisiRed(int izabraniRed) {
        stavke.remove(izabraniRed);
        fireTableDataChanged();
    }

    public void dodajStavku(StavkaPreliminarneRangListe st) {
        st.setRbrStavke(stavke.size() + 1);
        stavke.add(st);
        fireTableDataChanged();
    }

    public StavkaPreliminarneRangListe vratiStavku(int izabraniRed) {
        return stavke.get(izabraniRed);
    }

    public void sacuvajIzmene(int rbr, String napomena, KoriscenjeKreditaUPrethodnojGodini kku, IspunjavanjeUslovaKonkursa iuk) {
        for (StavkaPreliminarneRangListe sp : stavke) {
            if (sp.getRbrStavke() == rbr) {
                System.out.println("Izmena stavke...");
                sp.setNapomenaPRL(napomena);
                sp.setIuk(iuk);
                sp.setKku(kku);
                sp.setStatus("update");
            }
            System.out.println("" + sp.getStatus());
            fireTableDataChanged();
        }

    }

}
