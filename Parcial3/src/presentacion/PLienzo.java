package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PLienzo extends JPanel{
	
	private String figura = "";
	private Color figuraColor = Color.RED;
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		if (!figura.isEmpty()) {
			g2d.setColor(figuraColor);
			int tamanio = 250;
			int x = (getWidth() - tamanio) / 2;
			int y = (getHeight() - tamanio) / 2;			
			
			if (figura.equals("cuadrado")) {
				g2d.fillRect(x, y, tamanio, tamanio);
			} else if (figura.equals("circulo")) {
				g2d.fillOval(x, y, tamanio, tamanio);
			}
		}

	}
	
	public void setFigura (String figura, Color figuraColor) {
		this.figura = figura;
		this.figuraColor = figuraColor;
		repaint();
	}
}
