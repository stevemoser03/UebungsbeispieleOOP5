package beispiel2_bestellverwaltung;

public class Bestellung {

	private String nummer;
	private Bestellzeile[] zeilen;
	
	
	public Bestellung(String nummer, Bestellzeile[] zeilen) {
		this.nummer = nummer;
		this.zeilen = zeilen;
	}


	public String getNummer() {
		return nummer;
	}


	public Bestellzeile[] getZeilen() {
		return zeilen;
	}
	
	public void printBestellung(){
		for(int i = 0; i < zeilen.length; i++){
			
			System.out.println(zeilen[i].getName()+" "+
								zeilen[i].getMenge()+" "+
								zeilen[i].getPreis()
								);
		}
	}
	
	public double getKosten(){
		double kosten = 0;
		for(int i = 0; i < zeilen.length; i++){
			kosten += zeilen[i].getKosten();
		}
		return kosten;
	}
	
}
