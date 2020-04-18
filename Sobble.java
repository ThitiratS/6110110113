
public class Sobble extends Pokemon {
    public Sobble(String name , String type){
        super(name,type,50);
    }
 
    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(40);
        System.out.println(" " +enemy.getHp());
    }

}