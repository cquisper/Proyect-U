package controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class ControlJLabel implements MouseListener {

    private String magnitud;
    private JLabel etiqueta1, etiqueta2, etiqueta3;

    public ControlJLabel(String magnitud) {
        this.magnitud = magnitud;
    }

    public void iniciarActionEvent() {
        getEtiqueta1().addMouseListener(this);
        getEtiqueta2().addMouseListener(this);
        getEtiqueta3().addMouseListener(this);
    }

    public String getMagnitud() {
        return magnitud;
    }

    public JLabel getEtiqueta1() {
        return etiqueta1;
    }

    public JLabel getEtiqueta2() {
        return etiqueta2;
    }

    public JLabel getEtiqueta3() {
        return etiqueta3;
    }

    public JLabel primeraEtiqueta() {
        if (getMagnitud().equals("tiempo")) {
            etiqueta1 = new JLabel("Ingresar Distancia:");
            etiqueta1.setForeground(Color.WHITE);
            etiqueta1.setFont(new Font("Microsoft JhengHei UI Light", 0, 22));
            etiqueta1.setBounds(40, 140, 210, 30);

        } else {
            etiqueta1 = new JLabel("Ingresar Tiempo:");
            etiqueta1.setForeground(Color.WHITE);
            etiqueta1.setFont(new Font("Microsoft JhengHei UI Light", 0, 22));
            etiqueta1.setBounds(40, 140, 210, 30);

        }
        return etiqueta1;
    }

    public JLabel segundaEtiqueta() {
        if (getMagnitud().equals("velocidad")) {
            etiqueta2 = new JLabel("Ingresar Distancia:");
            etiqueta2.setForeground(Color.WHITE);
            etiqueta2.setFont(new Font("Microsoft JhengHei UI Light", 0, 22));
            etiqueta2.setBounds(40, 260, 250, 30);

        } else {
            etiqueta2 = new JLabel("Ingresar Velocidad Final:");
            etiqueta2.setForeground(Color.WHITE);
            etiqueta2.setFont(new Font("Microsoft JhengHei UI Light", 0, 22));
            etiqueta2.setBounds(40, 260, 250, 30);

        }
        return etiqueta2;
    }

    public JLabel terceraEtiqueta() {
        if (getMagnitud().equals("aceleracion")) {
            etiqueta3 = new JLabel("Ingresar Distancia:");
            etiqueta3.setForeground(Color.WHITE);
            etiqueta3.setFont(new Font("Microsoft JhengHei UI Light", 0, 22));
            etiqueta3.setBounds(40, 370, 250, 30);
        } else {
            etiqueta3 = new JLabel("Ingresar Aceleración:");
            etiqueta3.setForeground(Color.WHITE);
            etiqueta3.setFont(new Font("Microsoft JhengHei UI Light", 0, 22));
            etiqueta3.setBounds(40, 370, 250, 30);
        }
        return etiqueta3;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == getEtiqueta1()) {
            getEtiqueta1().setForeground(Color.decode("#7A7977"));
        } else if (e.getSource() == getEtiqueta2()) {
            getEtiqueta2().setForeground(Color.decode("#7A7977"));
        } else if (e.getSource() == getEtiqueta3()) {
            getEtiqueta3().setForeground(Color.decode("#7A7977"));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == getEtiqueta1()) {
            getEtiqueta1().setForeground(Color.WHITE);
        } else if (e.getSource() == getEtiqueta2()) {
            getEtiqueta2().setForeground(Color.white);
        } else if (e.getSource() == getEtiqueta3()) {
            getEtiqueta3().setForeground(Color.white);
        }
    }
}
