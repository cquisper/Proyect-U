package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author CrisTh
 */
public class ControlJText implements KeyListener {

    private String magnitud, vehiculo;

    private JTextField cajaText1;
    private JTextField cajaText2;
    private JTextField cajaText3;

    public ControlJText(String magnitud) {
        this.magnitud = magnitud;
        iniciarJText_y_KeyEvents();
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public JTextField getCajaText1() {
        return cajaText1;
    }

    public JTextField getCajaText2() {
        return cajaText2;
    }

    public JTextField getCajaText3() {
        return cajaText3;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getMagnitud() {
        return magnitud;
    }

    public void iniciarJText_y_KeyEvents() {
        cajaText1 = new JTextField();
        cajaText1.setForeground(Color.BLACK);
        cajaText1.setFont(new Font("Microsoft JhengHei UI Light", 0, 12));
        cajaText1.setBounds(40, 180, 200, 30);

        cajaText2 = new JTextField();
        cajaText2.setForeground(Color.BLACK);
        cajaText2.setFont(new Font("Microsoft JhengHei UI Light", 0, 12));
        cajaText2.setBounds(40, 300, 200, 30);

        cajaText3 = new JTextField();
        cajaText3.setForeground(Color.BLACK);
        cajaText3.setFont(new Font("Microsoft JhengHei UI Light", 0, 12));
        cajaText3.setBounds(40, 410, 200, 30);

        cajaText1.addKeyListener(this);
        cajaText2.addKeyListener(this);
        cajaText3.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char validar = e.getKeyChar();
        if (Character.isLetter(validar)) {
            if (e.getSource() == cajaText1) {
                cajaText1.getToolkit().beep();
            } else if (e.getSource() == cajaText2) {
                cajaText2.getToolkit().beep();
            } else if (e.getSource() == cajaText3) {
                cajaText3.getToolkit().beep();
            }
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == cajaText1) {
            if (getMagnitud().equals("tiempo")) {
                switch (getVehiculo()) {
                    //Ingresa kilometraje
                    case "bc":
                        restringirJTextField(cajaText1, 0, 30,e); // Esta en km
                        break;
                    case "sc":
                        restringirJTextField(cajaText1, 0, 9.7f,e);// Esta en km
                        break;
                    case "sk":
                        restringirJTextField(cajaText1, 0, 10,e);// Esta en km
                        break;
                }
            } else {
                switch (getVehiculo()) {
                    //Ingresa tiempo
                    case "bc":
                        restringirJTextField(cajaText1, 0, 4,e);// Esta en segundos
                        break;
                    case "sc":
                        restringirJTextField(cajaText1, 0, 6,e);// Esta en segundos
                        break;
                    case "sk":
                        restringirJTextField(cajaText1, 0, 6,e);// Esta en segundos
                        break;
                }
            }
        } 
        
        if (e.getSource() == cajaText2) {
            if (getMagnitud().equals("velocidad")) {
                switch (getVehiculo()) {
                    //Ingresa kilometraje
                    case "bc": //Bicileta
                        restringirJTextField(cajaText2, 0, 30,e); // Esta en km
                        break;
                    case "sc"://scooter
                        restringirJTextField(cajaText2, 0, 9.7f,e);// Esta en km
                        break;
                    case "sk"://skate
                        restringirJTextField(cajaText2, 0, 10,e);// Esta en km
                        break;
                }
            } else {
                switch (getVehiculo()) {
                    //Ingresa velocidad final
                    case "bc":
                        restringirJTextField(cajaText2, 0, 36,e);// Esta en km / h
                        break;
                    case "sc":
                        restringirJTextField(cajaText2, 1, 18,e);// Esta en km / h
                        break;
                    case "sk":
                        restringirJTextField(cajaText2, 1, 16,e);// Esta en km / h
                        break;
                }
            }
        } 
        
        if (e.getSource() == cajaText3) {
            if (getMagnitud().equals("aceleracion")) {
                switch (getVehiculo()) {
                    //Ingresa kilometraje
                    case "bc":
                        restringirJTextField(cajaText3, 0, 30,e); // Esta en km
                        break;
                    case "sc":
                        restringirJTextField(cajaText3, 0, 9.7f,e);// Esta en km
                        break;
                    case "sk":
                        restringirJTextField(cajaText3, 0, 10,e);// Esta en km
                        break;
                }
            } else {
                switch (getVehiculo()) {
                    //Ingresa aceleración
                    case "bc":
                        restringirJTextField(cajaText3, 0, 5,e);// Esta en m / s^2   
                        break;
                    case "sc":
                        restringirJTextField(cajaText3, 0, 4,e);// Esta en m / s^2 
                        break;
                    case "sk":
                        restringirJTextField(cajaText3, 0, 3,e);// Esta en m / s^2 
                        break;
                }
            }
        }
    }

    public JTextField primerJText() {
        return cajaText1;
    }

    public JTextField segundoJText() {
        return cajaText2;
    }

    public JTextField tercerJText() {
        return cajaText3;
    }

    public void restringirJTextField(JTextField cajaText, float min, float max,KeyEvent e) {
        int t = cajaText.getText().length();
        float num = 0;
        try {
            num = Float.parseFloat(cajaText.getText());
        } catch (NumberFormatException ex) {
        }
        if (t != 1 || t != 0) {
            if (num >= min && num <= max) {// Aqui se restringe #Solo se cambio
            } else {
                cajaText.setText(null);
                if(e.getKeyChar() != '\n'){
                    cajaText.getToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Para este vehiculo solo esta permitido de " + min + " a " + max); 
                }
                
            }
        }
    }
}
