package vista;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import modelo.ArchivoVendedor;
import modelo.Vendedor;

public class FrmLogin extends javax.swing.JFrame {

    private Vendedor vendedor;
    private JComponent componente;
    ArrayList<Vendedor> vendedores;
    private ArchivoVendedor file = new ArchivoVendedor();
    private String direccion = "Documents\\repertorioVendedores.txt";

    public FrmLogin() {
        initComponents();
        controlDiseñoLogin();
        iniciarArchivo();
        setSize(1134, 739);
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenesVentanas/logo_coolscooter.png")));
    }

    public void controlDiseñoLogin() {
        // #fONDO REGISTRO 1
        tgbInicioSesion.setSelected(true);
        // #fONDO REGISTRO 2
        lblFondoRgst2.setVisible(false);
        btnRegistro.setVisible(false);
        lblDni.setVisible(false);
        txtDni.setVisible(false);
        lblTelefono.setVisible(false);
        txtTelefono.setVisible(false);
        //Campos de advertencia
        lblImcompleto1.setVisible(false);
        lblImcompleto2.setVisible(false);
        lblImcompleto3.setVisible(false);
        lblImcompleto4.setVisible(false);
    }

    public void controlDiseñoCrearCuenta() {
        if (tgbInicioSesion.isSelected() == true && tgbCrearCuenta.isSelected() == false) {
            lblFondoRgst.setVisible(true);
            lblFondoRgst2.setVisible(false);
            lblPassword.setLocation(700, 390);// la contraseña regresa a su posicion inicial
            txpPassword.setLocation(840, 390);
            lblUsuario.setLocation(730, 310);
            txtUsuario.setLocation(840, 310);
            lblTelefono.setVisible(false);
            txtTelefono.setVisible(false);
            lblDni.setVisible(false);
            txtDni.setVisible(false);
            btnIngresar.setVisible(true);
            btnRegistro.setVisible(false);
            lblVisible.setLocation(1010, 390); // POSCICION INICIAL 
        } else if (tgbInicioSesion.isSelected() == false && tgbCrearCuenta.isSelected() == true) {
            lblFondoRgst.setVisible(false);
            lblFondoRgst2.setVisible(true);
            lblPassword.setLocation(700, 500);// la contraseña regresa a su posicion final
            txpPassword.setLocation(840, 500);
            lblUsuario.setLocation(730, 290);
            txtUsuario.setLocation(840, 290);
            lblTelefono.setVisible(true);
            txtTelefono.setVisible(true);
            lblDni.setVisible(true);
            txtDni.setVisible(true);
            btnIngresar.setVisible(false);
            btnRegistro.setVisible(true);
            lblVisible.setLocation(1010, 500); // POSCICION FINAL 
        }
    }

    public void controlAdvertencia(int casilla) {
        if (casilla == 0) {
            lblImcompleto1.setVisible(false);
            lblImcompleto2.setVisible(false);
            lblImcompleto3.setVisible(false);
            lblImcompleto4.setVisible(false);
        } else if (casilla == 1) {
            lblImcompleto1.setVisible(true);
        } else if (casilla == 2) {
            lblImcompleto2.setVisible(true);
        } else if (casilla == 3) {
            lblImcompleto3.setVisible(true);
        } else if (casilla == 4) {
            lblImcompleto4.setVisible(true);
        }
    }
    
