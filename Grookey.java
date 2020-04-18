
public class Grookey extends Pokemon {
    
    public Grookey(String name ,String type){
        super(name,type,50);
    }
    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(65);
        System.out.println(" " +enemy.getHp());
    }


}