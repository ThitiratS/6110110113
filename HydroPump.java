
public class HydroPump  implements Posture {

    private int cp;
    private String name;

    public HydroPump(String name){
        this.name = name;
        this.cp = 40;
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
    public String tosString(){
        return name + " " + cp;
    }
}