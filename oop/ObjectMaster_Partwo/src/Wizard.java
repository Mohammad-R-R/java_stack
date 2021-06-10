public class Wizard extends Human {
	int health=50;
    int intelligence=8;
	public  void heal (Human h) {
		h.health+=intelligence;
		
	}
	
	public void fireball(Human dead) {
		dead.health-=(intelligence*3);
	}
	
   
}