
public class Lombre extends Pokemon {
    
    public Lombre(String name ,String type){
        super(name,type,324);
    }
    
    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(94);
        System.out.println(" " +enemy.getHp());
    }

}
