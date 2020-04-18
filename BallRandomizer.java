
import java.util.*;

public class BallRandomizer {
    public static ArrayList<PokemonBall> getBall(int num){
        
        ArrayList<PokemonBall> pokemonballs = new ArrayList<PokemonBall>();
        if(num < 1){
            return pokemonballs;
        }
        
        for(int i = 0 ; i < num; ++i){
            int type = (int)(Math.random()*5);
            if (type == 0){
                pokemonballs.add(new Pokeball("Pokeball"));
            } 
            else if(type == 1){
                pokemonballs.add(new Quickball("Quickball"));
            } 
            else if(type == 2){
                pokemonballs.add(new Timerball("Timerball"));
            }  
            else if(type == 3){
                pokemonballs.add(new Ultraball("Ultraball"));
            }  
            else if(type == 4){
                pokemonballs.add(new Masterball("Masterball"));
            }  
            
        }
        return pokemonballs;
    }

}
