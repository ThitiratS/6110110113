
public class Pineapple extends Food {
    public Pineapple(){
        super("PINAP BERRY", 5);
    }
    public void useBerry(Pokemon pokemon,Food food){
        
        int hp = pokemon.getHp();
        int currentHp = 0;
        if(hp < pokemon.getMaxHp() || hp > pokemon.getMaxHp()  ){
            reduceBerry(food);
            System.out.println("PINAB BERRY left "+food.getNum());
        }
        hp = pokemon.getHp()+120;
        if(hp >= pokemon.getMaxHp()){
            currentHp = pokemon.getMaxHp();

        }
        else {
            currentHp = hp;
        }
        pokemon.setHp(currentHp);    
        System.out.println("HP : " + pokemon.getHp());
        
    }

    public void reduceBerry(Food food){
        
        System.out.println("PINAB BERRY "+food.getNum());
        int num = food.getNum()-1;
        if(num <= 0){
            num = 0;
            food.setNum(0);
                        
        }
        
        food.setNum(num);
    }


}