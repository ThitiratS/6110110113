
import java.util.*;

public class Partner {
    
    private ArrayList<PokemonBall> ball2;
    private ArrayList<PokemonBall> balls;
    private ArrayList<PokemonBall> ball3;
    // private ArrayList<PokemonBall> ball;
    private ArrayList<Actor> actor;

    public Partner(){
        balls = new ArrayList<PokemonBall>(); 
        actor = new ArrayList<Actor>();
        ball2 = new ArrayList<PokemonBall>(); 
    }
    

    public void select(){
        
        Satochi s = new Satochi("Satochi",5);
        actor.add(s);
        s.addBall();
        
        Hikari h = new Hikari("Hikari",5);
        actor.add(h);
        h.addBall();
        
        ball2 = s.getBall();
        ball3 = h.getBall();
    }
    public ArrayList<Actor> act(){

        select();
        return actor;
    }


    public void addBall(ArrayList<PokemonBall> ball){
        Pokeball pokeball = new Pokeball("Pokeball");
        Quickball quickball = new Quickball("Quickball");
        Timerball timerball = new Timerball("Timerball");
        Ultraball ultraball = new Ultraball("Ultraball");
        Masterball masterball = new Masterball("Masterball");
        //balls.remove(balls);
        
        for(PokemonBall b : ball){
            if(b.getName() == "Pokeball"){
                balls.add(pokeball);
            }
            else if(b.getName() == "Quickball"){
                balls.add(quickball);
            }
            else if(b.getName() == "Timerball"){  
                balls.add(timerball);
            }
            else if(b.getName() == "Ultraball"){ 
                balls.add(ultraball);
            }
            else if(b.getName() == "Masterball"){
                balls.add(masterball);
            }
            
   
        }
        
        
        for(int i = 0 ; i < balls.size()-1 ; ++i){
            if(balls.get(i).getName() == balls.get(i+1).getName()){
                balls.remove(i+1);
                check(pokeball, quickball, timerball, ultraball, masterball, i);
                
            }    
        
        }    
        for(int i = 0 ; i < balls.size()-2 ; ++i){
            if(balls.get(i).getName() == balls.get(i+2).getName()){
                balls.remove(i+2);
                check(pokeball, quickball, timerball, ultraball, masterball, i);
                
            }        
                
        }      
        for(int i = 0 ; i < balls.size()-2 ; ++i){
            if(balls.get(i).getName() == balls.get(i+2).getName()){
                balls.remove(i+2);
                check(pokeball, quickball, timerball, ultraball, masterball, i);
                
            }
            
        }
        for(int i = 0 ; i < balls.size()-3; ++i){
            if(balls.get(i).getName() == balls.get(i+3).getName()){
                balls.remove(i+3);
                check(pokeball, quickball, timerball, ultraball, masterball, i);
                
            }
        }   
        for(int i = 0 ; i < balls.size()-4 ; ++i){
            if(balls.get(0).getName() == balls.get(4).getName()){
                balls.remove(4);
                check(pokeball, quickball, timerball, ultraball, masterball, 0);
                
            } 
            // if(balls.get(1).getName() == balls.get(4).getName()){
            //     balls.remove(4);
            //     check(pokeball, quickball, timerball, ultraball, masterball, 1);
                
            // } 
        } 
        for(int i = 0 ; i < balls.size()-1 ; ++i){
            if(balls.get(i) == balls.get(i+1)){
                balls.remove(i+1);
                check(pokeball, quickball, timerball, ultraball, masterball, i);
                  
            }    
        
        }
        
     
        
    }
    public ArrayList<PokemonBall> satochiBall() {
        balls.removeAll(balls);
        addBall(ball2);
        
        return balls;
    }
    public ArrayList<PokemonBall> hikariBall() {
        balls.removeAll(balls);
        addBall(ball3);
        
        return balls;
    }
    public void check(Pokeball pokeball,Quickball quickball,Timerball timerball, Ultraball ultraball ,Masterball masterball,int i){
        if(balls.get(i).getName() == "Pokeball"){
            int num = pokeball.getNum() + 1 ;
            pokeball.setNum(num);
            
        }
        else if(balls.get(i).getName() == "Quickball"){
            int num = quickball.getNum() + 1 ;
            quickball.setNum(num);
        }
        else if(balls.get(i).getName() == "Timerball"){
            int num = timerball.getNum() + 1 ;
            timerball.setNum(num);
        }
        else if(balls.get(i).getName() == "Ultraball"){
            int num = ultraball.getNum() + 1 ;
            ultraball.setNum(num);
        }
        else if(balls.get(i).getName() == "Masterball"){
            int num = masterball.getNum() + 1 ;
            masterball.setNum(num);
        }
        

    }
    public void deleteBall(PokemonBall b){
        System.out.println(b);
        int ballNum = b.getNum()-1;
        b.setNum(ballNum);
        System.out.println(b);
        if(ballNum == 0){
            b.setNum(0);
        }
        // if(b.getName() == "Pokeball"){
        //     int num = pokeball.getNum() - 1 ;
        //     pokeball.setNum(num);
        // }
        // else if(b.getName() == "Quickball"){
        //     int num = quickball.getNum() - 1 ;
        //     pokeball.setNum(num);
        // }
        // else if(b.getName() == "Timerball"){
        //     int num = timerball.getNum() - 1 ;
        //     pokeball.setNum(num);
        // }
        // else if(b.getName() == "Ultraball"){
        //     int num = ultraball.getNum() - 1 ;
        //     pokeball.setNum(num);
        // }
        // else if(b.getName() == "Masterball"){
        //     int num = masterball.getNum() - 1 ;
        //     pokeball.setNum(num);
        // }
    }

    public void toString(ArrayList<Actor> actors){
        int number = 0;
        for(Actor a : actors){
            System.out.println("" + number + " " + a );
            number++ ;
        }
    }
    


}