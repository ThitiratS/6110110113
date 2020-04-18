
public class Raichu extends Pikachu{
    public Raichu(String name , String type){
        super(name,type,500);
       
    }

    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(100);
        System.out.println(" " +enemy.getHp());
    }
}