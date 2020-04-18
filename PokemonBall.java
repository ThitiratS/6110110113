
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
    //public abstract void randomball(Pokemon p);
    public int setBall(Pokemon p){
        int value = ((3*p.getMaxHp()) - (2*p.getHp()))* rate * 100 / 10 * (3*p.getMaxHp());
        return value;
    }
    // public void setBall(int percent){
        
    //     int ballNumber = (int)(Math.random()*1) +  1;
    //     for(int i = 0 ; i < ballNumber ; ++i)
    //     {
    //         if(percent < 15){
    //         int type = (int)(Math.random()*2);
    //         if (type == 0){
    //             System.out.println("Failed");
    //         } 
    //         else if(type == 1){
    //             System.out.println("Success");
    //         } 
    //     }
    //         else if(percent >= 15 && percent < 30){
    //         int type = (int)(Math.random()*3);
    //             if (type == 0){
    //                 System.out.println("Failed");
    //             }                 
    //             else if(type == 1){
    //                 System.out.println("Success");
    //             } 
    //             else if(type == 2){
    //                 System.out.println("Success");
    //             }
    //         }

    //         else if(percent >= 30  && percent < 50){
    //             int type = (int)(Math.random()*3);
    //             if (type == 0){
    //                 System.out.println("Failed");
    //             } 
    //             else if(type == 1){
    //                 System.out.println("Success");
    //             } 
    //             else if(type == 2){
    //                 System.out.println("Success");
    //             }
    //         }
    //         else if(percent >= 50  && percent < 80){
    //             int type = (int)(Math.random()*4);
    //             if (type == 0){
    //                 System.out.println("Failed");
    //             } 
    //             else if(type == 1){
    //                 System.out.println("Success");
    //             } 
    //             else if(type == 2){
    //                 System.out.println("Success");
    //             }
    //             else if(type == 3){
    //                 System.out.println("Success");
    //             }
    //         }
    //         else if(percent >= 80  && percent < 100){
    //             int type = (int)(Math.random()*5);
    //             if (type == 0){
    //                 System.out.println("Failed");
    //             } 
    //             else if(type == 1){
    //             System.out.println("Success");
    //             } 
    //             else if(type == 2){
    //                 System.out.println("Success");
    //             }
    //             else if(type == 3){
    //                 System.out.println("Success");
    //             }
    //             else if(type == 3){
    //                 System.out.println("Success");
    //             }
    //         }
    //         else if(percent == 100){
    //                 System.out.println("Success");
    //         }
        
    //     }

    // }

}