
public class Bulbasaur extends Pokemon {
    
    public Bulbasaur (String name ,String type){
        super(name,type,294);
    }

    public Bulbasaur(String name , String type, int maxHP){
        super(name,type, maxHP);
    }

    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.usePosture(enemy);
        System.out.println(" " + enemy.getHp());
    }

}
