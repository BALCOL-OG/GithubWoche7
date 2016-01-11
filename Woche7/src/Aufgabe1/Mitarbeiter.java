package Aufgabe1;

public class Mitarbeiter {

	protected int mitarbId;
	protected String name, sId;
	protected double gehalt;
	
	Mitarbeiter(){
		
	};
	
	Mitarbeiter(int mitarbId, String name, String sId, double gehalt){
		this.mitarbId = mitarbId;
		this.name = name;
		this.sId = sId;
		this.gehalt = gehalt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null){
			this.name = name;
		}
	}
	
	public void displayMitarbeiter(){
		
		
		System.out.println(mitarbId +" | "+ name +" | "+ sId +" | "+ gehalt );
		
				
//		if(x instanceof Direktor){
//			Direktor z = (Direktor) x;
//			System.out.println(z.getAbtName()+" | "+z.getBudget());
//		}
//		
//		else if(x instanceof Manager){
//			Manager y = (Manager) x;
//			System.out.println(y.getAbtName());
//		}								//FAIL

	}

	public double getGehalt() {
		return gehalt;
	}

	public void erhoeheGehalt(double erhoehung) {
		if(erhoehung > gehalt*0.1 || erhoehung < 0){
			System.err.println("Ungültige Erhöhung");
		}
		else{
			gehalt += erhoehung;
		}
	}

	
}
