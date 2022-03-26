package vista;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 * @author prueb
 */
public class FrmAnimacion extends javax.swing.JFrame {

    private Timer time;
    private ActionListener action;
    private int x = 0;
    private float ef = 0.08f;

    public FrmAnimacion() {
        initComponents();
        setLocationRelativeTo(null);
        iniciarAccion();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenesVentanas/logo_coolscooter.png")));
    }

    public void iniciarAccion() {
        jprogres.setUI(new BasicProgressBarUI() {
            @Override
            protected void paintDeterminate(Graphics g, JComponent c) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // 500 - 50
                jprogres.setOpaque(true);
                int ancho = jprogres.getWidth();
                int alto = jprogres.getHeight();
                int espacioAncho = ancho - 20;
                int espacioAlto = alto - 20;

                double porcenProgress = jprogres.getPercentComplete();

                espacioAncho = (int) (espacioAncho * porcenProgress);

                Point2D inicio = new Point2D.Double(5, 5);
                Point2D fin = new Point2D.Double(5, 5 + espacioAlto);
                float[] posicionGradiente = {0.0f, 0.25f, 1.0f};
                Color[] colors = {Color.RED, Color.ORANGE, Color.RED};
                LinearGradientPaint gradiente = new LinearGradientPaint(inicio, fin, posicionGradiente, colors);
                g2d.setPaint(gradiente);
                //------------
                RoundRectangle2D paintProgress = new RoundRectangle2D.Double(5, 5, espacioAncho + 10, espacioAlto + 10, espacioAlto + 10, espacioAlto + 10);
                g2d.fill(paintProgress);

                g2d.setColor(Color.BLACK);
                RoundRectangle2D borde = new RoundRectangle2D.Double(5, 5, ancho - 10, alto - 10, espacioAlto + 10, espacioAlto + 10);
                Stroke grosor = new BasicStroke(5.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
                g2d.setStroke(grosor);
                g2d.draw(borde);

                ImageIcon img = new ImageIcon(getClass().getResource("/imagenesInicio/imgScooterProgress.png"));
                g2d.drawImage(img.getImage(), espacioAncho - 30, 0, 50, 50, null);

            }
        });
        action = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                x++; //incrementa 
                jprogres.setValue(x);
                lblPorcentaje.setText(jprogres.getValue() + "%");
                lblPorcentaje.repaint();
                if (x == 101) {

                    dispose();
                    FrmInicio formInicio = new FrmInicio();
                    formInicio.setVisible(true);
                    time.stop();
                }
            }
            
        };
        time = new Timer(60, action);
        time.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPorcentaje = new javax.swing.JLabel();
        jprogres = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPorcentaje.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        lblPorcentaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcentaje.setText("0%");
        jPanel1.add(lblPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 130, 50));

        jprogres.setBackground(new java.awt.Color(0, 0, 113));
        jPanel1.add(jprogres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 500, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesInicio/gifAnimacion.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmAnimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnimacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnimacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jprogres;
    private javax.swing.JLabel lblPorcentaje;
    // End of variables declaration//GEN-END:variables
}
