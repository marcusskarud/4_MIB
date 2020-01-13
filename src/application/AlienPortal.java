/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author MarcusSkarud
 */
public class AlienPortal extends javax.swing.JFrame {

    private static InfDB db;
    private String alienID;
    /**
     * Creates new form hejAgent
     */
    public AlienPortal(InfDB db, String alienID) {
        this.db = db;
        this.alienID = alienID;
        initComponents();
        
        try {
            
            alienIDLabel.setText(alienID);
            alienNamnLabel.setText(db.fetchSingle("SELECT NAMN FROM ALIEN WHERE ALIEN_ID = " + alienID));
            alienPlatsLabel.setText(db.fetchSingle("SELECT BENAMNING FROM PLATS WHERE PLATS_ID = (SELECT PLATS FROM ALIEN WHERE ALIEN_ID = " + alienID + ")"));            
            alienTelefonLabel.setText(db.fetchSingle("SELECT TELEFON FROM ALIEN WHERE ALIEN_ID = " + alienID));
            
            HashMap<String,String> omradesChefen = db.fetchRow(("SELECT * FROM AGENT WHERE AGENT_ID = (SELECT AGENT_ID FROM OMRADESCHEF WHERE OMRADE = (SELECT FINNS_I FROM PLATS JOIN ALIEN ON PLATS.PLATS_ID=ALIEN.PLATS WHERE ALIEN_ID = " + alienID + "))"));
            ocIDLabel.setText(omradesChefen.get("AGENT_ID"));
            ocNamnLabel.setText(omradesChefen.get("NAMN"));
            ocTelefonLabel.setText(omradesChefen.get("TELEFON"));            
            
            ArrayList<String> resultat = db.fetchColumn("SELECT NAMN FROM ALIEN JOIN PLATS ON PLATS.PLATS_ID=ALIEN.PLATS WHERE PLATS_ID IN (SELECT PLATS_ID FROM PLATS WHERE FINNS_I = (SELECT FINNS_I FROM PLATS JOIN ALIEN ON ALIEN.PLATS=PLATS.PLATS_ID WHERE ALIEN_ID = " + alienID + "))");
            
            String tillText = "";
            for(String namn : resultat){
               tillText += namn+"\n"; 
            }
            aliensIOmradeTextArea.setText(tillText);
        
        }
        catch (InfException undantag){
            JOptionPane.showMessageDialog(null, "Någonting gick fel!");
            System.out.println(undantag);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        mibPortalLbl = new javax.swing.JLabel();
        skiljeStreck1 = new javax.swing.JSeparator();
        sidLabel = new javax.swing.JLabel();
        bodyPanel = new javax.swing.JPanel();
        inloggadAlienPanel = new javax.swing.JPanel();
        inloggadAlienIDLabel = new javax.swing.JLabel();
        inloggadAlienNamnLabel = new javax.swing.JLabel();
        inloggadAlienTelefonLabel = new javax.swing.JLabel();
        inloggadAlienPlatsLabel = new javax.swing.JLabel();
        alienIDLabel = new javax.swing.JLabel();
        alienNamnLabel = new javax.swing.JLabel();
        alienTelefonLabel = new javax.swing.JLabel();
        alienPlatsLabel = new javax.swing.JLabel();
        bytLosenord = new javax.swing.JButton();
        skiljeStreck3 = new javax.swing.JSeparator();
        alienPortalInfoPanel = new javax.swing.JPanel();
        allaAliensIOmradeLabel = new javax.swing.JLabel();
        aliensIOmradePanel = new javax.swing.JPanel();
        aliensIOmradeScrollPane = new javax.swing.JScrollPane();
        aliensIOmradeTextArea = new javax.swing.JTextArea();
        omradeschefPanel = new javax.swing.JPanel();
        omradesChefIDLabel = new javax.swing.JLabel();
        omradesChefNamnLabel = new javax.swing.JLabel();
        omradesChefTelefonLabel = new javax.swing.JLabel();
        ocIDLabel = new javax.swing.JLabel();
        ocNamnLabel = new javax.swing.JLabel();
        ocTelefonLabel = new javax.swing.JLabel();
        omradeschefLabel = new javax.swing.JLabel();
        skiljeStreck2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        sidPanel.setBackground(new java.awt.Color(120, 120, 120));
        sidPanel.setForeground(new java.awt.Color(255, 255, 255));
        sidPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        headerPanel.setBackground(new java.awt.Color(40, 40, 40));
        headerPanel.setPreferredSize(new java.awt.Dimension(1095, 100));

        headerLabel.setBackground(new java.awt.Color(120, 120, 120));
        headerLabel.setFont(new java.awt.Font("Lucida Grande", 0, 28)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(180, 180, 180));
        headerLabel.setText("Men in Black - Sektor Skandinavien");

        mibPortalLbl.setBackground(new java.awt.Color(120, 120, 120));
        mibPortalLbl.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        mibPortalLbl.setForeground(new java.awt.Color(180, 180, 180));
        mibPortalLbl.setText("MiB-Portalen");

        skiljeStreck1.setForeground(new java.awt.Color(80, 80, 80));

        sidLabel.setBackground(new java.awt.Color(120, 120, 120));
        sidLabel.setFont(new java.awt.Font("Lucida Grande", 0, 20)); // NOI18N
        sidLabel.setForeground(new java.awt.Color(180, 180, 180));
        sidLabel.setText("AlienPortalen");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(headerLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(mibPortalLbl))
                            .addComponent(skiljeStreck1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(sidLabel)
                .addGap(39, 39, 39))
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
                    .addComponent(mibPortalLbl)
                    .addComponent(sidLabel))
                .addContainerGap())
        );

        bodyPanel.setBackground(new java.awt.Color(120, 120, 120));
        bodyPanel.setForeground(new java.awt.Color(100, 100, 100));

        inloggadAlienPanel.setBackground(new java.awt.Color(60, 60, 60));
        inloggadAlienPanel.setPreferredSize(new java.awt.Dimension(210, 166));

        inloggadAlienIDLabel.setForeground(new java.awt.Color(220, 220, 220));
        inloggadAlienIDLabel.setText("AlienID:");

        inloggadAlienNamnLabel.setForeground(new java.awt.Color(220, 220, 220));
        inloggadAlienNamnLabel.setText("Namn:");

        inloggadAlienTelefonLabel.setForeground(new java.awt.Color(220, 220, 220));
        inloggadAlienTelefonLabel.setText("Telefon:");

        inloggadAlienPlatsLabel.setForeground(new java.awt.Color(220, 220, 220));
        inloggadAlienPlatsLabel.setText("Plats:");

        alienIDLabel.setForeground(new java.awt.Color(220, 220, 220));

        alienNamnLabel.setForeground(new java.awt.Color(220, 220, 220));

        alienTelefonLabel.setForeground(new java.awt.Color(220, 220, 220));

        alienPlatsLabel.setForeground(new java.awt.Color(220, 220, 220));

        bytLosenord.setText("Byt l�senord");
        bytLosenord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bytLosenordActionPerformed(evt);
            }
        });

        skiljeStreck3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout inloggadAlienPanelLayout = new javax.swing.GroupLayout(inloggadAlienPanel);
        inloggadAlienPanel.setLayout(inloggadAlienPanelLayout);
        inloggadAlienPanelLayout.setHorizontalGroup(
            inloggadAlienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inloggadAlienPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inloggadAlienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bytLosenord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(inloggadAlienPanelLayout.createSequentialGroup()
                        .addGroup(inloggadAlienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inloggadAlienPlatsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inloggadAlienNamnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inloggadAlienTelefonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(inloggadAlienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alienNamnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alienTelefonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alienPlatsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(inloggadAlienPanelLayout.createSequentialGroup()
                        .addComponent(inloggadAlienIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(alienIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(skiljeStreck3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        inloggadAlienPanelLayout.setVerticalGroup(
            inloggadAlienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inloggadAlienPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inloggadAlienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inloggadAlienIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alienIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(skiljeStreck3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inloggadAlienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alienNamnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inloggadAlienNamnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inloggadAlienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alienTelefonLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inloggadAlienTelefonLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inloggadAlienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alienPlatsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inloggadAlienPlatsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bytLosenord)
                .addContainerGap())
        );

        alienPortalInfoPanel.setBackground(new java.awt.Color(150, 150, 150));
        alienPortalInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        allaAliensIOmradeLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        allaAliensIOmradeLabel.setForeground(new java.awt.Color(0, 0, 0));
        allaAliensIOmradeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allaAliensIOmradeLabel.setText("Alla aliens i omr�det");

        aliensIOmradeScrollPane.setPreferredSize(new java.awt.Dimension(259, 22));

        aliensIOmradeTextArea.setEditable(false);
        aliensIOmradeTextArea.setBackground(new java.awt.Color(250, 250, 250));
        aliensIOmradeTextArea.setColumns(20);
        aliensIOmradeTextArea.setLineWrap(true);
        aliensIOmradeTextArea.setRows(1);
        aliensIOmradeTextArea.setTabSize(1);
        aliensIOmradeTextArea.setToolTipText("");
        aliensIOmradeTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aliensIOmradeTextArea.setMinimumSize(new java.awt.Dimension(240, 407));
        aliensIOmradeTextArea.setPreferredSize(new java.awt.Dimension(240, 18));
        aliensIOmradeScrollPane.setViewportView(aliensIOmradeTextArea);

        javax.swing.GroupLayout aliensIOmradePanelLayout = new javax.swing.GroupLayout(aliensIOmradePanel);
        aliensIOmradePanel.setLayout(aliensIOmradePanelLayout);
        aliensIOmradePanelLayout.setHorizontalGroup(
            aliensIOmradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aliensIOmradeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        aliensIOmradePanelLayout.setVerticalGroup(
            aliensIOmradePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aliensIOmradeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        omradeschefPanel.setBackground(new java.awt.Color(200, 200, 200));
        omradeschefPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        omradesChefIDLabel.setForeground(new java.awt.Color(0, 0, 0));
        omradesChefIDLabel.setText("AgentID:");

        omradesChefNamnLabel.setForeground(new java.awt.Color(0, 0, 0));
        omradesChefNamnLabel.setText("Namn:");

        omradesChefTelefonLabel.setForeground(new java.awt.Color(0, 0, 0));
        omradesChefTelefonLabel.setText("Telefon:");

        ocIDLabel.setForeground(new java.awt.Color(0, 0, 0));

        ocNamnLabel.setForeground(new java.awt.Color(0, 0, 0));

        ocTelefonLabel.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout omradeschefPanelLayout = new javax.swing.GroupLayout(omradeschefPanel);
        omradeschefPanel.setLayout(omradeschefPanelLayout);
        omradeschefPanelLayout.setHorizontalGroup(
            omradeschefPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(omradeschefPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(omradeschefPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(omradesChefIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(omradesChefNamnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(omradesChefTelefonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(omradeschefPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ocTelefonLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ocNamnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ocIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        omradeschefPanelLayout.setVerticalGroup(
            omradeschefPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(omradeschefPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(omradeschefPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omradesChefIDLabel)
                    .addComponent(ocIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(omradeschefPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omradesChefNamnLabel)
                    .addComponent(ocNamnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(omradeschefPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omradesChefTelefonLabel)
                    .addComponent(ocTelefonLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        omradeschefLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        omradeschefLabel.setForeground(new java.awt.Color(0, 0, 0));
        omradeschefLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        omradeschefLabel.setText("Ditt omr�des omr�deschef");

        javax.swing.GroupLayout alienPortalInfoPanelLayout = new javax.swing.GroupLayout(alienPortalInfoPanel);
        alienPortalInfoPanel.setLayout(alienPortalInfoPanelLayout);
        alienPortalInfoPanelLayout.setHorizontalGroup(
            alienPortalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alienPortalInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alienPortalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(omradeschefPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(omradeschefLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alienPortalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(allaAliensIOmradeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(aliensIOmradePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        alienPortalInfoPanelLayout.setVerticalGroup(
            alienPortalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alienPortalInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alienPortalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allaAliensIOmradeLabel)
                    .addComponent(omradeschefLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alienPortalInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aliensIOmradePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(omradeschefPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inloggadAlienPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(alienPortalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alienPortalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inloggadAlienPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        skiljeStreck2.setBackground(new java.awt.Color(0, 0, 0));
        skiljeStreck2.setForeground(new java.awt.Color(255, 255, 255));
        skiljeStreck2.setToolTipText("");

        javax.swing.GroupLayout sidPanelLayout = new javax.swing.GroupLayout(sidPanel);
        sidPanel.setLayout(sidPanelLayout);
        sidPanelLayout.setHorizontalGroup(
            sidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidPanelLayout.createSequentialGroup()
                .addGroup(sidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(skiljeStreck2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        sidPanelLayout.setVerticalGroup(
            sidPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(skiljeStreck2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bytLosenordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bytLosenordActionPerformed
        new BytLosenord(db, alienID, false).setVisible(true);
    }//GEN-LAST:event_bytLosenordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alienIDLabel;
    private javax.swing.JLabel alienNamnLabel;
    private javax.swing.JLabel alienPlatsLabel;
    private javax.swing.JPanel alienPortalInfoPanel;
    private javax.swing.JLabel alienTelefonLabel;
    private javax.swing.JPanel aliensIOmradePanel;
    private javax.swing.JScrollPane aliensIOmradeScrollPane;
    private javax.swing.JTextArea aliensIOmradeTextArea;
    private javax.swing.JLabel allaAliensIOmradeLabel;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton bytLosenord;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel inloggadAlienIDLabel;
    private javax.swing.JLabel inloggadAlienNamnLabel;
    private javax.swing.JPanel inloggadAlienPanel;
    private javax.swing.JLabel inloggadAlienPlatsLabel;
    private javax.swing.JLabel inloggadAlienTelefonLabel;
    private javax.swing.JLabel mibPortalLbl;
    private javax.swing.JLabel ocIDLabel;
    private javax.swing.JLabel ocNamnLabel;
    private javax.swing.JLabel ocTelefonLabel;
    private javax.swing.JLabel omradesChefIDLabel;
    private javax.swing.JLabel omradesChefNamnLabel;
    private javax.swing.JLabel omradesChefTelefonLabel;
    private javax.swing.JLabel omradeschefLabel;
    private javax.swing.JPanel omradeschefPanel;
    private javax.swing.JLabel sidLabel;
    private javax.swing.JPanel sidPanel;
    private javax.swing.JSeparator skiljeStreck1;
    private javax.swing.JSeparator skiljeStreck2;
    private javax.swing.JSeparator skiljeStreck3;
    // End of variables declaration//GEN-END:variables
}
