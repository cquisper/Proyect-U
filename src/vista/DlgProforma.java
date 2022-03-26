package vista;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;

/**
 * @author prueb
 */
public class DlgProforma extends javax.swing.JDialog {

    private String[] datosProforma;
    private float[] caracteristicasMag;// tiempo, kilometraje, velocidad, velocidad instantenea, aceleracion
    private String direccion = "Documents\\repertorioProforma.txt";

    public DlgProforma(java.awt.Frame parent, boolean modal, String[] datosProforma, float[] caracteristicasMag) {
        super(parent, modal);
        this.datosProforma = datosProforma;
        this.caracteristicasMag = caracteristicasMag;
        initComponents();
        vistaProforma();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenesVentanas/logo_coolscooter.png")));
        //setSize(520, 650);
    }

    private DlgProforma(JFrame jFrame, boolean b) {
    }
    
    private void vistaProforma() {
        if (datosProforma.length == 8) {
            txtareaBoleta.setText("\t        PROFORMA ELECTRÓNICA"
                    + "\nF073 N° " + numeroProforma()
                    + "\nTienda: "
                    + "CA. NARCISO DE LA COLINA 340\nMIRAFLORES 15074 - LIMA"
                    + "\nFECHA DE EMISIÓN: " + datosProforma[3]
                    + "\nCLIENTE: " + datosProforma[0]
                    + "\nTELEFONO: " + datosProforma[1]
                    + "\nDNI: " + datosProforma[2]
                    + "\n*********************************************"
                    + "\nCARACTERÍSTICAS DEL VEHÍCULO: "
                    + "\nTipo de vehículo: " + datosProforma[4]
                    + "\nMarca: " + datosProforma[5]
                    + "\nModelo: " + datosProforma[6]
                    + "\nCodigo de producto: " + datosProforma[7]
                    + "\n*********************************************"
                    + "\nCARACTERÍSTICAS FÍSICAS DEL VEHÍCULO: "
                    + "\nTiempo: " + caracteristicasMag[0] + "s"
                    + "\nDistancia: " + caracteristicasMag[1] + "m"
                    + "\nVelocidad: " + caracteristicasMag[2] + "m/s"
                    + "\nVelocidad instantenea: " + caracteristicasMag[3] + "m/s"
                    + "\nAceleración: " + caracteristicasMag[4] + "m/s^2"
                    + "\n*********************************************"
                    + "\nANOTACIONES: "
                    + "\n" + "Sin anotaciones adicionales"
                    + "\n*********************************************"
            );
        } else {
            txtareaBoleta.setText("\t        PROFORMA ELECTRÓNICA"
                    + "\nF073 N° " + numeroProforma()
                    + "\nTienda: "
                    + "CA. NARCISO DE LA COLINA 340\nMIRAFLORES 15074 - LIMA"
                    + "\nFECHA DE EMISIÓN: " + datosProforma[3]
                    + "\nCLIENTE: " + datosProforma[0]
                    + "\nTELEFONO: " + datosProforma[1]
                    + "\nDNI: " + datosProforma[2]
                    + "\n*********************************************"
                    + "\nCARACTERÍSTICAS DEL VEHÍCULO: "
                    + "\nTipo de vehículo: " + datosProforma[4]
                    + "\nMarca: " + datosProforma[5]
                    + "\nModelo: " + datosProforma[6]
                    + "\nCodigo de producto: " + datosProforma[7]
                    + "\n*********************************************"
                    + "\nCARACTERÍSTICAS FÍSICAS DEL VEHÍCULO:"
                    + "\nTiempo: " + caracteristicasMag[0] + "s"
                    + "\nDistancia: " + caracteristicasMag[1] + "m"
                    + "\nVelocidad: " + caracteristicasMag[2] + "m/s"
                    + "\nVelocidad instantenea: " + caracteristicasMag[3] + "m/s"
                    + "\nAceleración: " + caracteristicasMag[4] + "m/s^2"
                    + "\n*********************************************"
                    + "\nANOTACIONES: "
                    + "\n" + datosProforma[8]
                    + "\n*********************************************"
            );
        }
    }

    private int numeroProforma() {
        String cadena;
        int numeroProforma = 0;
        try {
            FileReader lector = new FileReader(direccion);
            BufferedReader lectura = new BufferedReader(lector);

            while ((cadena = lectura.readLine()) != null) {
                numeroProforma++;
            }

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        
        return numeroProforma;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbltituloBoleta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaBoleta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbltituloBoleta2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltituloBoleta.setFont(new java.awt.Font("Segoe UI", 0, 35)); // NOI18N
        lbltituloBoleta.setForeground(new java.awt.Color(0, 0, 0));
        lbltituloBoleta.setText("CoolScooter");
        jPanel1.add(lbltituloBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        txtareaBoleta.setEditable(false);
        txtareaBoleta.setBackground(new java.awt.Color(255, 255, 255));
        txtareaBoleta.setColumns(15);
        txtareaBoleta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtareaBoleta.setLineWrap(true);
        txtareaBoleta.setRows(5);
        txtareaBoleta.setBorder(null);
        txtareaBoleta.setMinimumSize(new java.awt.Dimension(50, 50));
        jScrollPane1.setViewportView(txtareaBoleta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 520, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProforma/imgProforma.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 80, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProforma/imgCoolScooter.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 160, 80, 70));

        lbltituloBoleta2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 45)); // NOI18N
        lbltituloBoleta2.setForeground(new java.awt.Color(255, 255, 255));
        lbltituloBoleta2.setText("Proforma");
        jPanel1.add(lbltituloBoleta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProforma/imgSalir.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProforma/imgSalirSelec.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProforma/imgSalir.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProforma/imgFondoPro.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DlgProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgProforma dialog = new DlgProforma(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltituloBoleta;
    private javax.swing.JLabel lbltituloBoleta2;
    private javax.swing.JTextArea txtareaBoleta;
    // End of variables declaration//GEN-END:variables
}
