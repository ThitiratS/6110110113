
import java.util.*;

public class Bag {
    
    public static String name;
    public static ArrayList<Pokemon> bag;
    public static ArrayList<PokemonBall> ball;

    public Bag() {
        bag = new ArrayList<Pokemon>();
        ball = new ArrayList<PokemonBall>();
    }

    public void addBag(String name) {
        Bag.name = name;
       // System.out.println(name);
    }

    public static String bagString() {
        return name;
    }

    public static ArrayList<PokemonBall> chooseBall() {
        return ball;
    }

    public static ArrayList<Pokemon> myEggs() {
        return bag;   
    }

    public ArrayList<PokemonBall> countBall(){
        Pokeball pokeball = new Pokeball("Pokeball");
        Quickball quickball = new Quickball("Quickball");
        Timerball timerball = new Timerball("Timerball");
        Ultraball ultraball = new Ultraball("Ultraball");
        Masterball masterball = new Masterball("Masterball");
        for(PokemonBall b : ball){
             if(b.getName() == "Pokeball"){
                int num = pokeball.getNum() + 1 ;
                pokeball.setNum(num);
            }
		
            else if(b.getName() == "Quickball"){
                int num = quickball.getNum() + 1 ;
                pokeball.setNum(num);
            }
		
            else if(b.getName() == "Timerball"){
                int num = timerball.getNum() + 1 ;
                pokeball.setNum(num);
            }
		
            else if(b.getName() == "Ultraball"){
                int num = ultraball.getNum() + 1 ;
                pokeball.setNum(num);
            }
		
            else if(b.getName() == "Masterball"){
                int num = masterball.getNum() + 1 ;
                pokeball.setNum(num);
            }
        }
        //System.out.println(ball);    
        return ball;
          
    }
  
}
