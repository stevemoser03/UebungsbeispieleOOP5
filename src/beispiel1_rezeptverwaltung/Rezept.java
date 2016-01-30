package beispiel1_rezeptverwaltung;

public class Rezept {
	
	private String name;
	private byte personen;
	private Zutat [] zutat;
	
	public Rezept(String name, byte personen, Zutat[] zutat) {
		name = name;
		personen = personen;
		this.zutat = zutat;
	}

	public String getName() {
		return name;
	}

	public byte getPersonen() {
		return personen;
	}

	public Zutat[] getZutat() {
		return zutat;
	}
	
	public void printRezept(){
		
		for(int i = 0; i<zutat.length;i++){
			System.out.println(zutat[i].getName()+"-"+zutat[i].getMenge()
					);
		}
	}
	
	public Rezept umrechnung(byte personen){
		
		Zutat [] zutat_neu = new Zutat[zutat.length];
		
		int faktor = personen / this.personen;
		
		for(int i = 0; i < zutat.length;i++){
			
		zutat_neu[i] = new Zutat(zutat[i].getName(),
								zutat[i].getMenge()*faktor
								);
		}
			return new Rezept(this.name, personen, zutat_neu);
	}

}
