public class Pokemon {
    private String name;
    private String type;
    private int level;
    private int exp;
    private int levelExp;
    private int maxLevel;
    private int hp;
    private int maxHP;
    private int pp;
    private int maxPP;
    private int attackPower;

    public Pokemon(String Name, String Type)
    {
        Name = name;
        Type = type;
        level = 0;
        maxLevel = 100;
        hp = 0;
        maxHP = 452;
        pp = 0;
        maxPP = 30;
        attackPower = 150;

    }
    
	public void start()
    {
        System.out.println("Name :" + name);
        System.out.println("Type :" + type);
        System.out.println("Level :" + level);
        System.out.println("HP :" + hp);
        System.out.println("AttackPower :" + attackPower);

    }
    public String setType(int getType) 
    {
        if(getType == 1)
            return "Water";
        else if(getType == 2)
            return "Ground";
        else if(getType == 3)
            return "Fire";
        else if(getType == 4)
            return "Dark";
        else if(getType == 5)
            return "Ice";
        else if(getType == 6)
            return "Electric";
        else if(getType == 7)
            return "Flying";
        else if(getType == 8)
            return "Grass";
        return type;
       

    }
    
    public void setHP() 
    {
        if(hp <= 0)
        {
            System.out.println("Faint!");
            eatberry();
        }
    }
    public void eatberry()
    {
        hp = maxHP;
    }
    public void upLevel()
    {
        if(exp >= levelExp)
        {
            if(level <= maxLevel){
                System.out.println("Level up!");
                level++;
            }
            else if(level >= maxLevel){
                System.out.println("Level max!");
            }
        }
    }

}

