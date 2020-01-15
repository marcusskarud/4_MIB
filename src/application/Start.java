/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author MarcusSkarud
 */
// Startklassen som instansierar databasen och �ppnar en ny jFrame av Klassen Huvudf�nster
public class Start {
    
    private static InfDB db;
    
    public static void main(String args[]) {

        try {
            String aktuellMap = System.getProperty("user.dir");
            String sokVag = aktuellMap + ("\\db\\MIBDB.FDB");
            
            db = new InfDB(sokVag);
        }
        catch (InfException undantag1) {
            try {
                String aktuellMap = System.getProperty("user.dir");
                String sokVag = aktuellMap + ("/db/MIBDB.FDB");
            
                db = new InfDB(sokVag);
            }
            catch (InfException undantag2) {
                try {
                    String aktuellMap = "/Applications";
                    String sokVag = aktuellMap + ("/db/MIBDB.FDB");
            
                    db = new InfDB(sokVag);
                }
                catch (InfException undantag3) {
                    JOptionPane.showMessageDialog(null, "N�got gick fel med uppkopplingen!");
                    System.out.println(undantag3);
                }
            }
        }
    
        // �ppnar ett nytt "Huvudf�nster" direkt.
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Huvudf�nster(db).setVisible(true);
            }
        });
    }    
}

