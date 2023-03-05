/**
 * Steklenica
 * @author Vid Mikulan
 *
 */
public class Steklenica {
	
	private int kolicinaVsebine;
	private String vrstaVsebine;  
	private boolean jeOdprta;
	private int kapaciteta;
	
	public static String material = "Steklo";
	
	/**
	 * konstruktor
	 */
	public Steklenica(){
		
		kolicinaVsebine = 0;
		vrstaVsebine = "";
		jeOdprta = false;
		kapaciteta = 0;
		
		System.out.println("ustvarjam nov objekt tipa steklenica");
	}
	
	/**
	 * Konstruktor
	 * @param k kolicina
	 */
	public Steklenica(int k){
		
		kolicinaVsebine = 0;
		vrstaVsebine = "";
		jeOdprta = false;
		kapaciteta = k;
		
		System.out.println("ustvarjam nov objekt tipa steklenica s kapaciteto " + kapaciteta);
	}
	
	
	/**
	 * metoda, ki napolni steklenico
	 * @param k kolicina
	 * @param v vsebina
	 * @return kolicina
	 * @throws Exception napaka
	 */
	public int napolni(int k, String v) throws Exception{
		
		
		System.out.println("Steklenico polnim z " + v);
		System.out.println("Kolicina vsebine pred polnjenjem: " + kolicinaVsebine);
		
		if(jeOdprta){
		
			kolicinaVsebine = kolicinaVsebine + k;
			
			vrstaVsebine = vrstaVsebine + v;
			
			System.out.println("Kolicina vsebine po polnjenju: " + kolicinaVsebine);

			
		}
		else{
			throw new Exception ("Steklenica je zaprta!!!");
		}
		
		return kolicinaVsebine;
	}
	
	/**
	 * metoda odpri
	 * @return true ali false
	 */
	public boolean odpri(){
		
		System.out.println("Odpiram steklenico ...");
		
		if(jeOdprta){
			return false;
		}
		else{
			jeOdprta = true;
			return true;
		}
	}
	
	/**
	 * metoda zapri
	 * @return true ali false
	 */
	public boolean zapri(){
		
		System.out.println("zapiram steklenico ...");
		
		if(!jeOdprta){
			return false;
		}
		else{
			jeOdprta = false;
			return true;
		}
	}
	

	
	
}