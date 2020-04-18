
public class Pichu extends Pikachu{
    public Pichu(String name , String type){
        super(name,type,43);
       
    }

    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(40);
        System.out.println(" " +enemy.getHp());
    }

}