public class PokemonGame extends Pokemon {
    public static void main(String[] args){
        Pokemon A = new Pokemon();
        A.setName("Pikachu");
        A.setType("ICE");
        A.setlevel(50);
        A.sethp(5000);
        A.setpp(100);
        A.detail();
        A.form(); 
        System.out.println(" ");
        
           
    }
}
