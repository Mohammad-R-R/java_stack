
public class Samurai extends Human {
	int health=200;
	
	public void deathBlow(Human hey) {
		hey.health=0;
		health/=2;
	}
	public void meditate() {
		this.health=200;
	}
//	  public static int howMany() {
//	        return Samurai.numSamurai;
//	    }

}
