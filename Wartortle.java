
public class Wartortle extends Zanigame {
    public Wartortle(String name ,String type){
        super(name,type,1800);
    }

    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(35);
        System.out.println(" " +enemy.getHp());
    }

}