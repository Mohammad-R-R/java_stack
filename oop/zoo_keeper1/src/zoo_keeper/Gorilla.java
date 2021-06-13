package zoo_keeper;

public class Gorilla {
	double enrgylevel;
	
	Mammal m1 = new Mammal();

	public Gorilla() {
		super();
		
	}
	
	public void throwsomething() {
		double x ;
		System.out.println("Gorilla has thrown something");
		
		x= m1.getEnrgylevel()-5;
		m1.setEnrgylevel(x);
		
	}
	public void eatebananas() {
		double x ;
		x= m1.getEnrgylevel()+10;
		m1.setEnrgylevel(x);
		System.out.println("Gorilla enrgy become "+m1.displayEnergy());
		
		
		
	}
	public void climb() {
		double x ;
		x= m1.getEnrgylevel()-10;
		m1.setEnrgylevel(x);
		System.out.println("Gorilla has lost 10 "+m1.displayEnergy());
		
		
		
	}
	

}
