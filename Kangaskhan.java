
public class Kangaskhan extends Pokemon {
    
    public Kangaskhan(String name ,String type){
        super(name,type,414);
    }
    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(95);
        System.out.println(" " +enemy.getHp());
    }


}