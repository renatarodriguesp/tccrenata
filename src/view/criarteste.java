/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author renatarodriguespintos
 */
public class criarteste extends javax.swing.JFrame {

    /**
     * Creates new form criarteste
     */
    public criarteste() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(discriminacao);
        bg.add(identificacao);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        discriminacao = new javax.swing.JRadioButton();
        identificacao = new javax.swing.JRadioButton();
        bok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("criar teste:");

        discriminacao.setText("discriminacao ");

        identificacao.setText("identificacao ");
        identificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacaoActionPerformed(evt);
            }
        });

        bok.setText("ok");
        bok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bok)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(identificacao)
                            .addComponent(discriminacao))))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(discriminacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(identificacao)
                .addGap(28, 28, 28)
                .addComponent(bok)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void identificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificacaoActionPerformed

    private void bokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bokActionPerformed
        if (identificacao.isSelected()){
            configtesteid testes = new configtesteid();
            testes.setLocationRelativeTo(null);
            testes.setVisible(true);
        }else 
            if(discriminacao.isSelected()){
                configtestedisc testes = new configtestedisc();
            testes.setLocationRelativeTo(null);
            testes.setVisible(true);
            }else{
    JOptionPane.showMessageDialog(null, "selecione um campo!");                
            }
        
        
    }//GEN-LAST:event_bokActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bok;
    private javax.swing.JRadioButton discriminacao;
    private javax.swing.JRadioButton identificacao;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
