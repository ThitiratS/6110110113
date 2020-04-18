
public class Eevee extends Pokemon {
    
    public Eevee(String name ,String type){
        super(name,type,220);
    }
    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(55);
        System.out.println(" " +enemy.getHp());
    }


}