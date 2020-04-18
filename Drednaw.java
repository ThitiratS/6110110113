
public class Drednaw extends Pokemon{
    public Drednaw(String name , String type){
        super(name,type,90);
    }
 
    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(115);
        System.out.println(" " +enemy.getHp());
    }

}
