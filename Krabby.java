
public class Krabby extends Pokemon {
    public Krabby (String name , String type){
        super(name,type,30);
    }
 
    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(105);
        System.out.println(" " +enemy.getHp());
    }

}