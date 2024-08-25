package utilitarios;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;


public class PainelBorderr1 extends JPanel {
    private Color backgroundColor;
    private Color borderColor;
    private int borderRadius;

    public PainelBorderr1() {
        this.backgroundColor = new Color(102, 153, 255);
        this.borderColor = new Color(0, 102, 204);
        this.borderRadius = 15; // Define o raio dos cantos arredondados
        setOpaque(false); // Torna o JTextField transparente para permitir que o fundo personalizado seja desenhado
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        // Ativa o anti-aliasing para suavizar os gráficos
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Desenha o fundo arredondado
        graphics2D.setColor(backgroundColor);
        graphics2D.fillRoundRect(0, 0, getWidth(), getHeight(), borderRadius, borderRadius);

        // Desenha a borda arredondada
        graphics2D.setColor(borderColor);
        graphics2D.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);

        // Chama o método original para garantir que o texto seja desenhado corretamente
        super.paintComponent(g);
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        repaint(); // Repintar o componente quando a cor de fundo for alterada
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint(); // Repintar o componente quando a cor da borda for alterada
    }

    public int getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
        repaint(); // Repintar o componente quando o raio da borda for alterado
    }
}
