
public abstract class Food {
    private String type;
    private int number;
    private int value;
    
    public Food(String type,int num){
        this.type = type;
        this.number = num;
        

    }
    public String getType() {
        return type;
    }
    public int getNum(){
        return number;
    }
    public void setNum(int number){
        this.number = number;
    }
    public int getValue(){
        return value;
    }
    public abstract void useBerry(Pokemon pokemon,Food food);
    public abstract void reduceBerry(Food food);

    // public boolean checkBerry(int value){
    //     int curNum = number - value;
    //     if(curNum == 0 ){
    //         return false;
    //     }
    //     if(curNum > 0){
    //         this.number = curNum;
    //     }
    //     else{
    //         curNum = 0;
    //     }
    //     return true;
    // }
    

}