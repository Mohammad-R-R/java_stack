class HumanTest {
    public static void main(String[] args) {
        Wizard w = new Wizard();
        
        Ninja n=new Ninja();
        
        Samurai s = new Samurai();
        
        
        w.attack(s);
        s.attack(n);
        n.attack(s);
        w.fireball(n);
        s.deathBlow(n);
        n.steal(s);
//        s.deathBlow(n);
        n.steal(s);
        w.heal(n);
        n.runaway();
//        s.deathBlow(n);
        n.steal(s);
        
        
        System.out.println(s.health);
        
    }
}
