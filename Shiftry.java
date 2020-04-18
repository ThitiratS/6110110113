
public class Shiftry extends Pokemon {
    public Shiftry (String name , String type){
        super(name,type,384);
    }
 
    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(184);
        System.out.println(" " +enemy.getHp());
    }
}