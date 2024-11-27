package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FPrincipal extends JFrame{
	
	private PFormularioForma pFormularioForma;
	private PLienzo pLienzo;
	private JPanel pFantasma;
	
	public FPrincipal() {
		this.setTitle("Parcial De Carlos Ramirez");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLayout(new BorderLayout());
		
		this.pFormularioForma = new PFormularioForma(this);
		this.pLienzo = new PLienzo();
		this.pFantasma = new JPanel(new BorderLayout());
		
		this.pFantasma.add(pFormularioForma, BorderLayout.NORTH);
		this.add(pFantasma, BorderLayout.WEST);
		this.add(pLienzo, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	public PLienzo getPLienzo() {
		return pLienzo;
	}
	
	public static void main(String[] args) {
		new FPrincipal();
	}

}
