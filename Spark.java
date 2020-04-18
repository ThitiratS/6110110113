
public class  Spark implements Posture{

    private int cp;
    private String name;

    public Spark(String name  ){
        
        this.name = name;
        this.cp = 15;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        
        return name;
    }

    public void setCp(int cp) {
        
        this.cp = cp;
    }

    public int getCp() {
        
        return cp;
    }
    
    public String toString(){
        
        return name + " " + cp;
    }
}
