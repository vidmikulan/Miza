import javax.swing.table.*;  

/**
 * Model tabele
 * @author Vid Mikulan
 *
 */
public class PivskaSteklenicaTableModel extends DefaultTableModel{
	
	/**
	 * Konstruktor tabele
	 */
	public PivskaSteklenicaTableModel(){
		super();
		addColumn("Znamka");
		addColumn("Stopnja alkota");
		
		Object[] vrstica = new Object[] {"znamka test", "stopnja alkota test"};
		
		addRow(vrstica);
		
	}
	
	/**
	 * dodamo pivsko steklenico v tabelo
	 * @param ps pivskaSteklenica
	 */
	public void addPivskaSteklenica(PivskaSteklenica ps){
		
		Object[] vrstica = new Object[] {ps.getZnamka(), ps.getStopnjaAlkohola()};
		
		addRow(vrstica);
	}
	
}