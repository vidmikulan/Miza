/**
 * Pivska steklenica
 * @author vidmi
 *
 */
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {
	
	private String znamka;
	private boolean jePovratna;
	private double temperatura;
	private double stopnjaAlkohola;
	
	/**
	 * Konstruktor pivske steklenice
	 * @param z znamka
	 * @param k kolicina
	 * @param s stopnja
	 */
	public PivskaSteklenica(String z, int k, double s){
		
		super(k);
		
		odpri();
		
		try{
			napolni(k,"Pivo");
		}
		catch(Exception e){
			System.out.println("Napaka pri uvodnem polnjenju steklenice" + e);
		}
		zapri();
		
		znamka = z;
		jePovratna = false;
		temperatura = 22.0;
		
		stopnjaAlkohola = s;
		
		

	}
	
	/**
	 * metoda ohladi
	 * @param t temperatura
	 */
	public void ohladi(double t){
		
		System.out.print("Hladim pivo " + znamka + " iz " + temperatura + " na ");
		
		temperatura = temperatura - t;
		
		System.out.println(temperatura + " st. C.");
		
	}
	
	/**
	 * metoda stopnja alkohola
	 */
	public double getStopnjaAlkohola(){
		return stopnjaAlkohola;
	}
	
	/**
	 * metoda za znamka
	 */
	public String getZnamka(){
		return znamka;
	}
	
	

	
}