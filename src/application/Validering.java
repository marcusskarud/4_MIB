/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author MarcusSkarud
 */
public class Validering {
    
    //Kollar om textfältet är tomt.
    static public boolean textNotEmpty(JTextField txt){
        if (txt.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Textfältet är tomt!");
            txt.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }
    
    // Kollar så inte lösenordsfältet är tomt.
    static public boolean passwordNotEmpty(JPasswordField txt, JPasswordField txt2){
        if (new String(txt.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Lösenordsfältet är tomt!");
            txt.requestFocus();
            return false;
        }
        else if (new String(txt2.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Lösenordsfältet är tomt!");
            txt2.requestFocus();
            return false;
        }
        else {
            return true;
        }
    }
    
    // Kollar om de nya lösenorden matchar varandra.
    static public boolean newPasswordMatch(JPasswordField txt1, JPasswordField txt2){
        if (new String(txt1.getPassword()).equals(new String(txt2.getPassword()))){
            return true;
        }
        else{
            txt1.requestFocus();
            JOptionPane.showMessageDialog(null, "De nya lösenorden matchar inte!");
            return false;
        }
    
    }
    
    // Kollar formatet på ett textfält för att se om det överensstämmer med ett datum.
    static public boolean checkDatumFormat(JTextField datumField){
        String[] datum = datumField.toString().split("-");
        boolean allNumbers = true;
        for (String datumet : datum){
            try{
                int testInt = Integer.parseInt(datumet);
            }
            catch( NumberFormatException undantag){
                allNumbers = false;
            }
        }
        if (allNumbers && datum.length == 3 && datum[0].length() == 4 && datum[1].length() == 2 && datum[2].length() == 2){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Inmatningsfel! Datumformatet ska varanumeriskt, enligt detta format 'yyyy/MM/dd'.");
            datumField.requestFocus();
            return false;
        }
        
    }
    
    
    // Kollar om längden på lösenordet är högst 6 tecken.
    static public boolean passwordLengthCheck(JPasswordField txt){
        if (new String(txt.getPassword()).length() <= 6){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Lösenordet är för långt! Max 6 tecken.");
            txt.requestFocus();
            return false;
        }
    }
    
}
