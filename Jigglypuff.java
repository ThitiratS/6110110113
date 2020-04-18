
public class Jigglypuff extends Pokemon {
    
    public Jigglypuff(String name ,String type){
        super(name,type,340);
    }
    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.damage(45);
        System.out.println(" " +enemy.getHp());
    }

}