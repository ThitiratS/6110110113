
import java.util.*;

public class AllPokemon {
    public static ArrayList<Pokemon> getPokemon(int num){
        ArrayList<Pokemon> partner = new ArrayList<Pokemon>();
        if(num < 1){
            return partner;
        }

        for(int i = 0 ; i < num ; ++i){
            
            if(i == 0){
                 partner.add(new Pikachu("Pikachu of Satochi","Electric"));
            }

            else if(i == 1){
                partner.add(new Kabigon("Kabigon","Normal"));
            }

            else if(i == 2){
                partner.add(new Zanigame("Zanigame","Water")); 
            }
                
            else if(i == 3){
                partner.add(new Bulbasaur("Bulbasaur","Grass"));
            } 
        
        }
        return partner;
    }

}