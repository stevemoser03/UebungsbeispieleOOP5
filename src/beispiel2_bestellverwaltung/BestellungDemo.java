package beispiel2_bestellverwaltung;

public class BestellungDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bestellzeile [] zeile = new Bestellzeile[3];
		zeile [0] = new Bestellzeile("Mac Book", 1, 1400);
		zeile [1] = new Bestellzeile("Dell", 2, 800);
		zeile [2] = new Bestellzeile("HP", 3, 500);
		
		Bestellung bestellung = new Bestellung("1",zeile);
		bestellung.printBestellung();
		System.out.println(bestellung.getKosten());
		
	}

}
