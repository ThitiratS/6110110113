import java.util.ArrayList;

public interface Actor {
    
    String getName();
    void setName(String name);
    void addBall();
    int getNum();
    String toString();
    ArrayList<PokemonBall> getBall();
}