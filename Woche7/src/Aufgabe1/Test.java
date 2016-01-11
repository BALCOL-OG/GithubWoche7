package Aufgabe1;

public class Test {
	

	public static void main(String[] args){
		
		
		//MitarbeiterAktienPlan test = new MitarbeiterAktienPlan();
		
		Engineer m1 = new Engineer(101, "Jane Schmidt", "012-34-5678", 120345.67);
		Manager m2 = new Manager(207, "Barbara Janson", "054-12-2367", 109501.36, "IT Service US");
		Admin m3 = new Admin(304, "Bill Moser", "108-23-6509", 75002.34);
		Direktor m4 = new Direktor(12, "Susanne Weiler", "099-45-2340", 120567.36, "Global Marketing", 1000000.00);
		
		m1.displayMitarbeiter();
		System.out.println("----------");
		m2.displayMitarbeiter();
		System.out.println("----------");
		m3.displayMitarbeiter();
		System.out.println("----------");
		m4.displayMitarbeiter();
		System.out.println("----------");
		System.out.println("----------");
		m1.erhoeheGehalt(1000);
		m1.setName("Hans Yolobert");
		m1.displayMitarbeiter();
		System.out.println("----------");
		System.out.println("----------");
		
		//test.anzahlAktien(m1);
		//test.anzahlAktien(m2);
		//test.anzahlAktien(m3);
		//test.anzahlAktien(m4);
		
	}
	
}
