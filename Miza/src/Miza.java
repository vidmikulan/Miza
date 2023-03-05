import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
/**
 * Vmesnik miza
 * @author Vid Mikulan
 *
 */
public class Miza extends JFrame implements ActionListener {
	
	/**
	 * povrsina
	 */
	private JPanel povrsina;
	/**
	 * button
	 */
	private JButton dodajJButton;
	/**
	 * polja
	 */
	private JTextField znamkaPolje, alkoholPolje;
	/**
	 * tabela
	 */
	private JTable tabela;
	/**
	 * model tabele
	 */
	private PivskaSteklenicaTableModel modelTabele;
	
	
	/**
	 * Glavni izvrsilni razred
	 * @param args vhodni podatki
	 */
	public static void main (String[] args){
		
		Miza m = new Miza("Miza s pivskimi steklenicami");
		
	}
	
	
	/**
	 * konstruktor mize
	 * @param n naslov
	 */
	public Miza(String n) {
		
		super(n);
		
		povrsina = new JPanel();
		povrsina.setBackground(new Color(255, 255, 255));
		dodajJButton = new JButton("Dodaj steklenico");
		dodajJButton.setBackground(Color.BLUE);
		dodajJButton.setForeground(Color.DARK_GRAY);
		znamkaPolje = new JTextField(32);
		alkoholPolje = new JTextField(8);
		
		modelTabele = new PivskaSteklenicaTableModel();
		tabela = new JTable(modelTabele);
		
		dodajJButton.addActionListener(this);
		
		getContentPane().add(povrsina);
		JLabel label = new JLabel("Znamka:");
		label.setLabelFor(znamkaPolje);
		povrsina.add(label);
		povrsina.add(znamkaPolje);
		JLabel label_1 = new JLabel("Stopnja alkohola:");
		label_1.setLabelFor(alkoholPolje);
		povrsina.add(label_1);
		povrsina.add(alkoholPolje);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);
		
		setVisible(true);
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		System.out.println("Ustvarjam objekt Miza");
	}
	/**
	 * metoda za pritisk na gumb
	 */
	public void actionPerformed(ActionEvent ae){
		System.out.println("Dodajam steklenico...");
		System.out.println("znamka je " + znamkaPolje.getText());
		System.out.println("Stopnja alkota je " + alkoholPolje.getText());
		
		
		
		modelTabele.addPivskaSteklenica(new PivskaSteklenica(znamkaPolje.getText(),500,Double.parseDouble(alkoholPolje.getText())));
		
	}
	
}