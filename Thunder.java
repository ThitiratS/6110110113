
public class Thunder implements Posture{

    private int cp;
    private String name;

    public Thunder(String name  ){
        
        this.name = name;
        this.cp = 23;
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
