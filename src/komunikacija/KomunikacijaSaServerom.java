/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komunikacija;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import transfer.TransferObjekatOdgovor;
import transfer.TransferObjekatZahtev;

/**
 *
 * @author Bojana Komljenovic
 */
public class KomunikacijaSaServerom {

    private static KomunikacijaSaServerom instanca;
    private Socket socket;

    private KomunikacijaSaServerom() {
        try {
            socket = new Socket("localhost", 9000);
        } catch (IOException ex) {
            System.out.println("Server nije pokrenut!");
        }
    }

    public static KomunikacijaSaServerom getInstanca() {
        if (instanca == null) {
            instanca = new KomunikacijaSaServerom();
        }
        return instanca;
    }

    public void posajiZahtev(TransferObjekatZahtev tz) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(tz);
        } catch (IOException ex) {
            Logger.getLogger(KomunikacijaSaServerom.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Object primiOdgovor() {
        TransferObjekatOdgovor to = new TransferObjekatOdgovor();
        try {
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            to = (TransferObjekatOdgovor) ois.readObject();
        } catch (IOException ex) {
            Logger.getLogger(KomunikacijaSaServerom.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KomunikacijaSaServerom.class.getName()).log(Level.SEVERE, null, ex);
        }
        return to;
    }

}
