package fr.uvsq.pglp.exercice3_1;

public class employe1 extends allEmploye{
	
	public employe1(String name, String addresse) {
		// TODO Auto-generated constructor stub
		super.name=name;
		super.adresse=adresse;
	}

	@Override
	public double calculSalaire() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void affichecoordonnees() {
		// TODO Auto-generated method stub
		System.out.println(this.name+" , "+this.adresse);
		
	}

		
}
