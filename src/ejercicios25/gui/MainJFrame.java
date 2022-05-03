/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios25.gui;

import conversores.ConversorCToF;
import conversores.ConversorKgToLb;
import conversores.ConversorKhToMs;
import conversores.IConversor;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class MainJFrame extends javax.swing.JFrame {

    private IConversor conversor;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        conversor = new ConversorCToF();
        initComponents();
        setNames();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainjPanel1 = new javax.swing.JPanel();
        inputjTextField1 = new javax.swing.JTextField();
        superiorjLabel1 = new javax.swing.JLabel();
        convertirjButton1 = new javax.swing.JButton();
        inferiorjLabel2 = new javax.swing.JLabel();
        bToAJCheckBox1 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        controladoresjMenu1 = new javax.swing.JMenu();
        controlador1jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        controlador2jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        controlador3jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("1 DAW Celsius Converter");
        setResizable(false);

        inputjTextField1.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N

        superiorjLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        superiorjLabel1.setText("<User Code>");
        superiorjLabel1.setToolTipText("");

        convertirjButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        convertirjButton1.setText("Convertir");
        convertirjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirjButton1ActionPerformed(evt);
            }
        });

        inferiorjLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        inferiorjLabel2.setText("<User Code>");

        bToAJCheckBox1.setText("<User Code>");
        bToAJCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bToAJCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainjPanel1Layout = new javax.swing.GroupLayout(mainjPanel1);
        mainjPanel1.setLayout(mainjPanel1Layout);
        mainjPanel1Layout.setHorizontalGroup(
            mainjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainjPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainjPanel1Layout.createSequentialGroup()
                        .addComponent(inputjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(superiorjLabel1))
                    .addGroup(mainjPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(convertirjButton1)
                        .addGap(18, 18, 18)
                        .addComponent(inferiorjLabel2))
                    .addComponent(bToAJCheckBox1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainjPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {convertirjButton1, inputjTextField1});

        mainjPanel1Layout.setVerticalGroup(
            mainjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainjPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(superiorjLabel1))
                .addGap(18, 18, 18)
                .addGroup(mainjPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertirjButton1)
                    .addComponent(inferiorjLabel2))
                .addGap(18, 18, 18)
                .addComponent(bToAJCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controladoresjMenu1.setText("controladores");

        buttonGroup1.add(controlador1jRadioButtonMenuItem1);
        controlador1jRadioButtonMenuItem1.setSelected(true);
        controlador1jRadioButtonMenuItem1.setText("ºC to ºF");
        controlador1jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlador1jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        controladoresjMenu1.add(controlador1jRadioButtonMenuItem1);

        buttonGroup1.add(controlador2jRadioButtonMenuItem2);
        controlador2jRadioButtonMenuItem2.setText("K/h to m/s");
        controlador2jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlador2jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        controladoresjMenu1.add(controlador2jRadioButtonMenuItem2);

        buttonGroup1.add(controlador3jRadioButtonMenuItem3);
        controlador3jRadioButtonMenuItem3.setText("Kg to Lb");
        controlador3jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlador3jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        controladoresjMenu1.add(controlador3jRadioButtonMenuItem3);

        jMenuBar1.add(controladoresjMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainjPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainjPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirjButton1ActionPerformed
        String input = this.inputjTextField1.getText().replaceAll("\\,", ".");
        if (input.matches("[+-]?[0-9]+([\\.][0-9]+)?")) {
            if (!this.bToAJCheckBox1.isSelected()) {
                this.inferiorjLabel2.setText(String.format("%.2f", conversor.convertAToB(Double.valueOf(input))) + " " + conversor.getBSmall());
            } else {
                this.inferiorjLabel2.setText(String.format("%.2f", conversor.convertBToA(Double.valueOf(input))) + " " + conversor.getASmall());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe insertar un numero");
            this.inputjTextField1.setText("");

        }

    }//GEN-LAST:event_convertirjButton1ActionPerformed

    private void bToAJCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bToAJCheckBox1ActionPerformed
        if (this.bToAJCheckBox1.isSelected()) {
            this.superiorjLabel1.setText(conversor.getBname());
            this.inferiorjLabel2.setText(conversor.getAname());
            this.inputjTextField1.setText(String.format("%.2f", conversor.convertBToA(Double.valueOf(this.inputjTextField1.getText()))));

        } else {
            this.inferiorjLabel2.setText(conversor.getBname());
            this.superiorjLabel1.setText(conversor.getAname());
            this.inputjTextField1.setText(String.format("%.2f", conversor.convertAToB(Double.valueOf(this.inputjTextField1.getText()))));
            
        }
    }//GEN-LAST:event_bToAJCheckBox1ActionPerformed

    private void controlador3jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlador3jRadioButtonMenuItem3ActionPerformed
        conversor = new ConversorKgToLb();
        this.bToAJCheckBox1.setSelected(false);
        setNames();        
    }//GEN-LAST:event_controlador3jRadioButtonMenuItem3ActionPerformed

    private void controlador1jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlador1jRadioButtonMenuItem1ActionPerformed
        conversor = new ConversorCToF();
        this.bToAJCheckBox1.setSelected(false);        
        setNames();

    }//GEN-LAST:event_controlador1jRadioButtonMenuItem1ActionPerformed

    private void controlador2jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlador2jRadioButtonMenuItem2ActionPerformed
        conversor = new ConversorKhToMs();
        this.bToAJCheckBox1.setSelected(false);
        setNames();
        
    }//GEN-LAST:event_controlador2jRadioButtonMenuItem2ActionPerformed

    private void setNames() {
        this.bToAJCheckBox1.setText("convertir " + conversor.getBname()+ " a " + conversor.getAname());
        if (this.bToAJCheckBox1.isSelected()) {
            this.superiorjLabel1.setText(conversor.getBname());
            this.inferiorjLabel2.setText(conversor.getAname());
        } else {
            this.inferiorjLabel2.setText(conversor.getBname());
            this.superiorjLabel1.setText(conversor.getAname());
        }
    }

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bToAJCheckBox1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButtonMenuItem controlador1jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem controlador2jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem controlador3jRadioButtonMenuItem3;
    private javax.swing.JMenu controladoresjMenu1;
    private javax.swing.JButton convertirjButton1;
    private javax.swing.JLabel inferiorjLabel2;
    private javax.swing.JTextField inputjTextField1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel mainjPanel1;
    private javax.swing.JLabel superiorjLabel1;
    // End of variables declaration//GEN-END:variables
}
