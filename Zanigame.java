
public class Zanigame extends Pokemon {
    
    public Zanigame(String name ,String type){
        super(name,type,1000);
    }

    public Zanigame(String name , String type,int maxHP){
        super(name,type,maxHP);
       
    }

    public void attack(Pokemon enemy){
        System.out.print("Fight!!! " + name + " attack " + enemy.getName());
        enemy.usePosture(enemy);
        System.out.println(" " +enemy.getHp());
    }
    

}