package vista;

import controlador.ControlJLabel;
import controlador.ControlJText;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import modelo.CalculoCinematico;

/**
 * @author CrisTh
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private Timer tiempo1;
    public int inicio = 260, max = 1200;
    boolean derecha = true, izquierda = false;
    private String magnitud;
    private ControlJLabel label;
    private ControlJText jtext;
    private CalculoCinematico calcular;
    private float resultado, velocidadIns;
    private float[] caracteristicasMag = new float[5];// tiempo, kilometraje, velocidad, velocidad instantenea, aceleracion
    private String user;

    public FrmPrincipal(String magnitud, String user) {
        this.magnitud = magnitud;
        this.user = user;
        initComponents();
        control();
        controlTime();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenesVentanas/logo_coolscooter.png")));
        setResizable(true);
    }

    private void control() {
        label = new ControlJLabel(this.magnitud);// instancia del controlador label que va a instanciar los 3 JlLabel
        this.panelPrincipal.add(label.primeraEtiqueta()); // primer JLabel
        this.panelPrincipal.add(label.segundaEtiqueta());// segundo JLabel
        this.panelPrincipal.add(label.terceraEtiqueta());// tercer JLabel
        label.iniciarActionEvent();

        jtext = new ControlJText(this.magnitud);// instancia del controlador jttextfield que va a instanciar los 3 jtextfield
        jtext.setVehiculo("bc"); // Para que en el momento de ejecutar la vista este selecionada la bicicleta por defecto
        tgbBicicleta.setSelected(true);// El tgbbutton aparesca selecionado
        this.panelPrincipal.add(jtext.primerJText());  // primer Jtext
        this.panelPrincipal.add(jtext.segundoJText());// segundo Jtext
        this.panelPrincipal.add(jtext.tercerJText());// tercer Jtext

        calcular = new CalculoCinematico(this.magnitud);// instancia del objeto calculoMruv
        if (this.magnitud.equals("kilometraje")) {
            lblMagnitud.setText("DISTANCIA"); // cambia el label para indicar la magnitud
            
        }else{
            lblMagnitud.setText(this.magnitud.toUpperCase());
        }
        menuItemUser.setText("  " + user);

    }

    private void controlTime() {
        lblTricicloIz.setIcon(null);
        tiempo1 = new Timer(20, mov);
        tiempo1.start();
    }

    private ActionListener mov = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (derecha == true) {
                lblTriciclo.setLocation(lblTriciclo.getX() + 5, lblTriciclo.getY());
                panelAzul.repaint();
                lblTriciclo.repaint();
                if (lblTriciclo.getX() >= max) {
                    derecha = false;
                    izquierda = true;
                    lblTricicloIz.setIcon(new ImageIcon(getClass().getResource("/imagenesVentanas/tricicloIzquierda.png")));
                    lblTriciclo.setIcon(null);
                }
            }

            if (izquierda == true) {
                lblTricicloIz.setLocation(lblTricicloIz.getX() - 5, lblTricicloIz.getY());
                panelAzul.repaint();
                lblTricicloIz.repaint();

                if (lblTricicloIz.getX() <= inicio) {
                    lblTriciclo.setIcon(new ImageIcon(getClass().getResource("/imagenesVentanas/tricicloDerecha.png")));
                    lblTricicloIz.setIcon(null);
                    derecha = true;
                    izquierda = false;
                }
            }

        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngVehiculos = new javax.swing.ButtonGroup();
        panelAzul = new javax.swing.JPanel();
        lblCoolScooter = new javax.swing.JLabel();
        lblTriciclo = new javax.swing.JLabel();
        lblTricicloIz = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        tgbBicicleta = new javax.swing.JToggleButton();
        tgbScooter = new javax.swing.JToggleButton();
        tgbSkater = new javax.swing.JToggleButton();
        btnCrearProforma = new javax.swing.JButton();
        btnVelocidadInstantanea = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaInformacion = new javax.swing.JTextArea();
        btnCalcular = new javax.swing.JButton();
        lblMagnitud = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        MBprincipal = new javax.swing.JMenuBar();
        menuItemUser = new javax.swing.JMenu();
        menuItemCerrarSesión = new javax.swing.JMenuItem();
        menuItemMagnitud = new javax.swing.JMenu();
        menuItemPagWeb = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("                PROYECT-  U");
        setPreferredSize(new java.awt.Dimension(1180, 720));

        panelAzul.setBackground(new java.awt.Color(43, 75, 124));
        panelAzul.setPreferredSize(new java.awt.Dimension(1080, 60));
        panelAzul.setRequestFocusEnabled(false);
        panelAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCoolScooter.setFont(new java.awt.Font("Consolas", 3, 36)); // NOI18N
        lblCoolScooter.setForeground(new java.awt.Color(15, 191, 164));
        lblCoolScooter.setText("COOLSCOOTER");
        panelAzul.add(lblCoolScooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 10, 240, 50));

        lblTriciclo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/tricicloDerecha.png"))); // NOI18N
        panelAzul.add(lblTriciclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 70, 60));

        lblTricicloIz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/tricicloIzquierda.png"))); // NOI18N
        panelAzul.add(lblTricicloIz, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 70, 60));

        getContentPane().add(panelAzul, java.awt.BorderLayout.PAGE_START);

        panelPrincipal.setBackground(new java.awt.Color(48, 49, 71));
        panelPrincipal.setToolTipText("");
        panelPrincipal.setLayout(null);

        tgbBicicleta.setBackground(new java.awt.Color(118, 156, 153));
        btngVehiculos.add(tgbBicicleta);
        tgbBicicleta.setForeground(new java.awt.Color(0, 0, 0));
        tgbBicicleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/imgBicicleta.png"))); // NOI18N
        tgbBicicleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tgbBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbBicicletaActionPerformed(evt);
            }
        });
        panelPrincipal.add(tgbBicicleta);
        tgbBicicleta.setBounds(340, 40, 220, 190);

        tgbScooter.setBackground(new java.awt.Color(201, 226, 101));
        btngVehiculos.add(tgbScooter);
        tgbScooter.setForeground(new java.awt.Color(0, 0, 0));
        tgbScooter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/imgScooter.png"))); // NOI18N
        tgbScooter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tgbScooter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbScooterActionPerformed(evt);
            }
        });
        panelPrincipal.add(tgbScooter);
        tgbScooter.setBounds(585, 40, 220, 190);

        tgbSkater.setBackground(new java.awt.Color(248, 192, 125));
        btngVehiculos.add(tgbSkater);
        tgbSkater.setForeground(new java.awt.Color(0, 0, 0));
        tgbSkater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/imgSkater.png"))); // NOI18N
        tgbSkater.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tgbSkater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbSkaterActionPerformed(evt);
            }
        });
        panelPrincipal.add(tgbSkater);
        tgbSkater.setBounds(830, 40, 290, 190);

        btnCrearProforma.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnCrearProforma.setForeground(new java.awt.Color(122, 121, 119));
        btnCrearProforma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/imgCrearProforma.png"))); // NOI18N
        btnCrearProforma.setText("Crear proforma electrónica");
        btnCrearProforma.setContentAreaFilled(false);
        btnCrearProforma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearProforma.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCrearProforma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearProformaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearProformaMouseExited(evt);
            }
        });
        btnCrearProforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProformaActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCrearProforma);
        btnCrearProforma.setBounds(330, 480, 330, 50);

        btnVelocidadInstantanea.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnVelocidadInstantanea.setForeground(new java.awt.Color(122, 121, 119));
        btnVelocidadInstantanea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/imgVelocidadInst.png"))); // NOI18N
        btnVelocidadInstantanea.setText("Velocidad instantánea ");
        btnVelocidadInstantanea.setToolTipText("");
        btnVelocidadInstantanea.setContentAreaFilled(false);
        btnVelocidadInstantanea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVelocidadInstantanea.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVelocidadInstantanea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVelocidadInstantaneaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVelocidadInstantaneaMouseExited(evt);
            }
        });
        btnVelocidadInstantanea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVelocidadInstantaneaActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnVelocidadInstantanea);
        btnVelocidadInstantanea.setBounds(330, 380, 310, 50);

        txtaInformacion.setEditable(false);
        txtaInformacion.setBackground(new java.awt.Color(220, 142, 49));
        txtaInformacion.setColumns(20);
        txtaInformacion.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 24)); // NOI18N
        txtaInformacion.setRows(5);
        jScrollPane1.setViewportView(txtaInformacion);

        panelPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(670, 270, 450, 260);

        btnCalcular.setBackground(new java.awt.Color(204, 255, 204));
        btnCalcular.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(122, 121, 119));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/imgCalcular.png"))); // NOI18N
        btnCalcular.setText("Calcular magnitud");
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalcularMouseExited(evt);
            }
        });
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCalcular);
        btnCalcular.setBounds(330, 280, 250, 50);

        lblMagnitud.setFont(new java.awt.Font("Segoe UI Black", 0, 27)); // NOI18N
        lblMagnitud.setForeground(new java.awt.Color(122, 121, 119));
        lblMagnitud.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMagnitud.setText("TIEMPO");
        lblMagnitud.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblMagnitudFocusGained(evt);
            }
        });
        panelPrincipal.add(lblMagnitud);
        lblMagnitud.setBounds(36, 48, 270, 50);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgTelf.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgTelfSelec.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgTelf.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelPrincipal.add(jButton1);
        jButton1.setBounds(210, 480, 60, 60);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgFb.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgFbSelec.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgFb.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelPrincipal.add(jButton2);
        jButton2.setBounds(30, 480, 60, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgWsp.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgWspSelec.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgWsp.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelPrincipal.add(jButton3);
        jButton3.setBounds(120, 480, 60, 60);

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        MBprincipal.setBackground(new java.awt.Color(84, 156, 159));
        MBprincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MBprincipal.setEnabled(false);
        MBprincipal.setFocusCycleRoot(true);
        MBprincipal.setFocusable(false);
        MBprincipal.setOpaque(true);

        menuItemUser.setBackground(new java.awt.Color(84, 156, 159));
        menuItemUser.setForeground(new java.awt.Color(255, 255, 255));
        menuItemUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/imgUser.png"))); // NOI18N
        menuItemUser.setText("Usuario");
        menuItemUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemUser.setFocusPainted(true);
        menuItemUser.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        menuItemUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuItemUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuItemUser.setMargin(new java.awt.Insets(3, 6, 3, 30));
        menuItemUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemUserMouseClicked(evt);
            }
        });
        menuItemUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUserActionPerformed(evt);
            }
        });

        menuItemCerrarSesión.setBackground(new java.awt.Color(84, 156, 159));
        menuItemCerrarSesión.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        menuItemCerrarSesión.setForeground(new java.awt.Color(255, 255, 255));
        menuItemCerrarSesión.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesVentanas/imgCerrarSesion.png"))); // NOI18N
        menuItemCerrarSesión.setText("Cerrar sesión");
        menuItemCerrarSesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuItemCerrarSesión.setFocusCycleRoot(true);
        menuItemCerrarSesión.setFocusable(true);
        menuItemCerrarSesión.setOpaque(true);
        menuItemCerrarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesiónActionPerformed(evt);
            }
        });
        menuItemUser.add(menuItemCerrarSesión);

        MBprincipal.add(menuItemUser);

        menuItemMagnitud.setForeground(new java.awt.Color(255, 255, 255));
        menuItemMagnitud.setText("Cambiar magnitud");
        menuItemMagnitud.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuItemMagnitud.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        menuItemMagnitud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuItemMagnitud.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuItemMagnitud.setMargin(new java.awt.Insets(3, 30, 3, 30));
        menuItemMagnitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemMagnitudMouseClicked(evt);
            }
        });
        menuItemMagnitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMagnitudActionPerformed(evt);
            }
        });
        MBprincipal.add(menuItemMagnitud);

        menuItemPagWeb.setForeground(new java.awt.Color(255, 255, 255));
        menuItemPagWeb.setText("Ver pagina web");
        menuItemPagWeb.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuItemPagWeb.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        menuItemPagWeb.setMargin(new java.awt.Insets(3, 30, 3, 30));
        menuItemPagWeb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemPagWebMouseClicked(evt);
            }
        });
        MBprincipal.add(menuItemPagWeb);

        setJMenuBar(MBprincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUserActionPerformed

    }//GEN-LAST:event_menuItemUserActionPerformed

    private void menuItemUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemUserMouseClicked

    }//GEN-LAST:event_menuItemUserMouseClicked

    private void menuItemPagWebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemPagWebMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.youroutlet.pe/coolscooter"));
        } catch (URISyntaxException ex) {
            //
        } catch (IOException ex) {
            //
        }
    }//GEN-LAST:event_menuItemPagWebMouseClicked

    private void tgbBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbBicicletaActionPerformed
        jtext.setVehiculo("bc");
        limpiarJTexts();
    }//GEN-LAST:event_tgbBicicletaActionPerformed

    private void tgbScooterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbScooterActionPerformed
        jtext.setVehiculo("sc");
        limpiarJTexts();
    }//GEN-LAST:event_tgbScooterActionPerformed

    private void tgbSkaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbSkaterActionPerformed
        jtext.setVehiculo("sk");
        limpiarJTexts();
    }//GEN-LAST:event_tgbSkaterActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            resultado = calcular.calculo(jtext.primerJText().getText(), jtext.segundoJText().getText(), jtext.tercerJText().getText());
            velocidadIns = calcular.detVelocidadInstantanea(jtext.primerJText().getText(), jtext.segundoJText().getText(), jtext.tercerJText().getText());

        } catch (NumberFormatException e) {
            resultado = 0;
            velocidadIns = 0;
        }

        if (resultado == -1 || resultado == -2) {

            this.resultado = 0;
            switch (this.magnitud) {
                case "tiempo":
                    txtaInformacion.setText("Tiempo: " + resultado);
                    break;
                case "kilometraje":
                    txtaInformacion.setText("Distancia: " + resultado);
                    break;
                case "velocidad":
                    txtaInformacion.setText("Velocidad Final: " + resultado);
                    break;
                case "aceleracion":
                    txtaInformacion.setText("Aceleración: " + resultado);
                    break;
                default:
                    txtaInformacion.setText("Aceleración: " + "0.0");
                    break;
            }
        } else {

            switch (this.magnitud) {
                case "tiempo":
                    txtaInformacion.setText("Tiempo: " + resultado);
                    break;
                case "kilometraje":
                    txtaInformacion.setText("Distancia: " + resultado);
                    break;
                case "velocidad":
                    txtaInformacion.setText("Velocidad Final: " + resultado);
                    break;
                case "aceleracion":
                    txtaInformacion.setText("Aceleración: " + resultado);
                    break;
                default:
                    txtaInformacion.setText("Aceleración: " + "0.0");
                    break;
            }
        }

        rellenarDatosMagnitudes();
        limpiarJTexts();
        jtext.primerJText().requestFocus();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void menuItemMagnitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemMagnitudMouseClicked
        DlgMagnitudes dialogMagnitudes = new DlgMagnitudes(this, true);
        dialogMagnitudes.setVisible(true);
        this.magnitud = dialogMagnitudes.getMagnitud();
        setControl();
        panelPrincipal.repaint();
        control();
    }//GEN-LAST:event_menuItemMagnitudMouseClicked

    private void menuItemMagnitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMagnitudActionPerformed

    }//GEN-LAST:event_menuItemMagnitudActionPerformed

    private void btnCrearProformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProformaActionPerformed
        FrmGeneradorProforma formProforma = new FrmGeneradorProforma(caracteristicasMag, user);
        formProforma.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrearProformaActionPerformed

    private void btnVelocidadInstantaneaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInstantaneaMouseEntered
        btnVelocidadInstantanea.setForeground(Color.white);
    }//GEN-LAST:event_btnVelocidadInstantaneaMouseEntered

    private void btnVelocidadInstantaneaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVelocidadInstantaneaMouseExited
        btnVelocidadInstantanea.setForeground(Color.decode("#7A7977"));
    }//GEN-LAST:event_btnVelocidadInstantaneaMouseExited

    private void btnCrearProformaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearProformaMouseEntered
        btnCrearProforma.setForeground(Color.white);
    }//GEN-LAST:event_btnCrearProformaMouseEntered

    private void btnCrearProformaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearProformaMouseExited
        btnCrearProforma.setForeground(Color.decode("#7A7977"));
    }//GEN-LAST:event_btnCrearProformaMouseExited

    private void btnCalcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseEntered
        btnCalcular.setForeground(Color.white);
    }//GEN-LAST:event_btnCalcularMouseEntered

    private void btnCalcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMouseExited
        btnCalcular.setForeground(Color.decode("#7A7977"));
    }//GEN-LAST:event_btnCalcularMouseExited

    private void menuItemCerrarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesiónActionPerformed
        FrmLogin formLogin = new FrmLogin();
        formLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemCerrarSesiónActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/coolscooterpe/"));
        } catch (URISyntaxException ex) {
            //
        } catch (IOException ex) {
            //
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://api.whatsapp.com/send?phone=51947347422&app=facebook&entry_point=page_cta&fbclid=IwAR01Y7xMrt_fWjrNBzJPV8ChrAJapHv5Xv6dFyR-u-oI7PfGaUbiAMzC8PI"));
        } catch (URISyntaxException ex) {
            //
        } catch (IOException ex) {
            //
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Atención al cliente: +51 947347422");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnVelocidadInstantaneaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVelocidadInstantaneaActionPerformed
        switch (this.magnitud) {
            case "tiempo":
                txtaInformacion.setText("Tiempo: " + resultado
                        + "\nVelocidad instantánea: " + velocidadIns);
                break;
            case "kilometraje":
                txtaInformacion.setText("Distancia: " + resultado
                        + "\nVelocidad instantánea: " + velocidadIns);
                break;
            case "velocidad":
                txtaInformacion.setText("Velocidad Final: " + resultado
                        + "\nVelocidad instantánea: " + velocidadIns);
                break;
            case "aceleracion":
                txtaInformacion.setText("Aceleración: " + resultado
                        + "\nVelocidad instantánea: " + velocidadIns);
                break;
            default:
                txtaInformacion.setText("Aceleración: " + "0.0"
                        + "\nVelocidad instantánea: " + 0.0);
                break;
        }
    }//GEN-LAST:event_btnVelocidadInstantaneaActionPerformed

    private void lblMagnitudFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblMagnitudFocusGained
        
    }//GEN-LAST:event_lblMagnitudFocusGained

    public void rellenarDatosMagnitudes() {
        // tiempo, kilometraje, velocidad, velocidad instantenea, aceleracion
        try {
            if (this.magnitud == "tiempo") {
                caracteristicasMag[0] = resultado; //// tiempo
                caracteristicasMag[1] = Float.parseFloat(jtext.primerJText().getText());// kilometraje
                caracteristicasMag[2] = Float.parseFloat(jtext.segundoJText().getText()); //velocidad
                caracteristicasMag[3] = velocidadIns; //888 == aqui va la velocidad instantanea
                caracteristicasMag[4] = Float.parseFloat(jtext.tercerJText().getText());
            } else if (this.magnitud == "kilometraje") {
                caracteristicasMag[0] = Float.parseFloat(jtext.primerJText().getText()); //// tiempo
                caracteristicasMag[1] = resultado;// kilometraje
                caracteristicasMag[2] = Float.parseFloat(jtext.segundoJText().getText());//velocidad
                caracteristicasMag[3] = velocidadIns; //888 == aqui va la velocidad instantanea
                caracteristicasMag[4] = Float.parseFloat(jtext.tercerJText().getText());//aceleracion
            } else if (this.magnitud == "velocidad") {
                caracteristicasMag[0] = Float.parseFloat(jtext.primerJText().getText()); //// tiempo
                caracteristicasMag[1] = Float.parseFloat(jtext.segundoJText().getText());// kilometraje
                caracteristicasMag[2] = resultado;//velocidad
                caracteristicasMag[3] = velocidadIns; // aqui va la velocidad instantanea, 
                caracteristicasMag[4] = Float.parseFloat(jtext.tercerJText().getText());//aceleracion
            } else if (this.magnitud == "aceleracion") {
                caracteristicasMag[0] = Float.parseFloat(jtext.primerJText().getText()); //// tiempo
                caracteristicasMag[1] = Float.parseFloat(jtext.tercerJText().getText());// kilometraje
                caracteristicasMag[2] = Float.parseFloat(jtext.segundoJText().getText());//velocidad
                caracteristicasMag[3] = velocidadIns; //888 == aqui va la velocidad instantanea
                caracteristicasMag[4] = resultado;//aceleracion
            }
        } catch (NumberFormatException e) {
            caracteristicasMag[0] = 0; //// tiempo
            caracteristicasMag[1] = 0;// kilometraje
            caracteristicasMag[2] = 0; //velocidad
            caracteristicasMag[3] = 0; //888 == aqui va la velocidad instantane
            caracteristicasMag[4] = 0;
        }

    }

    public void setControl() {
        panelPrincipal.remove(label.getEtiqueta1());
        panelPrincipal.remove(label.getEtiqueta2());
        panelPrincipal.remove(label.getEtiqueta3());

        panelPrincipal.remove(jtext.getCajaText1());
        panelPrincipal.remove(jtext.getCajaText2());
        panelPrincipal.remove(jtext.getCajaText3());
    }

    public void limpiarJTexts() {
        jtext.primerJText().setText("");
        jtext.segundoJText().setText("");
        jtext.tercerJText().setText("");
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MBprincipal;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCrearProforma;
    private javax.swing.JButton btnVelocidadInstantanea;
    private javax.swing.ButtonGroup btngVehiculos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCoolScooter;
    private javax.swing.JLabel lblMagnitud;
    public javax.swing.JLabel lblTriciclo;
    public javax.swing.JLabel lblTricicloIz;
    private javax.swing.JMenuItem menuItemCerrarSesión;
    private javax.swing.JMenu menuItemMagnitud;
    private javax.swing.JMenu menuItemPagWeb;
    private javax.swing.JMenu menuItemUser;
    private javax.swing.JPanel panelAzul;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JToggleButton tgbBicicleta;
    private javax.swing.JToggleButton tgbScooter;
    private javax.swing.JToggleButton tgbSkater;
    private javax.swing.JTextArea txtaInformacion;
    // End of variables declaration//GEN-END:variables
}
