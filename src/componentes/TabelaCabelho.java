
package componentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

class TabelaCabelho extends JLabel {

    public TabelaCabelho(String texto) {
        super(texto);
        setOpaque(true);
        setBackground(new Color(0,102,204) );
        setFont(new Font("sansserif", 1, 12));
        setForeground(new Color(255,255,255));
        setBorder(new EmptyBorder(10, 5, 10, 5));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(230,230,230));
        g.drawLine(0, getHeight() -1, getWidth(), getHeight());
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
