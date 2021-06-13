package zoo_keeper;

public class Mammal {
private	double enrgylevel;

public Mammal(double enrgylevel) {
	super();
	this.enrgylevel = enrgylevel;
}

public Mammal() {
	// TODO Auto-generated constructor stub
}

public double getEnrgylevel() {
	return enrgylevel;
}

public void setEnrgylevel(double enrgylevel) {
	this.enrgylevel = enrgylevel;
}


public double displayEnergy() {
	System.out.println(getEnrgylevel());
	
	return getEnrgylevel();
}

//public int getEnrgylevel() {
//	// TODO Auto-generated method stub
//	return 0;
//}


}
