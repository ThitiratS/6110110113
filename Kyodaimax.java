
public class Kyodaimax extends Kabigon {
    public Kyodaimax(String name , String type){
        super(name,type,1500);
       
    }

    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(50);
        System.out.println(" " +enemy.getHp());
    }

}