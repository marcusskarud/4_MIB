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
public class Login extends javax.swing.JFrame  {

    private static InfDB db;
    private boolean entitetstyp;
    private String  checktyp = "agentID";
    /**
     * Creates new form agentLogin
     */
    // Direkt i konstruktorn k�rs metoden "Checkentitetstyp" som kollar ifall det �r en alien eller agent som skall loggas in.
    public Login(InfDB db, boolean entitetstyp) {
        this.db = db;
        this.entitetstyp = entitetstyp;
        initComponents();
        checkEntitetstyp(entitetstyp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        mibPortalLabel = new javax.swing.JLabel();
        sidLabel = new javax.swing.JLabel();
        skiljeStreck1 = new javax.swing.JSeparator();
        bodyPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        iDLabel = new javax.swing.JLabel();
        iDTextField = new javax.swing.JTextField();
        losenordLabel = new javax.swing.JLabel();
        losenordPasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        skiljeStreck2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        headerPanel.setBackground(new java.awt.Color(80, 80, 80));
        headerPanel.setPreferredSize(new java.awt.Dimension(1095, 100));

        headerLabel.setBackground(new java.awt.Color(120, 120, 120));
        headerLabel.setFont(new java.awt.Font("Lucida Grande", 0, 28)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(200, 200, 200));
        headerLabel.setText("Men in Black - Sektor Skandinavien");

        mibPortalLabel.setBackground(new java.awt.Color(120, 120, 120));
        mibPortalLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        mibPortalLabel.setForeground(new java.awt.Color(200, 200, 200));
        mibPortalLabel.setText("MiB-Portalen");

        sidLabel.setBackground(new java.awt.Color(120, 120, 120));
        sidLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        sidLabel.setForeground(new java.awt.Color(200, 200, 200));
        sidLabel.setText("AgentLogin");

        skiljeStreck1.setForeground(new java.awt.Color(200, 200, 200));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mibPortalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sidLabel)
                        .addGap(39, 39, 39))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(skiljeStreck1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(headerLabel))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(headerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skiljeStreck1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mibPortalLabel)
                    .addComponent(sidLabel))
                .addContainerGap())
        );

        bodyPanel.setBackground(new java.awt.Color(40, 40, 40));
        bodyPanel.setForeground(new java.awt.Color(100, 100, 100));

        loginPanel.setBackground(new java.awt.Color(160, 160, 160));
        loginPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        iDLabel.setForeground(new java.awt.Color(0, 0, 0));
        iDLabel.setText("AgentID:");

        iDTextField.setText("AgentID");

        losenordLabel.setForeground(new java.awt.Color(0, 0, 0));
        losenordLabel.setText("L�senord:");

        losenordPasswordField.setText("12345");
        losenordPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                losenordPasswordFieldActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(losenordLabel)
                            .addComponent(iDLabel))
                        .addGap(58, 58, 58)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iDTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(losenordPasswordField)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iDLabel)
                    .addComponent(iDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(losenordLabel)
                    .addComponent(losenordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        skiljeStreck2.setBackground(new java.awt.Color(0, 0, 0));
        skiljeStreck2.setForeground(new java.awt.Color(255, 255, 255));
        skiljeStreck2.setToolTipText("");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addComponent(skiljeStreck2)
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addComponent(skiljeStreck2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Denna metod utf�r alla krav f�r att logga in. Vi kollar ifall det �r en admin/vanlig agent som ska logga in eller en alien.
    // Beroende p� vilken s� utf�rs olika "if" satser f�r att kolla s� att allt �r inmatat korrekt och alla textf�lt �r ifyllda.
    // I annat fall skickas ett felmeddelande ut och anv�ndaren uppmanas att g�ra om.
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        boolean found = false;
        boolean admin = false;
        if (!Validering.textIsIntegers(iDTextField) || !Validering.passwordNotEmpty(losenordPasswordField)){
        }
        else{

            try {

                if (entitetstyp && new String(losenordPasswordField.getPassword()).equals(db.fetchSingle("SELECT LOSENORD FROM AGENT WHERE AGENT_ID = " + iDTextField.getText()))){
                    found = true;
                    // kollar ifall agent �r admin
                    if (db.fetchSingle("SELECT ADMINISTRATOR FROM AGENT WHERE AGENT_ID =" + iDTextField.getText()).equals("J")){
                        admin = true;
                    }    
                }

                if (entitetstyp && found && admin){// kollar ifall inlogg tillh�r en admin, om allt �r korrekt �ppnas jFrame "Agentportal".
                                                   // med samtliga admin-funktioner satta som true.
                    new AgentPortal(db, iDTextField.getText(), admin).setVisible(true);
                        Login.this.dispose();
                }
                else if (entitetstyp && found && !admin){// kollar ifall inlogg tillh�r en vanlig agent, om allt �r korrekt �ppnas jFrame "Agentportal".
                    new AgentPortal(db, iDTextField.getText(), admin).setVisible(true);
                        Login.this.dispose();;             
                }
                else if (entitetstyp && !found){
                    JOptionPane.showMessageDialog(null, "Ogiltigt " + checktyp + " och/eller l�senord!");             
                } // kollar ifall inlogg tillh�r en alien, om allt �r korrekt �ppnas jFrame "AlienPortal".
                else if (!entitetstyp && new String(losenordPasswordField.getPassword()).equals(db.fetchSingle("SELECT LOSENORD FROM ALIEN WHERE ALIEN_ID = " + iDTextField.getText()))){
                    new AlienPortal(db, iDTextField.getText()).setVisible(true);
                        Login.this.dispose();
                }
                else if (!entitetstyp && !new String(losenordPasswordField.getPassword()).equals(db.fetchSingle("SELECT LOSENORD FROM ALIEN WHERE ALIEN_ID = " + iDTextField.getText()))){
                    JOptionPane.showMessageDialog(null, "Ogiltigt "+ checktyp +" och/eller l�senord!");                         
                }

            }
            catch (InfException undantag){
                JOptionPane.showMessageDialog(null, "N�gonting gick fel med databasuppkopplingen!");
                System.out.println("Felet �r: " + undantag.getMessage());

            }
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed
/*
    private void lösenordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lösenordKeyPressed

    }//GEN-LAST:event_lösenordKeyPressed
*/
    private void losenordPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_losenordPasswordFieldActionPerformed
        loginButton.doClick();
    }//GEN-LAST:event_losenordPasswordFieldActionPerformed
    // �ndrar texten p� vissa labels och f�lt om en alien loggar in.
    private void checkEntitetstyp(boolean status){
        if (!status){
            checktyp = "alienID";
            iDLabel.setText("AlienID:");
            iDTextField.setText("AlienID");
            sidLabel.setText("AlienLogin");
        }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel iDLabel;
    private javax.swing.JTextField iDTextField;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel losenordLabel;
    private javax.swing.JPasswordField losenordPasswordField;
    private javax.swing.JLabel mibPortalLabel;
    private javax.swing.JLabel sidLabel;
    private javax.swing.JSeparator skiljeStreck1;
    private javax.swing.JSeparator skiljeStreck2;
    // End of variables declaration//GEN-END:variables
}
