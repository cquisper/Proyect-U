package modelo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class GestionEncabezadoTabla implements TableCellRenderer {

    DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
    @Override
    
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JComponent jcomponent = null;
        cellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        cellRenderer.repaint();
        table.getColumnModel().getColumn(column).setCellRenderer(cellRenderer);
        if(value instanceof String){
            jcomponent = new JLabel((String)value);
            ((JLabel)jcomponent).setHorizontalAlignment(SwingConstants.CENTER);
            ((JLabel)jcomponent).setSize(40, jcomponent.getWidth());
            ((JLabel)jcomponent).setPreferredSize(new Dimension(6, jcomponent.getWidth()));
        }
        jcomponent.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, new Color(255 , 255 , 255 )));
        jcomponent.setOpaque(true);
        jcomponent.setBackground(new Color(140, 212, 214));
        return jcomponent;
    }
}

