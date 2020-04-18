
public class Ivysaur extends Bulbasaur {

    public Ivysaur (String name , String type){
        super(name,type,500);
       
    }

    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(70);
        System.out.println(" " +enemy.getHp());
        
    }
    
}
