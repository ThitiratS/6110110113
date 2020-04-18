
public class Voltorb extends Pokemon {
    public Voltorb (String name , String type){
        super(name,type,46);
       
    }

    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(30);
        System.out.println(" " +enemy.getHp());
    }

}