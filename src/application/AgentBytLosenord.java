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
public class AgentBytLosenord extends javax.swing.JFrame {

    private String agentID;
    private static InfDB db;
    /**
     * Creates new form BytLosenord
     */
    public AgentBytLosenord(InfDB db, String agentID) {
        this.agentID = agentID;
        this.db = db;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        headerLbl = new javax.swing.JLabel();
        mibpLbl = new javax.swing.JLabel();
        sidLbl = new javax.swing.JLabel();
        skiljestreck = new javax.swing.JSeparator();
        body = new javax.swing.JPanel();
        bytLosenPanel = new javax.swing.JPanel();
        gammaltLosenLbl = new javax.swing.JLabel();
        nyLosenLbl1 = new javax.swing.JLabel();
        nyLosenLbl2 = new javax.swing.JLabel();
        gammaltLosen = new javax.swing.JPasswordField();
        nyLosen = new javax.swing.JPasswordField();
        nyLosen2 = new javax.swing.JPasswordField();
        bytLosen = new javax.swing.JButton();
        avbryt = new javax.swing.JButton();
        skiljestreck1 = new javax.swing.JSeparator();
        skiljestreck2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        header.setBackground(new java.awt.Color(80, 80, 80));
        header.setPreferredSize(new java.awt.Dimension(1095, 100));

        headerLbl.setBackground(new java.awt.Color(120, 120, 120));
        headerLbl.setFont(new java.awt.Font("Lucida Grande", 0, 28)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(200, 200, 200));
        headerLbl.setText("Men in Black - Sektor Skandinavien");

        mibpLbl.setBackground(new java.awt.Color(120, 120, 120));
        mibpLbl.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        mibpLbl.setForeground(new java.awt.Color(200, 200, 200));
        mibpLbl.setText("MiB-Portalen");

        sidLbl.setBackground(new java.awt.Color(120, 120, 120));
        sidLbl.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        sidLbl.setForeground(new java.awt.Color(200, 200, 200));
        sidLbl.setText("Byt Lösenord");

        skiljestreck.setForeground(new java.awt.Color(200, 200, 200));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mibpLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sidLbl)
                        .addGap(39, 39, 39))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(skiljestreck, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(headerLbl))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(headerLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skiljestreck, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mibpLbl)
                    .addComponent(sidLbl))
                .addContainerGap())
        );

        body.setBackground(new java.awt.Color(40, 40, 40));
        body.setForeground(new java.awt.Color(100, 100, 100));

        bytLosenPanel.setBackground(new java.awt.Color(160, 160, 160));
        bytLosenPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bytLosenPanel.setPreferredSize(new java.awt.Dimension(360, 180));

        gammaltLosenLbl.setForeground(new java.awt.Color(0, 0, 0));
        gammaltLosenLbl.setText("Gammalt lösenord:");

        nyLosenLbl1.setForeground(new java.awt.Color(0, 0, 0));
        nyLosenLbl1.setText("Nytt lösenord:");

        nyLosenLbl2.setForeground(new java.awt.Color(0, 0, 0));
        nyLosenLbl2.setText("Lösenord:");

        gammaltLosen.setText("123");

        nyLosen.setText("123");

        nyLosen2.setText("123");
        nyLosen2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nyLosen2KeyPressed(evt);
            }
        });

        bytLosen.setText("Byt lösenord");
        bytLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bytLosenActionPerformed(evt);
            }
        });

        avbryt.setText("Avbryt");
        avbryt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytActionPerformed(evt);
            }
        });

        skiljestreck1.setForeground(new java.awt.Color(180, 180, 180));

        skiljestreck2.setForeground(new java.awt.Color(180, 180, 180));

        javax.swing.GroupLayout bytLosenPanelLayout = new javax.swing.GroupLayout(bytLosenPanel);
        bytLosenPanel.setLayout(bytLosenPanelLayout);
        bytLosenPanelLayout.setHorizontalGroup(
            bytLosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bytLosenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bytLosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(skiljestreck1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bytLosenPanelLayout.createSequentialGroup()
                        .addGroup(bytLosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bytLosenPanelLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(bytLosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gammaltLosenLbl)
                                    .addComponent(nyLosenLbl1)
                                    .addComponent(nyLosenLbl2))
                                .addGap(18, 18, 18)
                                .addGroup(bytLosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nyLosen)
                                    .addComponent(gammaltLosen)
                                    .addComponent(nyLosen2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                            .addComponent(skiljestreck2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bytLosenPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(bytLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(avbryt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addContainerGap())
        );
        bytLosenPanelLayout.setVerticalGroup(
            bytLosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bytLosenPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(bytLosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gammaltLosenLbl)
                    .addComponent(gammaltLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skiljestreck1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(bytLosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nyLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nyLosenLbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bytLosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nyLosenLbl2)
                    .addComponent(nyLosen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skiljestreck2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bytLosenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bytLosen)
                    .addComponent(avbryt))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setToolTipText("");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(bytLosenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addComponent(jSeparator1)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(bytLosenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bytLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bytLosenActionPerformed
        // TODO add your handling code here:
        try{
            if(new String(gammaltLosen.getPassword()).equals(db.fetchSingle("SELECT LOSENORD FROM AGENT WHERE AGENT_ID = " + agentID)) 
                    && Validering.passwordNotEmpty(nyLosen, nyLosen2)
                    && Validering.passwordLengthCheck(nyLosen)
                    && Validering.newPasswordMatch(nyLosen, nyLosen2)){
                db.update("UPDATE AGENT SET LOSENORD=\'" + new String(nyLosen.getPassword()) + "\' WHERE AGENT_ID=" + agentID);
                JOptionPane.showMessageDialog(null, "Nytt lösenord satt!");
                AgentBytLosenord.this.dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Fel lösenord!");
                gammaltLosen.requestFocus();
            }
        }
        catch(InfException undantag){
            JOptionPane.showMessageDialog(null, "Någonting gick fel!");
        } 
    }//GEN-LAST:event_bytLosenActionPerformed

    private void avbrytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytActionPerformed
        // TODO add your handling code here:
        AgentBytLosenord.this.dispose();
    }//GEN-LAST:event_avbrytActionPerformed

    private void nyLosen2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nyLosen2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            bytLosen.doClick();
        }
    }//GEN-LAST:event_nyLosen2KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avbryt;
    private javax.swing.JPanel body;
    private javax.swing.JButton bytLosen;
    private javax.swing.JPanel bytLosenPanel;
    private javax.swing.JPasswordField gammaltLosen;
    private javax.swing.JLabel gammaltLosenLbl;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mibpLbl;
    private javax.swing.JPasswordField nyLosen;
    private javax.swing.JPasswordField nyLosen2;
    private javax.swing.JLabel nyLosenLbl1;
    private javax.swing.JLabel nyLosenLbl2;
    private javax.swing.JLabel sidLbl;
    private javax.swing.JSeparator skiljestreck;
    private javax.swing.JSeparator skiljestreck1;
    private javax.swing.JSeparator skiljestreck2;
    // End of variables declaration//GEN-END:variables
}
