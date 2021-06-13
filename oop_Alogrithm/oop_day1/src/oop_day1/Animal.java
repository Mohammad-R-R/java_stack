package oop_day1;

public class Animal {
private	String type = "animal" ;

public Animal() {
}

public Animal(String type) {
	super();
	this.type = type;
	System.out.println("type: "+type);
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}
public void display() {
	System.out.println("type: "+type);
}

	

}
