
import java.util.*;

public class PokemonRandomizer {
    public static ArrayList<Pokemon> getPokemon(int num){
        
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        if(num < 1){
            return pokemons;
        }
        
        

        for(int i = 0 ; i < num; ++i){
            int type = (int)(Math.random()*5);
            if (type == 0){
                pokemons.add(new Pikachu("Wild Pikachu","Electric"));
            } 
            else if(type == 1){
                pokemons.add(new Raichu("Wild Raichu","Electric"));
            } 
            else if(type == 2){
                pokemons.add(new Kabigon("Wild Kabigon","Normal"));
            }  
            else if(type == 3){
                pokemons.add(new Zanigame("Wild Zanigame","Water"));
            } 
            else if(type == 4){
                pokemons.add(new Bulbasaur("Wild Bulbasaur","Grass"));
            }  
        
        }
        return pokemons;
    }

}