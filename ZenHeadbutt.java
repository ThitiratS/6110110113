
public class ZenHeadbutt implements Posture {

    private int cp;
    private String name;

    public ZenHeadbutt(String name){
        
        this.name = name;
        this.cp = 12;
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
