package Aufgabe1;

public class Manager extends Mitarbeiter {

	private String abtName;
	
	Manager(int mitarbId, String name, String sId, double gehalt, String abtName){
		super(mitarbId, name, sId, gehalt);
		this.abtName = abtName;
	}

	public String getAbtName() {
		return abtName;
	}

	public void setAbtName(String abtName) {
		this.abtName = abtName;
	}
	
	@Override
	public void displayMitarbeiter(){
		super.displayMitarbeiter();
		System.out.println(abtName);
	}
	
}
