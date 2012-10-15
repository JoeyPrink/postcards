/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PostcardsPanel.java
 *
 * Created on Oct 14, 2012, 1:49:45 PM
 */

package org.jdesktop.wonderland.modules.postcards.client;

/**
 *
 * @author spcworld
 */
public class PostcardsPanel extends javax.swing.JPanel {

    /** Creates new form PostcardsPanel */
    //TODO if we start the HUD from the Cell we need to pass it here
    public PostcardsPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        shootPanel = new javax.swing.JPanel();
        viewPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        annotateButton = new javax.swing.JButton();
        sendToButton = new javax.swing.JButton();
        captureButton = new javax.swing.JButton();
        postcardName = new javax.swing.JTextField();
        postcardMessage = new javax.swing.JTextField();
        addBannerCheckBox = new javax.swing.JCheckBox();
        addOWLURL = new javax.swing.JCheckBox();
        shareWithAll = new javax.swing.JCheckBox();

        javax.swing.GroupLayout shootPanelLayout = new javax.swing.GroupLayout(shootPanel);
        shootPanel.setLayout(shootPanelLayout);
        shootPanelLayout.setHorizontalGroup(
            shootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );
        shootPanelLayout.setVerticalGroup(
            shootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Shoot", shootPanel);

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("View", viewPanel);

        saveButton.setText("Save");

        annotateButton.setText("Annotate");

        sendToButton.setText("Send to ..");
        sendToButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToButtonActionPerformed(evt);
            }
        });

        captureButton.setText("Capture");

        postcardName.setText("Name your postcard here");

        postcardMessage.setText("write your message here");

        addBannerCheckBox.setText("Add Banner");

        addOWLURL.setText("Add OWL URL");

        shareWithAll.setText("Share with All");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBannerCheckBox)
                        .addGap(18, 18, 18)
                        .addComponent(addOWLURL)
                        .addGap(30, 30, 30)
                        .addComponent(shareWithAll))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(annotateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sendToButton))
                    .addComponent(postcardMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(postcardName, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(captureButton)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(captureButton)
                .addGap(8, 8, 8)
                .addComponent(postcardName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(postcardMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBannerCheckBox)
                    .addComponent(addOWLURL)
                    .addComponent(shareWithAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annotateButton)
                    .addComponent(sendToButton)
                    .addComponent(saveButton))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendToButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendToButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox addBannerCheckBox;
    private javax.swing.JCheckBox addOWLURL;
    private javax.swing.JButton annotateButton;
    private javax.swing.JButton captureButton;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField postcardMessage;
    private javax.swing.JTextField postcardName;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton sendToButton;
    private javax.swing.JCheckBox shareWithAll;
    private javax.swing.JPanel shootPanel;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables

}