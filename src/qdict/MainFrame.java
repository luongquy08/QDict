/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qdict;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Quy
 */
public class MainFrame extends javax.swing.JFrame {
    /*
    * @param dataEv doi tuong de luu du lieu file E_V.txt
    * @param dataVe doi tuong de luu du lieu file V_E.txt
    * @param dataAddedEv doi tuong de luu du lieu file addedE_V.txt
    * @param dataAddVe doi tuong de luu du lieu file addedV_E.txt
    * @param SeLan bien de luu viec chon ngon ngu (select language)
    */
    private ReadData dataEv;
    private ReadData dataVe;
    private ReadData dataAddedEv;
    private ReadData dataAddedVe;
    private int SeLan = 1;
    private boolean addBoolean = false;
    private addWordFrame addFrame;
    private ShowListFrame showListFrame;
    private Introduce introduce;
    final static String FILE_PATH_EV = "data/tu.txt";
    final static String FILE_PATH_VE = "data/tu1.txt";
    final static String FILE_PATH_ADDED_EV = "data/addedE_V.txt";
    final static String FILE_PATH_ADDED_VE = "data/addedV_E.txt";
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setResizable(false);
        this.setLocation(500, 50);
        
        try {
            dataEv = new ReadData(FILE_PATH_EV);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            dataVe = new ReadData(FILE_PATH_VE);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            dataAddedEv = new ReadData(FILE_PATH_ADDED_EV);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            dataAddedVe = new ReadData(FILE_PATH_ADDED_VE);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        addFrame = new addWordFrame(dataAddedEv.getMap(), dataAddedVe.getMap());
        showListFrame = new ShowListFrame(dataAddedEv.getMap(), dataAddedVe.getMap());
        introduce = new Introduce();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        tfWord = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btSearch = new javax.swing.JButton();
        lbMean = new javax.swing.JLabel();
        cbSeLan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btSpeak = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMean = new javax.swing.JTextPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        subMnAdd = new javax.swing.JMenuItem();
        subMnList = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        subMnIntroduce = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Từ điển QDict");
        setPreferredSize(new java.awt.Dimension(480, 600));

        jLabel2.setText("Từ cần tra");

        btSearch.setText("Tra nghĩa");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        lbMean.setText("Nghĩa của từ");

        cbSeLan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En->Vi", "Vi->En" }));
        cbSeLan.setToolTipText("Select Language");
        cbSeLan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSeLanItemStateChanged(evt);
            }
        });
        cbSeLan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeLanActionPerformed(evt);
            }
        });

        jLabel4.setText("<html><b><font color=\"green\">Welcome to QDict</font></b></html>");

        btSpeak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qdict/images/speaker.png"))); // NOI18N
        btSpeak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSpeakActionPerformed(evt);
            }
        });

        txtMean.setEditable(false);
        txtMean.setContentType("text/html"); // NOI18N
        jScrollPane1.setViewportView(txtMean);

        jMenu3.setText("File");

        subMnAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        subMnAdd.setText("Add New Word");
        subMnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnAddActionPerformed(evt);
            }
        });
        jMenu3.add(subMnAdd);

        subMnList.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        subMnList.setText("Edit & Delete");
        subMnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnListActionPerformed(evt);
            }
        });
        jMenu3.add(subMnList);

        jMenuBar2.add(jMenu3);

        jMenu5.setText("Introduce");

        subMnIntroduce.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        subMnIntroduce.setText("Introduce");
        subMnIntroduce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMnIntroduceActionPerformed(evt);
            }
        });
        jMenu5.add(subMnIntroduce);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Contact Us");
        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfWord, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSpeak, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSeLan, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSearch)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbMean))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tfWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSeLan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btSpeak, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btSearch)
                .addGap(11, 11, 11)
                .addComponent(lbMean)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btSpeak, cbSeLan, tfWord});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        String word = tfWord.getText();
        word = Std.StdStr(word);
        lbMean.setText("<html>Nghĩa của từ <b><i color='green'>" + word + "</i></b> : </html>");
        if(1 == SeLan){
            try {
                txtMean.setText(dataEv.searchMean(word));
            } catch (NullPointerException e) {
                try {
                    txtMean.setText(dataAddedEv.searchMean(word));
                } catch (NullPointerException e1) {
                    txtMean.setText("<html><i color='red'>Không có từ cần tìm kiếm</i></html>");
                } 
            }
        }else{
            try {
                txtMean.setText(dataVe.searchMean(word));
            } catch (NullPointerException e) {
                try {
                    txtMean.setText(dataAddedVe.searchMean(word));
                } catch (Exception e1) {
                    txtMean.setText("<html><i color='red'>Không có từ cần tìm kiếm</i></html>");
                }
            }
        }        
    }//GEN-LAST:event_btSearchActionPerformed

    private void cbSeLanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSeLanItemStateChanged
        // TODO add your handling code here:
        if("En->Vi".equals(cbSeLan.getSelectedItem().toString())){
            SeLan = 1;
        }
        else{
            SeLan = 2;
        }
    }//GEN-LAST:event_cbSeLanItemStateChanged

    private void btSpeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSpeakActionPerformed
        Speak.voice(tfWord.getText());
    }//GEN-LAST:event_btSpeakActionPerformed

    private void subMnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnAddActionPerformed
        // TODO add your handling code here:
        addFrame.setVisible(true);
        try {
            dataAddedEv = new ReadData("data/addedE_V.txt");
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dataAddedVe = new ReadData("data/addedV_E.txt");
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_subMnAddActionPerformed

    private void subMnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnListActionPerformed
        showListFrame.setVisible(true);
    }//GEN-LAST:event_subMnListActionPerformed

    private void cbSeLanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeLanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSeLanActionPerformed

    private void subMnIntroduceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMnIntroduceActionPerformed
        introduce.setVisible(true);
    }//GEN-LAST:event_subMnIntroduceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame mf = new MainFrame();
                mf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btSpeak;
    private javax.swing.JComboBox<String> cbSeLan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMean;
    private javax.swing.JMenuItem subMnAdd;
    private javax.swing.JMenuItem subMnIntroduce;
    private javax.swing.JMenuItem subMnList;
    private javax.swing.JTextField tfWord;
    private javax.swing.JTextPane txtMean;
    // End of variables declaration//GEN-END:variables
}