    public void iniciarArchivo(){
        file.crearArchivo();
        vendedores = file.generarArrayListConArchivo();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngIni_Cre = new javax.swing.ButtonGroup();
        panelLogin = new javax.swing.JPanel();
        lblImcompleto4 = new javax.swing.JLabel();
        lblImcompleto3 = new javax.swing.JLabel();
        lblImcompleto2 = new javax.swing.JLabel();
        lblImcompleto1 = new javax.swing.JLabel();
        lblContactenos = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        tgbInicioSesion = new javax.swing.JToggleButton();
        lblVisible = new javax.swing.JLabel();
        tgbCrearCuenta = new javax.swing.JToggleButton();
        btnRegistro = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        txpPassword = new javax.swing.JPasswordField();
        btnTelefono = new javax.swing.JButton();
        btnWsp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnFb = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        btnCasaInicio = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        lblFondoRgst = new javax.swing.JLabel();
        lblFondoRgst2 = new javax.swing.JLabel();
        lblFondoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLogin.setLayout(null);

        lblImcompleto4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        lblImcompleto4.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto4.setText("Campo incompleto");
        panelLogin.add(lblImcompleto4);
        lblImcompleto4.setBounds(840, 530, 270, 16);

        lblImcompleto3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        lblImcompleto3.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto3.setText("Campo incompleto");
        panelLogin.add(lblImcompleto3);
        lblImcompleto3.setBounds(840, 460, 200, 16);

        lblImcompleto2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        lblImcompleto2.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto2.setText("Campo incompleto");
        panelLogin.add(lblImcompleto2);
        lblImcompleto2.setBounds(840, 390, 200, 16);

        lblImcompleto1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 12)); // NOI18N
        lblImcompleto1.setForeground(new java.awt.Color(255, 0, 0));
        lblImcompleto1.setText("Campo incompleto");
        panelLogin.add(lblImcompleto1);
        lblImcompleto1.setBounds(840, 320, 200, 16);

        lblContactenos.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 22)); // NOI18N
        lblContactenos.setForeground(new java.awt.Color(255, 255, 255));
        lblContactenos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactenos.setText("Contactanos");
        lblContactenos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelLogin.add(lblContactenos);
        lblContactenos.setBounds(30, 630, 150, 40);

        lblTelefono.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 20)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelefono.setText("Teléfono");
        lblTelefono.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelLogin.add(lblTelefono);
        lblTelefono.setBounds(710, 430, 100, 27);

        txtTelefono.setBackground(new java.awt.Color(210, 210, 210));
        txtTelefono.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 210, 210), 2));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        panelLogin.add(txtTelefono);
        txtTelefono.setBounds(840, 430, 202, 31);

        btngIni_Cre.add(tgbInicioSesion);
        tgbInicioSesion.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 22)); // NOI18N
        tgbInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        tgbInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgSesion_Cuenta.png"))); // NOI18N
        tgbInicioSesion.setText("Iniciar Sesión");
        tgbInicioSesion.setContentAreaFilled(false);
        tgbInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tgbInicioSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgbInicioSesion.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgSesion_CuentaSelec.png"))); // NOI18N
        tgbInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tgbInicioSesionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tgbInicioSesionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tgbInicioSesionMouseReleased(evt);
            }
        });
        tgbInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbInicioSesionActionPerformed(evt);
            }
        });
        panelLogin.add(tgbInicioSesion);
        tgbInicioSesion.setBounds(672, 210, 206, 50);

        lblVisible.setForeground(new java.awt.Color(153, 153, 0));
        lblVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgVisible.png"))); // NOI18N
        lblVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVisibleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblVisibleMouseReleased(evt);
            }
        });
        panelLogin.add(lblVisible);
        lblVisible.setBounds(1010, 390, 30, 30);

        btngIni_Cre.add(tgbCrearCuenta);
        tgbCrearCuenta.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 22)); // NOI18N
        tgbCrearCuenta.setForeground(new java.awt.Color(217, 217, 217));
        tgbCrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgSesion_Cuenta.png"))); // NOI18N
        tgbCrearCuenta.setText("Crear Cuenta ");
        tgbCrearCuenta.setContentAreaFilled(false);
        tgbCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tgbCrearCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tgbCrearCuenta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgSesion_CuentaSelec.png"))); // NOI18N
        tgbCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tgbCrearCuentaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tgbCrearCuentaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tgbCrearCuentaMouseReleased(evt);
            }
        });
        tgbCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbCrearCuentaActionPerformed(evt);
            }
        });
        panelLogin.add(tgbCrearCuenta);
        tgbCrearCuenta.setBounds(878, 210, 206, 50);

        btnRegistro.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 22)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgIng_Regs.png"))); // NOI18N
        btnRegistro.setText("Registrar");
        btnRegistro.setContentAreaFilled(false);
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgIng_RegsSelec.png"))); // NOI18N
        btnRegistro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgIng_Regs.png"))); // NOI18N
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        panelLogin.add(btnRegistro);
        btnRegistro.setBounds(720, 560, 325, 50);

        btnIngresar.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 22)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgIng_Regs.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgIng_RegsSelec.png"))); // NOI18N
        btnIngresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgIng_Regs.png"))); // NOI18N
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panelLogin.add(btnIngresar);
        btnIngresar.setBounds(720, 468, 325, 50);

        txpPassword.setBackground(new java.awt.Color(210, 210, 210));
        txpPassword.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        txpPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 210, 210), 2));
        txpPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txpPasswordKeyPressed(evt);
            }
        });
        panelLogin.add(txpPassword);
        txpPassword.setBounds(840, 390, 202, 31);

        btnTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgTelf.png"))); // NOI18N
        btnTelefono.setContentAreaFilled(false);
        btnTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTelefono.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgTelfSelec.png"))); // NOI18N
        btnTelefono.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgTelf.png"))); // NOI18N
        btnTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelefonoActionPerformed(evt);
            }
        });
        panelLogin.add(btnTelefono);
        btnTelefono.setBounds(360, 620, 60, 60);

        btnWsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgWsp.png"))); // NOI18N
        btnWsp.setContentAreaFilled(false);
        btnWsp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWsp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgWspSelec.png"))); // NOI18N
        btnWsp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgWsp.png"))); // NOI18N
        btnWsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWspActionPerformed(evt);
            }
        });
        panelLogin.add(btnWsp);
        btnWsp.setBounds(280, 620, 60, 60);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgCliente_Vendedor.png"))); // NOI18N
        jLabel1.setText("Vendedor");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelLogin.add(jLabel1);
        jLabel1.setBounds(777, 110, 198, 50);

        btnFb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgFb.png"))); // NOI18N
        btnFb.setContentAreaFilled(false);
        btnFb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFb.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgFbSelec.png"))); // NOI18N
        btnFb.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgFb.png"))); // NOI18N
        btnFb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFbActionPerformed(evt);
            }
        });
        panelLogin.add(btnFb);
        btnFb.setBounds(200, 620, 60, 60);

        lblPassword.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 20)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Contraseña");
        lblPassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelLogin.add(lblPassword);
        lblPassword.setBounds(700, 390, 109, 27);

        txtUsuario.setBackground(new java.awt.Color(210, 210, 210));
        txtUsuario.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 210, 210), 2));
        panelLogin.add(txtUsuario);
        txtUsuario.setBounds(840, 310, 202, 31);

        lblUsuario.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 20)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setText("Usuario");
        lblUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelLogin.add(lblUsuario);
        lblUsuario.setBounds(730, 310, 80, 27);

        lblDni.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 20)); // NOI18N
        lblDni.setForeground(new java.awt.Color(0, 0, 0));
        lblDni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDni.setText("DNI");
        lblDni.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelLogin.add(lblDni);
        lblDni.setBounds(730, 360, 80, 27);

        btnCasaInicio.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 16)); // NOI18N
        btnCasaInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnCasaInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgInicio.png"))); // NOI18N
        btnCasaInicio.setText("Inicio");
        btnCasaInicio.setContentAreaFilled(false);
        btnCasaInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCasaInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCasaInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgInicioSelec.png"))); // NOI18N
        btnCasaInicio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgInicio.png"))); // NOI18N
        btnCasaInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCasaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCasaInicioActionPerformed(evt);
            }
        });
        panelLogin.add(btnCasaInicio);
        btnCasaInicio.setBounds(30, 20, 90, 92);

        txtDni.setBackground(new java.awt.Color(210, 210, 210));
        txtDni.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 210, 210), 2));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        panelLogin.add(txtDni);
        txtDni.setBounds(840, 360, 202, 31);

        lblFondoRgst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgFondoRgst.png"))); // NOI18N
        panelLogin.add(lblFondoRgst);
        lblFondoRgst.setBounds(660, 90, 436, 460);

        lblFondoRgst2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgFondoRgst2.png"))); // NOI18N
        panelLogin.add(lblFondoRgst2);
        lblFondoRgst2.setBounds(660, 90, 436, 554);

        lblFondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/imgFondoLogin.png"))); // NOI18N
        panelLogin.add(lblFondoLogin);
        lblFondoLogin.setBounds(0, 0, 1118, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tgbCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbCrearCuentaActionPerformed
        controlDiseñoCrearCuenta();
        limpiarJTexField();

    }//GEN-LAST:event_tgbCrearCuentaActionPerformed

    private void tgbInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbInicioSesionActionPerformed
        controlDiseñoCrearCuenta();
        limpiarJTexField();
        controlAdvertencia(0);
    }//GEN-LAST:event_tgbInicioSesionActionPerformed

    private void tgbInicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbInicioSesionMouseClicked
        //controlDiseñoCrearCuenta();
    }//GEN-LAST:event_tgbInicioSesionMouseClicked

    private void tgbCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbCrearCuentaMouseClicked
        //controlDiseñoCrearCuenta();
    }//GEN-LAST:event_tgbCrearCuentaMouseClicked

    private void tgbInicioSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbInicioSesionMousePressed

    }//GEN-LAST:event_tgbInicioSesionMousePressed

    private void tgbCrearCuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbCrearCuentaMousePressed

    }//GEN-LAST:event_tgbCrearCuentaMousePressed

    private void tgbInicioSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbInicioSesionMouseReleased

    }//GEN-LAST:event_tgbInicioSesionMouseReleased

    private void tgbCrearCuentaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbCrearCuentaMouseReleased

    }//GEN-LAST:event_tgbCrearCuentaMouseReleased

    private void btnTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelefonoActionPerformed
        JOptionPane.showMessageDialog(null, "Atención al cliente: +51 947347422");
    }//GEN-LAST:event_btnTelefonoActionPerformed

    private void btnFbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFbActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/coolscooterpe/"));
        } catch (URISyntaxException ex) {
            //
        } catch (IOException ex) {
            //
        }
    }//GEN-LAST:event_btnFbActionPerformed

    private void btnWspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWspActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://api.whatsapp.com/send?phone=51947347422&app=facebook&entry_point=page_cta&fbclid=IwAR01Y7xMrt_fWjrNBzJPV8ChrAJapHv5Xv6dFyR-u-oI7PfGaUbiAMzC8PI"));
        } catch (URISyntaxException ex) {
            //
        } catch (IOException ex) {
            //
        }
    }//GEN-LAST:event_btnWspActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        boolean correcto = false;
        Vendedor vendedorCorrecto = null;
        iniciarArchivo();
        for (Vendedor ven : vendedores) {
            if (ven.getUsuario().equals(txtUsuario.getText()) && ven.getContraseña().equals(castingContraseñaString(txpPassword.getPassword()))) {
                correcto = true;
                vendedorCorrecto = ven;
                break;
            }
        }
        if ((correcto == true) && (vendedorCorrecto != null)) {
            limpiarJTexField();
            FrmPrincipal formPrincipal = new FrmPrincipal("tiempo", vendedorCorrecto.getUsuario());
            dispose();
            formPrincipal.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed

        String usuario = txtUsuario.getText();
        String dni = txtDni.getText();
        String telefono = txtTelefono.getText();
        String password = castingContraseñaString(txpPassword.getPassword());

        controlAdvertencia(0);
        boolean validarLlenadoCompleto = validarLlenadoDeRegistro(usuario, dni, telefono, password);
        boolean validarContraseñaSegura = validarContraseñaSegura(password);
        int validarDniTelefono = validarDniTelefono(dni, telefono);

        if (validarLlenadoCompleto && validarDniTelefono == 0) {
            if (validarContraseñaSegura) {
                vendedor = new Vendedor(usuario, dni, telefono, password);
                file.escribirTexto(vendedor);
                JOptionPane.showMessageDialog(null, "Registrado correctamente");
                controlAdvertencia(0);
                limpiarJTexField();
                tgbInicioSesion.setSelected(true);
                controlDiseñoCrearCuenta();
            }else{
                lblImcompleto4.setVisible(true);
                lblImcompleto4.setText("minimo 8 caracteres");
            }
        } else if (validarDniTelefono == 1) {
            lblImcompleto2.setVisible(true);
            lblImcompleto2.setText("digitos incompletos : 8");
            lblImcompleto3.setVisible(true);
            lblImcompleto3.setText("digitos incompletos : 9");
        } else if (validarDniTelefono == 2) {
            lblImcompleto2.setVisible(true);
            lblImcompleto2.setText("digitos incompletos : 8");
        } else if (validarDniTelefono == 3) {
            lblImcompleto3.setVisible(true);
            lblImcompleto3.setText("digitos incompletos : 9");
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnCasaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCasaInicioActionPerformed
        FrmInicio formInicio = new FrmInicio();
        dispose();
        formInicio.setVisible(true);
    }//GEN-LAST:event_btnCasaInicioActionPerformed

    private void txpPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txpPasswordKeyPressed
        if (tgbInicioSesion.isSelected() == true && tgbCrearCuenta.isSelected() == false) {
            if (evt.getKeyChar() == '\n') {
                iniciarArchivo();
                boolean correcto = false;
                Vendedor vendedorCorrecto = null;
                for (Vendedor ven : vendedores) {
                    if (ven.getUsuario().equals(txtUsuario.getText())) {
                        correcto = true;
                        vendedorCorrecto = ven;
                        break;
                    }
                }

                if ((correcto == true) && (vendedorCorrecto != null)) {
                    limpiarJTexField();
                    FrmPrincipal formPrincipal = new FrmPrincipal("tiempo", vendedorCorrecto.getUsuario());
                    dispose();
                    formPrincipal.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                }
            }
        }
    }//GEN-LAST:event_txpPasswordKeyPressed

    private void lblVisibleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVisibleMousePressed
        txpPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_lblVisibleMousePressed

    private void lblVisibleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVisibleMouseReleased
        txpPassword.setEchoChar('*');
    }//GEN-LAST:event_lblVisibleMouseReleased

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

    public String castingContraseñaString(char password[]) {
        String passwords = "";
        for (int i = 0; i < password.length; i++) {
            passwords += password[i];
        }
        return passwords;
    }

    public boolean validarLlenadoDeRegistro(String usuario, String dni, String telefono, String password) {
        boolean validado = true;
        usuario = usuario.replaceAll(" ", "");
        dni = dni.replaceAll(" ", "");
        telefono = telefono.replaceAll(" ", "");
        password = password.replaceAll(" ", "");

        if (usuario.length() == 0) {
            controlAdvertencia(1);
            validado = false;
        }
        if (dni.length() == 0) {
            controlAdvertencia(2);
            validado = false;
        }
        if (telefono.length() == 0) {
            controlAdvertencia(3);
            validado = false;
        }
        if (password.length() == 0) {
            controlAdvertencia(4);
            validado = false;
        }

        return validado;
    }

    public int validarDniTelefono(String dni, String telefono) {
        // 0 = correcto llenado en los 2
        // 1 = incorrecto llenado en dni
        // 2 = incorrecto llenado en telefono
        dni = dni.replaceAll(" ", "");
        telefono = telefono.replaceAll(" ", "");
        int correct = 0;

        if ((dni.length() > 0 && dni.length() < 8) && (telefono.length() < 9 && telefono.length() > 0)) {
            correct = 1;
        } else if ((dni.length() > 0 && dni.length() < 8) && telefono.length() == 9) {
            correct = 2;
        } else if (dni.length() == 8 && (telefono.length() < 9 && telefono.length() > 0)) {
            correct = 3;
        }
        
        return correct;
    }

    public boolean validarContraseñaSegura(String password) {
        password = password.replaceAll(" ", "");
        boolean correcto = true;
        if (password.length() < 8) {
            correcto = false;
        }
        return correcto;

    }

    private void limpiarJTexField() {
        txtDni.setText(null);
        txtTelefono.setText(null);
        txtUsuario.setText(null);
        txpPassword.setText(null);
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCasaInicio;
    private javax.swing.JButton btnFb;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnTelefono;
    private javax.swing.JButton btnWsp;
    private javax.swing.ButtonGroup btngIni_Cre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContactenos;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFondoLogin;
    private javax.swing.JLabel lblFondoRgst;
    private javax.swing.JLabel lblFondoRgst2;
    private javax.swing.JLabel lblImcompleto1;
    private javax.swing.JLabel lblImcompleto2;
    private javax.swing.JLabel lblImcompleto3;
    private javax.swing.JLabel lblImcompleto4;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVisible;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JToggleButton tgbCrearCuenta;
    private javax.swing.JToggleButton tgbInicioSesion;
    private javax.swing.JPasswordField txpPassword;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
