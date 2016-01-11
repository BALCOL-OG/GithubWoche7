package Aufgabe1;

public class Direktor extends Manager{

	private double budget;
	
	Direktor(int mitarbId, String name, String sId, double gehalt, String abtName, double budget){
		super(mitarbId, name, sId, gehalt, abtName);
		this.budget = budget;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	@Override
	public void displayMitarbeiter(){
		super.displayMitarbeiter();
		System.out.println(budget);
	}
}
