
public class Electabuzz extends Pokemon{
    public Electabuzz(String name , String type){
        super(name,type,450);
       
    }

    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(198);
        System.out.println(" " +enemy.getHp());
    }
}