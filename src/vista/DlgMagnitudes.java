/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Toolkit;

/**
 *
 * @author prueb
 */
public class DlgMagnitudes extends javax.swing.JDialog {

    private String magnitud;
    

    public DlgMagnitudes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setearPalabras();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenesVentanas/logo_coolscooter.png")));
    }

    public String getMagnitud() {
        return this.magnitud;
    }

    public void setearPalabras() {
        lblTiempo.setVisible(false);
        lblDistancia.setVisible(false);
        lblVelocidad.setVisible(false);
        lblAceleracion.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tgbTiempo = new javax.swing.JToggleButton();
        tgbDistancia = new javax.swing.JToggleButton();
        tgbVelocidad = new javax.swing.JToggleButton();
        tgbAceleracion = new javax.swing.JToggleButton();
        lblTiempo = new javax.swing.JLabel();
        lblDistancia = new javax.swing.JLabel();
        lblVelocidad = new javax.swing.JLabel();
        lblAceleracion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(48, 49, 71));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(115, 234, 220));
        jLabel1.setText("¿Qué desea calcular?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        tgbTiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/tiempo.png"))); // NOI18N
        tgbTiempo.setContentAreaFilled(false);
        tgbTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tgbTiempo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSeleccionadas/tiempoSelec.png"))); // NOI18N
        tgbTiempo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tgbTiempoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tgbTiempoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tgbTiempoMouseExited(evt);
            }
        });
        tgbTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbTiempoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        jPanel1.add(tgbTiempo, gridBagConstraints);

        tgbDistancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/distancia.png"))); // NOI18N
        tgbDistancia.setContentAreaFilled(false);
        tgbDistancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tgbDistancia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSeleccionadas/distanciaSelec.png"))); // NOI18N
        tgbDistancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tgbDistanciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tgbDistanciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tgbDistanciaMouseExited(evt);
            }
        });
        tgbDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbDistanciaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(tgbDistancia, gridBagConstraints);

        tgbVelocidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/velocidad.png"))); // NOI18N
        tgbVelocidad.setContentAreaFilled(false);
        tgbVelocidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tgbVelocidad.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSeleccionadas/velocidadSelec.png"))); // NOI18N
        tgbVelocidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tgbVelocidadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tgbVelocidadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tgbVelocidadMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(tgbVelocidad, gridBagConstraints);

        tgbAceleracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/aceleración.png"))); // NOI18N
        tgbAceleracion.setContentAreaFilled(false);
        tgbAceleracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tgbAceleracion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesSeleccionadas/aceleraciónSelec.png"))); // NOI18N
        tgbAceleracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tgbAceleracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tgbAceleracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tgbAceleracionMouseExited(evt);
            }
        });
        tgbAceleracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbAceleracionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel1.add(tgbAceleracion, gridBagConstraints);

        lblTiempo.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(115, 234, 220));
        lblTiempo.setText("Tiempo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(lblTiempo, gridBagConstraints);

        lblDistancia.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        lblDistancia.setForeground(new java.awt.Color(115, 234, 220));
        lblDistancia.setText("Distancia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel1.add(lblDistancia, gridBagConstraints);

        lblVelocidad.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        lblVelocidad.setForeground(new java.awt.Color(115, 234, 220));
        lblVelocidad.setText("Velocidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(lblVelocidad, gridBagConstraints);

        lblAceleracion.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        lblAceleracion.setForeground(new java.awt.Color(115, 234, 220));
        lblAceleracion.setText("Aceleración");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        jPanel1.add(lblAceleracion, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tgbTiempoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbTiempoMouseClicked
        this.magnitud = "tiempo";
        dispose();
    }//GEN-LAST:event_tgbTiempoMouseClicked

    private void tgbTiempoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbTiempoMouseEntered
        lblTiempo.setVisible(true);
    }//GEN-LAST:event_tgbTiempoMouseEntered

    private void tgbTiempoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbTiempoMouseExited
        lblTiempo.setVisible(false);
    }//GEN-LAST:event_tgbTiempoMouseExited

    private void tgbTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbTiempoActionPerformed

    }//GEN-LAST:event_tgbTiempoActionPerformed

    private void tgbDistanciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbDistanciaMouseClicked
        magnitud = "kilometraje";
        dispose();
    }//GEN-LAST:event_tgbDistanciaMouseClicked

    private void tgbDistanciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbDistanciaMouseEntered
        lblDistancia.setVisible(true);
    }//GEN-LAST:event_tgbDistanciaMouseEntered

    private void tgbDistanciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbDistanciaMouseExited
        lblDistancia.setVisible(false);
    }//GEN-LAST:event_tgbDistanciaMouseExited

    private void tgbVelocidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbVelocidadMouseClicked
        this.magnitud = "velocidad";
        dispose();
    }//GEN-LAST:event_tgbVelocidadMouseClicked

    private void tgbVelocidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbVelocidadMouseEntered
        lblVelocidad.setVisible(true);
    }//GEN-LAST:event_tgbVelocidadMouseEntered

    private void tgbVelocidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbVelocidadMouseExited
        lblVelocidad.setVisible(false);
    }//GEN-LAST:event_tgbVelocidadMouseExited

    private void tgbAceleracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbAceleracionMouseClicked
        this.magnitud = "aceleracion";
        dispose();
    }//GEN-LAST:event_tgbAceleracionMouseClicked

    private void tgbAceleracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbAceleracionMouseEntered
        lblAceleracion.setVisible(true);
    }//GEN-LAST:event_tgbAceleracionMouseEntered

    private void tgbAceleracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbAceleracionMouseExited
        lblAceleracion.setVisible(false);
    }//GEN-LAST:event_tgbAceleracionMouseExited

    private void tgbAceleracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbAceleracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgbAceleracionActionPerformed

    private void tgbDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgbDistanciaActionPerformed

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
            java.util.logging.Logger.getLogger(DlgMagnitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgMagnitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgMagnitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgMagnitudes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgMagnitudes dialog = new DlgMagnitudes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAceleracion;
    private javax.swing.JLabel lblDistancia;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblVelocidad;
    private javax.swing.JToggleButton tgbAceleracion;
    private javax.swing.JToggleButton tgbDistancia;
    private javax.swing.JToggleButton tgbTiempo;
    private javax.swing.JToggleButton tgbVelocidad;
    // End of variables declaration//GEN-END:variables
}
