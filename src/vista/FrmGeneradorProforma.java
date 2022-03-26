package vista;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modelo.ArchivoProforma;
import modelo.Proforma;

public class FrmGeneradorProforma extends javax.swing.JFrame {

    //private DateFormat dateFormat = DateFormat.getDateInstance();
    private SimpleDateFormat sdateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private ArchivoProforma file;
    private float[] caracteristicasMag;// tiempo, kilometraje, velocidad, velocidad instantenea, aceleracion
    private String user;
    private String[] datosProforma;

    public FrmGeneradorProforma(float[] caracteristicasMag, String user) {
        this.caracteristicasMag = caracteristicasMag;
        this.user = user;
        initComponents();
        control();
        setLocationRelativeTo(null);
        controlAdvertencia(0);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenesVentanas/logo_coolscooter.png")));
        setResizable(false);
    }

    private FrmGeneradorProforma() {
    }

    private void control() {
        menuItemUser.setText("  " + user);
        lblUser.setText(user);
    }

    private void controlAdvertencia(int casilla) {
        if (casilla == 0) {
            lblImcompleto1.setVisible(false);
            lblImcompleto2.setVisible(false);
            lblImcompleto3.setVisible(false);
            lblImcompleto4.setVisible(false);
            lblImcompleto5.setVisible(false);
            lblImcompleto6.setVisible(false);
            lblImcompleto7.setVisible(false);
            lblImcompleto8.setVisible(false);
        } else if (casilla == 1) {
            lblImcompleto1.setVisible(true);
        } else if (casilla == 2) {
            lblImcompleto2.setVisible(true);
        } else if (casilla == 3) {
            lblImcompleto3.setVisible(true);
        } else if (casilla == 4) {
            lblImcompleto4.setVisible(true);
        } else if (casilla == 5) {
            lblImcompleto5.setVisible(true);
        } else if (casilla == 6) {
            lblImcompleto6.setVisible(true);
        } else if (casilla == 7) {
            lblImcompleto7.setVisible(true);
        } else if (casilla == 8) {
            lblImcompleto8.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProforma = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        lblCliente2 = new javax.swing.JLabel();
        lblCliente1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnCrearPreforma = new javax.swing.JButton();
        lblImcompleto5 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblVehiculo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblImcompleto3 = new javax.swing.JLabel();
        lblImcompleto2 = new javax.swing.JLabel();
        lblmodelo = new javax.swing.JLabel();
        lblImcompleto1 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblImcompleto6 = new javax.swing.JLabel();
        lblImcompleto7 = new javax.swing.JLabel();
        lblImcompleto8 = new javax.swing.JLabel();
        lblImcompleto4 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtVehiculo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        lblAnotacionesAd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaAnotacionesAd = new javax.swing.JTextArea();
        dateCalenFechaEmision = new com.toedter.calendar.JDateChooser();
        lblUser = new javax.swing.JLabel();
        lblFondoProforma = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuItemUser = new javax.swing.JMenu();
        menuItemCerrarSesión = new javax.swing.JMenuItem();
        menuItemPrincipal = new javax.swing.JMenu();
        menuItemTablaRegistros = new javax.swing.JMenu();
        menuItemPagWeb = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelProforma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDni.setBackground(new java.awt.Color(55, 62, 71));
        txtDni.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(244, 253, 251));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        panelProforma.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 315, 300, 30));

        lblCliente2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        lblCliente2.setForeground(new java.awt.Color(55, 62, 71));
        lblCliente2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCliente2.setText("N° de DNI:");
        panelProforma.add(lblCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 315, 110, 30));

        lblCliente1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        lblCliente1.setForeground(new java.awt.Color(55, 62, 71));
        lblCliente1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCliente1.setText("Telefono");
        panelProforma.add(lblCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 110, 30));

        txtTelefono.setBackground(new java.awt.Color(55, 62, 71));
        txtTelefono.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(244, 253, 251));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        panelProforma.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 300, 30));

        btnCrearPreforma.setBackground(new java.awt.Color(155, 210, 200));
        btnCrearPreforma.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 18)); // NOI18N
        btnCrearPreforma.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearPreforma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProforma/imgCrearPreforma.png"))); // NOI18N
        btnCrearPreforma.setText("Generar preforma");
        btnCrearPreforma.setBorderPainted(false);
        btnCrearPreforma.setContentAreaFilled(false);
        btnCrearPreforma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearPreforma.setFocusPainted(false);
        btnCrearPreforma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearPreforma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProforma/imgCrearPreformaSelec.png"))); // NOI18N
        btnCrearPreforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPreformaActionPerformed(evt);
            }
        });
        panelProforma.add(btnCrearPreforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 372, 240, 50));

        lblImcompleto5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblImcompleto5.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto5.setText("campo incompleto");
        panelProforma.add(lblImcompleto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        lblCliente.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(55, 62, 71));
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCliente.setText("Cliente:");
        panelProforma.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 193, 110, -1));

        lblFecha.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(55, 62, 71));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha.setText("Fecha de emisión:");
        panelProforma.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 190, 30));

        lblVehiculo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        lblVehiculo.setForeground(new java.awt.Color(55, 62, 71));
        lblVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVehiculo.setText("Tipo de vehículo:");
        panelProforma.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 180, 30));

        lblMarca.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(55, 62, 71));
        lblMarca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMarca.setText("Marca:");
        panelProforma.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 120, 30));

        lblImcompleto3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblImcompleto3.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto3.setText("digitos incompletos : 8");
        panelProforma.add(lblImcompleto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 347, -1, -1));

        lblImcompleto2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblImcompleto2.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto2.setText("digitos incompletos : 9");
        panelProforma.add(lblImcompleto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        lblmodelo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        lblmodelo.setForeground(new java.awt.Color(55, 62, 71));
        lblmodelo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblmodelo.setText("Modelo:");
        panelProforma.add(lblmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 130, 30));

        lblImcompleto1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblImcompleto1.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto1.setText("campo incompleto");
        panelProforma.add(lblImcompleto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 20)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(55, 62, 71));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código de producto:");
        panelProforma.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 620, 220, 30));

        lblImcompleto6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblImcompleto6.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto6.setText("campo incompleto");
        panelProforma.add(lblImcompleto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, -1, -1));

        lblImcompleto7.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblImcompleto7.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto7.setText("campo incompleto");
        panelProforma.add(lblImcompleto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, -1, -1));

        lblImcompleto8.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblImcompleto8.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto8.setText("campo incompleto");
        panelProforma.add(lblImcompleto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 647, -1, -1));

        lblImcompleto4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        lblImcompleto4.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto4.setText("campo incompleto");
        panelProforma.add(lblImcompleto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        txtCliente.setBackground(new java.awt.Color(55, 62, 71));
        txtCliente.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(244, 253, 251));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteKeyTyped(evt);
            }
        });
        panelProforma.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 300, 30));

        txtVehiculo.setBackground(new java.awt.Color(55, 62, 71));
        txtVehiculo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        txtVehiculo.setForeground(new java.awt.Color(244, 253, 251));
        txtVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehiculoActionPerformed(evt);
            }
        });
        panelProforma.add(txtVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 300, 30));

        txtMarca.setBackground(new java.awt.Color(55, 62, 71));
        txtMarca.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(244, 253, 251));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        panelProforma.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 300, 30));

        txtModelo.setBackground(new java.awt.Color(55, 62, 71));
        txtModelo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(244, 253, 251));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        panelProforma.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 300, 30));

        txtCodigo.setBackground(new java.awt.Color(55, 62, 71));
        txtCodigo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(244, 253, 251));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        panelProforma.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 300, 30));

        lblAnotacionesAd.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 20)); // NOI18N
        lblAnotacionesAd.setForeground(new java.awt.Color(55, 62, 71));
        lblAnotacionesAd.setText("Anotaciones adicionales");
        panelProforma.add(lblAnotacionesAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 420, 40));

        txtaAnotacionesAd.setBackground(new java.awt.Color(175, 243, 244));
        txtaAnotacionesAd.setColumns(20);
        txtaAnotacionesAd.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 16)); // NOI18N
        txtaAnotacionesAd.setForeground(new java.awt.Color(55, 62, 71));
        txtaAnotacionesAd.setRows(5);
        txtaAnotacionesAd.setBorder(null);
        txtaAnotacionesAd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtaAnotacionesAd);

        panelProforma.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 527, 422, 132));

        dateCalenFechaEmision.setBackground(new java.awt.Color(55, 62, 71));
        dateCalenFechaEmision.setDateFormatString("dd/MM/yyyy");
        dateCalenFechaEmision.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        panelProforma.add(dateCalenFechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 300, 30));

        lblUser.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 16)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Vendedor: #No registrado");
        lblUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelProforma.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 210, 50));

        lblFondoProforma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesProforma/imgPreforma.png"))); // NOI18N
        panelProforma.add(lblFondoProforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(84, 156, 159));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setEnabled(false);
        jMenuBar1.setFocusCycleRoot(true);
        jMenuBar1.setFocusable(false);
        jMenuBar1.setOpaque(true);

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
        menuItemCerrarSesión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemCerrarSesiónMouseClicked(evt);
            }
        });
        menuItemCerrarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesiónActionPerformed(evt);
            }
        });
        menuItemUser.add(menuItemCerrarSesión);

        jMenuBar1.add(menuItemUser);

        menuItemPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        menuItemPrincipal.setText("Principal");
        menuItemPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuItemPrincipal.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        menuItemPrincipal.setMargin(new java.awt.Insets(3, 30, 3, 30));
        menuItemPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemPrincipalMouseClicked(evt);
            }
        });
        menuItemPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPrincipalActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuItemPrincipal);

        menuItemTablaRegistros.setForeground(new java.awt.Color(255, 255, 255));
        menuItemTablaRegistros.setText("Tabla de registro");
        menuItemTablaRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuItemTablaRegistros.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        menuItemTablaRegistros.setMargin(new java.awt.Insets(3, 30, 3, 30));
        menuItemTablaRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemTablaRegistrosMouseClicked(evt);
            }
        });
        menuItemTablaRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTablaRegistrosActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuItemTablaRegistros);

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
        jMenuBar1.add(menuItemPagWeb);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProforma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProforma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehiculoActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnCrearPreformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPreformaActionPerformed
        String cliente = txtCliente.getText();
        String telefono = txtTelefono.getText();
        String dni = txtDni.getText();
        String fechaEmision = "";
        String tipoVehiculo = txtVehiculo.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String codigoProducto = txtCodigo.getText();
        try {
            fechaEmision = sdateFormat.format(dateCalenFechaEmision.getDate());
        } catch (NullPointerException e) {
        }
        controlAdvertencia(0);
        boolean validarLLenado = validarLlenadoDeProforma(cliente, telefono, dni, fechaEmision, tipoVehiculo, marca, modelo, codigoProducto);
        
        int validarDniTelefono = validarDniTelefono(dni, telefono);
        if (validarLLenado && validarDniTelefono == 0) {
            file = new ArchivoProforma();
            file.crearArchivo();
            Proforma proforma = new Proforma(cliente, telefono, dni, fechaEmision, tipoVehiculo, marca, modelo, codigoProducto, caracteristicasMag);
            file.escribirTexto(proforma);
            generarProforma(cliente, telefono, dni, fechaEmision, tipoVehiculo, marca, modelo, codigoProducto);
            JOptionPane.showMessageDialog(null, "Éxito");
            //limpiar aqui
            controlAdvertencia(0);
            limpiarJtext();
        } else if (validarDniTelefono == 1) {
            controlAdvertencia(2);
            controlAdvertencia(3);
        } else if (validarDniTelefono == 2) {
            controlAdvertencia(2);
        } else if (validarDniTelefono == 3) {
            controlAdvertencia(3);
        }
    }//GEN-LAST:event_btnCrearPreformaActionPerformed

    public int validarDniTelefono(String dni, String telefono) {
        // 0 = correcto llenado en los 2
        // 1 = incorrecto llenado en dni
        // 2 = incorrecto llenado en telefono
        dni = dni.replaceAll(" ", "");
        telefono = telefono.replaceAll(" ", "");
        int correct = 0;

        if ((telefono.length() > 0 && telefono.length() < 9) && (dni.length() < 8 && dni.length() > 0)) {
            correct = 1;
        } else if ((telefono.length() > 0 && telefono.length() < 9) && dni.length() == 8) {
            correct = 2;
        } else if (telefono.length() == 9 && (dni.length() < 8 && dni.length() > 0)) {
            correct = 3;
        }
        return correct;
    }

    private void menuItemCerrarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesiónActionPerformed
        FrmLogin formLogin = new FrmLogin();
        formLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemCerrarSesiónActionPerformed

    private void menuItemUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemUserMouseClicked

    }//GEN-LAST:event_menuItemUserMouseClicked

    private void menuItemUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUserActionPerformed

    }//GEN-LAST:event_menuItemUserActionPerformed

    private void menuItemTablaRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemTablaRegistrosMouseClicked
        FrmRepertorioDatos formRepertorio = new FrmRepertorioDatos(user);
        formRepertorio.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemTablaRegistrosMouseClicked

    private void menuItemCerrarSesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemCerrarSesiónMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCerrarSesiónMouseClicked

    private void menuItemTablaRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTablaRegistrosActionPerformed

    }//GEN-LAST:event_menuItemTablaRegistrosActionPerformed

    private void menuItemPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemPrincipalMouseClicked
        FrmPrincipal formPrincipal = new FrmPrincipal("tiempo", this.user);
        formPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemPrincipalMouseClicked

    private void menuItemPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPrincipalActionPerformed

    }//GEN-LAST:event_menuItemPrincipalActionPerformed

    private void menuItemPagWebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemPagWebMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.youroutlet.pe/coolscooter"));
        } catch (URISyntaxException ex) {
            //
        } catch (IOException ex) {
            //
        }
    }//GEN-LAST:event_menuItemPagWebMouseClicked

    private void txtClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyTyped

    }//GEN-LAST:event_txtClienteKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if (txtTelefono.getText().length() >= 9) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if (txtDni.getText().length() >= 8) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    public boolean validarLlenadoDeProforma(String cliente, String telefono, String dni, String fechaEmision, String tipoVehiculo, String marca, String modelo, String codigoProducto) {
        boolean validado = true;
        cliente = cliente.replaceAll(" ", "");
        telefono = telefono.replaceAll(" ", "");
        dni = dni.replaceAll(" ", "");
        fechaEmision = fechaEmision.replaceAll(" ", "");
        tipoVehiculo = tipoVehiculo.replaceAll(" ", "");
        marca = marca.replaceAll(" ", "");
        modelo = modelo.replaceAll(" ", "");
        codigoProducto = codigoProducto.replaceAll(" ", "");

        if (cliente.length() == 0) {
            validado = false;
            controlAdvertencia(1);
        }
        if (telefono.length() == 0) {
            validado = false;
            controlAdvertencia(2);
        }
        if (dni.length() == 0) {
            validado = false;
            controlAdvertencia(3);
        }
        if (fechaEmision.length() == 0) {
            validado = false;
            controlAdvertencia(4);
        }
        if (tipoVehiculo.length() == 0) {
            validado = false;
            controlAdvertencia(5);
        }
        if (marca.length() == 0) {
            validado = false;
            controlAdvertencia(6);
        }
        if (modelo.length() == 0) {
            validado = false;
            controlAdvertencia(7);
        }
        if (codigoProducto.length() == 0) {
            validado = false;
            controlAdvertencia(8);
        }
        return validado;
    }

    public void generarProforma(String cliente, String telefono, String dni, String fechaEmision, String tipoVehiculo, String marca, String modelo, String codigoProducto) {
        String anotacionesAd = txtaAnotacionesAd.getText().replaceAll(" ", "");
        //Dependera si ingresa texto en las anotaciones o no
        if (anotacionesAd.length() == 0) {
            datosProforma = new String[8];
            datosProforma[0] = cliente;
            datosProforma[1] = telefono;
            datosProforma[2] = dni;
            datosProforma[3] = fechaEmision;
            datosProforma[4] = tipoVehiculo;
            datosProforma[5] = marca;
            datosProforma[6] = modelo;
            datosProforma[7] = codigoProducto;
        } else {
            datosProforma = new String[9];
            datosProforma[0] = cliente;
            datosProforma[1] = telefono;
            datosProforma[2] = dni;
            datosProforma[3] = fechaEmision;
            datosProforma[4] = tipoVehiculo;
            datosProforma[5] = marca;
            datosProforma[6] = modelo;
            datosProforma[7] = codigoProducto;
            datosProforma[8] = txtaAnotacionesAd.getText();
        }

        DlgProforma dialogProforma = new DlgProforma(this, true, datosProforma, caracteristicasMag);
        dialogProforma.setVisible(true);
    }

    private void limpiarJtext() {
        txtCliente.setText("");
        txtTelefono.setText("");
        txtDni.setText("");
        dateCalenFechaEmision.setDate(null);
        txtVehiculo.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtCodigo.setText("");
        txtCliente.requestFocus();
    }

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
            java.util.logging.Logger.getLogger(FrmGeneradorProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGeneradorProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGeneradorProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGeneradorProforma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGeneradorProforma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPreforma;
    private com.toedter.calendar.JDateChooser dateCalenFechaEmision;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnotacionesAd;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCliente1;
    private javax.swing.JLabel lblCliente2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondoProforma;
    private javax.swing.JLabel lblImcompleto1;
    private javax.swing.JLabel lblImcompleto2;
    private javax.swing.JLabel lblImcompleto3;
    private javax.swing.JLabel lblImcompleto4;
    private javax.swing.JLabel lblImcompleto5;
    private javax.swing.JLabel lblImcompleto6;
    private javax.swing.JLabel lblImcompleto7;
    private javax.swing.JLabel lblImcompleto8;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JLabel lblmodelo;
    private javax.swing.JMenuItem menuItemCerrarSesión;
    private javax.swing.JMenu menuItemPagWeb;
    private javax.swing.JMenu menuItemPrincipal;
    private javax.swing.JMenu menuItemTablaRegistros;
    private javax.swing.JMenu menuItemUser;
    private javax.swing.JPanel panelProforma;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtVehiculo;
    private javax.swing.JTextArea txtaAnotacionesAd;
    // End of variables declaration//GEN-END:variables
}
