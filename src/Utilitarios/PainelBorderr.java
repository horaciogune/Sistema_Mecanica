package utilitarios;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class PainelBorderr extends JPanel {
    private Color cor1;
    private Color cor2;

    public PainelBorderr() {
        this.cor1 = new Color(102,153,255);
        this.cor2 = new Color(0,102,204);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        GradientPaint gradientPaint = new GradientPaint(0, 0, cor1, getWidth(), getHeight(), cor2);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
    }

    public Color getCor1() {
        return cor1;
    }

    public void setCor1(Color cor1) {
        this.cor1 = cor1;
        repaint(); // Repintar o painel quando a cor for alterada
    }

    public Color getCor2() {
        return cor2;
    }

    public void setCor2(Color cor2) {
        this.cor2 = cor2;
        repaint(); // Repintar o painel quando a cor for alterada
    }
    
    
}