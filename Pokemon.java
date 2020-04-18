
public abstract class Pokemon {
    
    protected String name;
    protected int hp;
    private int maxHP;
    private String myName;
    private String type;
    private String level ;
    private int exp;
    private String gender;

    
    public Pokemon(String name,String type)
    {
        this.name = name;
        this.type = type;
        this.hp = 0;
        this.level = "level 1";
        this.exp = 0;

    }
    
    public Pokemon(String name,String type,int maxHP){
        this.name = name;
        this.type = type;
        this.hp = (int)(Math.random() * maxHP)+1;
        this.maxHP = maxHP;
        this.level = "level 1";
        this.exp = 0;
        this.gender = getGender();
        
    }
    
    public void setMyName(String myName){
        this.myName = myName;
    }

    public String getMyName() {
        return myName;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public int getMaxHp(){
        return maxHP;
    }
    
    public String getLevel(){
        return level;
    }
    
    public void setLevel(String level){
        this.level = level;
    }

    public int getExp(){
        return exp;
    }   
    
    public void setExp(int exp){
        this.exp = exp;
    }
    
    public String getGen(){
        return gender;
    }

    public String getGender(){
        for(int i = 0 ; i < 1 ; i++) {
            int type = (int)(Math.random()*2);
            if (type == 0){
                gender = "Male";
            }
            else if(type == 1){
                gender = "Female";
            }
            
        }
        return gender;
    }
    
    public void upLevel(Pokemon myPokemon){
        
        if(myPokemon.getExp() >= 80 && myPokemon.getExp() < 160){
            myPokemon.setLevel("level 2");
        }
        else if(myPokemon.getExp() >= 160 && myPokemon.getExp() < 240){
            myPokemon.setLevel("level 3");
        }
        else if(myPokemon.getExp() >= 240 && myPokemon.getExp() < 320){
            myPokemon.setLevel("level 4");
        }
        else if(myPokemon.getExp() >= 320 && myPokemon.getExp() < 400){
            myPokemon.setLevel("level 5");
        }
        else if(myPokemon.getExp() >= 400){
            myPokemon.setLevel("maxlevel");
            myPokemon.setExp(500);
        }
    }

    public void upPokemon(Pokemon myPokemon){
        if(myPokemon.getLevel() == "level 3"){
            if(myPokemon.getName() == "Pikachu"){
                myPokemon.setName("Richu");
            }
            else if(myPokemon.getName() == "Kabigon"){
                myPokemon.setName("Kyodaimax");
            }
            else if(myPokemon.getName() == "Bulbasaur"){
                myPokemon.setName("Lvysaur");
            }
            else if(myPokemon.getName() == "Zanigame"){
                myPokemon.setName("Wartortle");
            }
            
        }
    }

    public void usePosture(Pokemon myPokemon){
        Posture[] post = new Posture[8];
        post[0] = new Thunder("Thunder");
        post[1] = new Spark("Spark");
        post[2] = new PowerWhip("PowerWhip");
        post[3] = new SolarWhip("SolarWhip");
        post[4] = new BodySlam("BodySlam");
        post[5] = new ZenHeadbutt("ZenHeadbutt");
        post[6] = new HydroPump("HydroPump");
        post[7] = new AquaJet("AquaJet");
        if(myPokemon.getType() == "Electric"){
            for(int i = 0 ; i < 1 ; i++){
                int type = (int)(Math.random()*2);
                if(type == 0)
                    damage(post[0].getCp());
                else if(type == 1)
                    damage(post[1].getCp());
            }
        }
        else if(myPokemon.getType() == "Grass"){
            for(int i = 0 ; i < 1 ; i++){
                int type = (int)(Math.random()*2);
                if(type == 0)
                    damage(post[2].getCp());
                else if(type == 1)
                    damage(post[3].getCp());
            }
        }
        else if(myPokemon.getType() == "Normal"){
            for(int i = 0 ; i < 1 ; i++){
                int type = (int)(Math.random()*2);
                if(type == 0)
                    damage(post[4].getCp());
                else if(type == 1)
                    damage(post[5].getCp());
            }
        }
        else if(myPokemon.getType() == "Water"){
            for(int i = 0 ; i < 1 ; i++){
                int type = (int)(Math.random()*2);
                if(type == 0)
                    damage(post[6].getCp());
                else if(type == 1)
                    damage(post[7].getCp());
            }
        }

    }

    public boolean damage(int value){
        if(hp == 0){
            return false;
        }
        
        int currentHP = hp - value;
        if(currentHP >= 0){
            this.hp = currentHP;
        }
        else {
            this.hp = 0;
        }
        //can setHP
        return true;
    }
   
    public abstract void attack(Pokemon enemy);

    public String toString(){
        return "Pokemon : " + name + " Type : "+ type + " HP : " + hp + " " + gender;
    }

}

