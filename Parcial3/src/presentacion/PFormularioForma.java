package presentacion;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class PFormularioForma extends JPanel{
	
	private JTextField R;
	private JTextField G;
	private JTextField B;
	private JButton bCuadrado;
	private JButton bCirculo;
	private FPrincipal fPrincipal;
	
	public FPrincipal getfListaDoble() {
		return fPrincipal;
	}
	
	public PFormularioForma(FPrincipal fPrincipal) {
		this.fPrincipal = fPrincipal;
		this.setLayout(new GridLayout(5, 2, 10, 10));
		
		this.R = new JTextField();
		this.G = new JTextField();
		this.B = new JTextField();
		this.bCuadrado = new JButton("Cuadrado");
		this.bCirculo = new JButton("Circulo");
		
		this.bCuadrado.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarColor("cuadrado");
				
			}
		});
		
		this.bCirculo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarColor("circulo");
				
			}
		});

		
		this.add(new JLabel("R"));
		this.add(this.R);
		this.add(new JLabel("G"));
		this.add(this.G);
		this.add(new JLabel("B"));
		this.add(this.B);
		this.add(this.bCuadrado);
		this.add(this.bCirculo);
		
		
	}

	private void actualizarColor(String figura) {
		try {
			int r = Integer.parseInt(R.getText());
			int g = Integer.parseInt(G.getText());
			int b = Integer.parseInt(B.getText());
			
			r = Math.max(0, Math.min(r, 255));
			g = Math.max(0, Math.min(g, 255));
			b = Math.max(0, Math.min(b,255));
			
			Color figuraColor = new Color(r, g, b);
			
			fPrincipal.getPLienzo().setFigura(figura, figuraColor);
			
		} catch (NumberFormatException e){
			JOptionPane.showMessageDialog(this.fPrincipal , "Valores entre 0-255 para RGB", "ERROR", JOptionPane.ERROR_MESSAGE);
		}

	}

}
