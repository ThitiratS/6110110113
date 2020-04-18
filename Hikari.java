
import java.util.*;

public class Hikari implements Actor {
    
    protected String name;
    private ArrayList<PokemonBall> ball;
    private int ballnum;
 

    public Hikari(String name,int ballnum){
        this.name = name;
        this.ballnum = ballnum;
      
        ball = new ArrayList<PokemonBall>();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getNum(){
        return ballnum;
    }
    
    public ArrayList<PokemonBall> getBall(){

        return ball;
    }
    
    public void addBall() {
        ArrayList<PokemonBall> balls = BallRandomizer.getBall(5);
    
        for(PokemonBall p : balls){
            ball.add(p);
        }
        
    }
      
    public String toString(){
        return "Trainer : " +name + " Balls : " + ballnum  ;
    }

}
