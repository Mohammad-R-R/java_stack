package oop_day1;

public class Dog extends Animal {
private	String type= "mammal" ;
Animal a1=new Animal();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Dog() {
		System.out.println("type:"+a1.getType());
		System.out.println("i am a dog ");
	}
	
	@Override
	public void display() {
		System.out.println("here is a dog class");
	}
	public void printmessage() {
		System.out.println("here is a dog class");
		System.out.println("here is a Animal class");
		
	}
	
	public void printype() {
		System.out.println(type);
		System.out.println(a1.getType());
	}
	
	

}
