package beispiel1_rezeptverwaltung;

public class RezeptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zutat [] zutat = new Zutat [3];
		zutat [0] = new Zutat("Milch",200);
		zutat [1] = new Zutat("Mehl",300);
		zutat [2] = new Zutat("Eier",3);
		
		Rezept keks = new Rezept("Cookies",(byte) 4,zutat);
		keks.printRezept();
		
	}

}
