package Aufgabe1;

public class MitarbeiterAktienPlan {

	public void anzahlAktien(Mitarbeiter m){
		if(m instanceof Direktor){
			System.out.println("Gültige Aktioenoptionen: 1000");
		}
		else if(m instanceof Manager){
			System.out.println("Gültige Aktioenoptionen: 100");
		}
		else{
			System.out.println("Gültige Aktioenoptionen: 10");
		}
		
	}
	
	
}
