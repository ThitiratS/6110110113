
public abstract class PokemonBall {
    private String name;
    protected int rate;
    private int num;

    public PokemonBall(String name,int rate){
        this.name = name;
        this.num = 1;
        this.rate = rate;    
    }
    
    public String getName(){
        return name;
    }
    
    public int getRate(){
        return rate;
    }
    
    public int getNum(){
        return num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public String toString(){
        return name + " Number : " + num;
    }
 

}
