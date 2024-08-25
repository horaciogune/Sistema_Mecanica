package utilitarios;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.BasicStroke;
import java.awt.Component;
import java.awt.Stroke;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;

public class Cards extends JPanel {
    private Color cor1;
    private Color cor2;
    private Color borderColor;

    public Cards() {
        this.cor1 = new Color(102, 153, 255);
        this.cor2 = new Color(0, 102, 204);
        this.borderColor = Color.BLACK; 
        setBorder(new RoundedBorder(15, borderColor));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        GradientPaint gradientPaint = new GradientPaint(0, 0, cor1, getWidth(), getHeight(), cor2);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillRoundRect(10, 10, getWidth() - 20, getHeight() - 20, 15, 15);
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

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        setBorder(new RoundedBorder(15, borderColor));
        repaint(); // Repintar o painel quando a cor da borda for alterada
    }

    // Classe interna para criar uma borda arredondada
    private static class RoundedBorder extends AbstractBorder {
        private final int radius;
        private final Color color;

        RoundedBorder(int radius, Color color) {
            this.radius = radius;
            this.color = color;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Stroke oldStroke = g2.getStroke();
            g2.setColor(color);
            g2.setStroke(new BasicStroke(2)); // Largura da borda
            g2.drawRoundRect(x + 1, y + 1, width - 2, height - 2, radius, radius);
            g2.setStroke(oldStroke);
        }
    }
}
