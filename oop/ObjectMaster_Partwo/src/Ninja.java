
public class Ninja extends Human {
	
	int steath=10;
//	int health =100;
	
	public void steal(Human poor) {
		poor.health-=steath;
		health+=steath;
	}
	public void runaway() {
		health-=10;
	}

}
