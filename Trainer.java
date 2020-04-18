
import java.util.*;

public class Trainer {
    public static ArrayList<Pokemon> bag;
    private Scanner sc;
    private ArrayList<PokemonBall> balls;
    private ArrayList<Food> berry;

    public Trainer() {
        bag = new ArrayList<Pokemon>();
        balls = new ArrayList<PokemonBall>();
        sc = new Scanner(System.in);
        berry = new ArrayList<Food>();
        
    }

    public static ArrayList<Pokemon> getBag(){
        return bag;
    }
    public void selectPartner() {
        ArrayList<Pokemon> partner = AllPokemon.getPokemon(4);
        Printing p = new Printing();
        balls = Bag.ball;
        //System.out.println(balls);
        System.out.println("\nPokemon Partner");
        p.printPokemon(partner);
        boolean bError = true;
        do {
            try {
                int no = 0;
    
                System.out.println("\n\nSelect pokemon partner number");
                no = sc.nextInt();
                if (no < 0) {
                    return;
                }
                Pokemon pokemonPartner = partner.get(no);
                // MyName m = new MyName();
                // m.playgui();
    
                sc.nextLine();
                System.out.print("\n\nPokemon Name is ");
                sc.nextLine();
    
                pokemonPartner.setMyName(Bag.bagString());
                while (pokemonPartner.getMyName() == null) {
    
                    System.out.print("\n\nPokemon Name is ");
                    sc.nextLine();
                    pokemonPartner.setMyName(Bag.bagString());
                }
                bag.add(pokemonPartner);
                System.out.println(bag);
                p.printPartner(bag);
                bError = false;
    
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\n\nNo Pokemon!!");
                sc.nextLine();
            }
        } while (bError);
        
        
        
    }

    public void play()  {
        Printing p = new Printing();
        String cmd = "";
        RazzBerry r = new RazzBerry();
        Banana b = new Banana();
        Pineapple a = new Pineapple();
        berry.add(r);
        berry.add(b);
        berry.add(a);
        do{

            System.out.print("\nEnter cmd : ");
            cmd = sc.nextLine();
            if(cmd.equals("print")){
                System.out.println("\n\nPokemon in bag");
                p.printPartner(bag);
            }
            else if(cmd.equals("status")){          
                new MyBag(bag,balls,berry);
            }
            else if(cmd.equals("feed")){
                
                p.printPartner(bag);
                System.out.println("Select pokemon in bag");
                int no = 0;
                no = sc.nextInt();
                sc.nextLine();
                Pokemon myPokemon = bag.get(no);
                System.out.println(myPokemon);
                Feed f = new Feed(myPokemon,r,b,a);
                f.use(myPokemon,r,b,a);
                sc.nextLine();
                
            }
            else if(cmd.equals("catch")){
                catchPokemon();
            }
            else if(cmd.equals("market")){
                new Market(r,b,a,balls);
            }
            else if(cmd.equals("hatch")){ 
                
                Eggs e = new Eggs();
                e.hatch(bag);
                sc.nextLine();
                bag = Bag.bag ;
                System.out.println(bag);

            }
            
        }while(!cmd.equals("quit"));
        
    }

    public void catchPokemon(){
        Printing p = new Printing();
        System.out.println("+ Catch Pokemon +");
        ArrayList<Pokemon> pokemons = PokemonRandomizer.getPokemon(5);

        System.out.println("\n\n* Pokemon around you *");
        int no = 0;
        p.printPokemon(pokemons);

        System.out.println("\n\nSelect pokemon number or run(-1)");
        no = sc.nextInt();
        if(no < 0){
            sc.nextLine();
            return;
        }

        Pokemon wildPokemon = pokemons.get(no);

        System.out.println("\n\nPokemon in bag");
        p.printPartner(bag);
        System.out.println("Select pokemon in bag");

        no = sc.nextInt();
        Pokemon myPokemon = bag.get(no);

        boolean isWin = false;
        do{
            myPokemon.attack(wildPokemon);
            if(wildPokemon.getHp() == 0){
                System.out.println(wildPokemon.getHp());
                isWin = true;
                break;
            }

            wildPokemon.attack(myPokemon);
            if(myPokemon.getHp() == 0){
                System.out.println(myPokemon.getHp());
                isWin = false;
                break;
            }
            
        }while(true);

        if(isWin){
            System.out.println("\nYou Win");
            System.out.println("\n\nYour Balls" );
            p.printBall(balls);
            System.out.println("\n\nSelect ball to catch " );
            
            no = sc.nextInt();
            if(no < 0){
                sc.nextLine();
                return;
            }

            PokemonBall b = balls.get(no);
            Partner part = new Partner();
            part.deleteBall(b);
            int value = ((3*myPokemon.getMaxHp()) - (2*myPokemon.getHp()))* b.getRate() * 100 / 10 * (3*myPokemon.getMaxHp());
            if(value > 50 ){

                System.out.print("You catch : ");
                System.out.println(wildPokemon.getName());
                // MyName m = new MyName();
                // m.playgui();
                sc.nextLine();
                System.out.print("\n\nPokemon Name is " );
                sc.nextLine();
                wildPokemon.setMyName(Bag.bagString()); 
                bag.add(wildPokemon);
                System.out.println("\n\nPokemon in bag " );
                p.printPartner(bag);
            }
            else{
                System.out.println("You failed to catch");
            }
            
        }
        else{
            System.out.println(wildPokemon.getName() + " win");
        }

        sc.nextLine();  
    }
    


   
}