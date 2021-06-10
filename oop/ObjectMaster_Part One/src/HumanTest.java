class HumanTest {
    public static void main(String[] args) {
        Wizard h = new Wizard();
        Ninja n=new Ninja();
        Samurai s = new Samurai();
        h.attack(s);
        s.attack(n);
        n.attack(s);
        
        System.out.println(s.health);
        
    }
}
