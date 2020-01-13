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
                    JOptionPane.showMessageDialog(null, "Något gick fel med uppkopplingen!");
                    System.out.println(undantag3);
                }
            }
        }
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Huvudfönster(db).setVisible(true);
            }
        });
    }    
}

