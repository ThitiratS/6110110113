
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Hatching3 extends JFrame{


    private static final long serialVersionUID = 1L;

    public Hatching3(Pokemon male,Pokemon female,ArrayList<Pokemon> partners) {
        super("Hatch Pokemon Egg");
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        //System.out.println(partners);
     
        Font myFont2 = null;
        
        try{
            
            myFont2 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font2/Pokemon Solid.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }
        Container c = getContentPane();
        JLabel j1 = new JLabel(new ImageIcon(""));;
        if(male.getType() == "Electric" || female.getType() == "Electric" ){
            for(int i =0 ; i < 1 ;++i){
                int type = (int)(Math.random()*3);
                if(type == 0){
                    pokemons.add(new Electabuzz("Electabuzz","Electric"));
                    j1 = new JLabel(new ImageIcon("electabuzz.jpg"));
                }
                if(type == 1){
                    pokemons.add(new Voltorb("Voltorb","Electric"));
                    j1 = new JLabel(new ImageIcon("voltorb.jpg"));
                }
                if(type == 2){
                    pokemons.add(new Pichu("Pichu","Electric"));
                    j1 = new JLabel(new ImageIcon("pichu.jpg"));
                }
            }
        }
        if(male.getType() == "Water" ||  female.getType() == "Water"){
            for(int i =0 ; i < 1 ;++i){
                int type = (int)(Math.random()*3);
                if(type == 0){
                    pokemons.add(new Sobble("Sobble","Water"));
                    j1 = new JLabel(new ImageIcon("sobble.jpg"));
                }
                if(type == 1){
                    pokemons.add(new Drednaw("Drednaw","Water"));
                    j1 = new JLabel(new ImageIcon("drednaw.jpg"));
                }
                if(type == 2){
                    pokemons.add(new Krabby("Krabby","Water"));
                    j1 = new JLabel(new ImageIcon("krabby.jpg"));
                }
            }
        }
        if(male.getType() == "Grass" || female.getType() == "Grass"){
            for(int i =0 ; i < 1 ;++i){
                int type = (int)(Math.random()*3);
                if(type == 0){
                    pokemons.add(new Shiftry("Shiftry","Grass"));
                    j1 = new JLabel(new ImageIcon("shiftry.jpg"));
                }
                if(type == 1){
                    pokemons.add(new Lombre("Lombre","Grass"));
                    j1 = new JLabel(new ImageIcon("lombre.jpg"));
                }
                if(type == 2){
                    pokemons.add(new Grookey("Grookey","Grass"));
                    j1 = new JLabel(new ImageIcon("grookey.jpg"));
                }
            }
        }
        if(male.getType() == "Normal" || female.getType() == "Normal" ){
            for(int i =0 ; i < 1 ;++i){
                int type = (int)(Math.random()*3);
                if(type == 0){
                    pokemons.add(new Kangaskhan("Kangaskhan","Normal"));
                    j1 = new JLabel(new ImageIcon("kangaskhan.jpg"));
                }
                if(type == 1){
                    pokemons.add(new Eevee("Eevee","Normal"));
                    j1 = new JLabel(new ImageIcon("eevee.jpg"));
                }
                if(type == 2){
                    pokemons.add(new Jigglypuff("Jigglypuff","Normal"));
                    j1 = new JLabel(new ImageIcon("jigglypuff.jpg"));
                }
            }
        }
        if(pokemons.size() > 1){
            for(int i = 0 ;i < 1 ; i++){
                int t = (int)(Math.random()*2);
                if(t == 0){
                    Pokemon p  = pokemons.get(0);
                    //partners.add(p);
                    MyName m = new MyName(p, partners);
                    m.playgui(p, partners);
                    
                }
                else if(t == 1){
                    Pokemon p  = pokemons.get(1);
                    //partners.add(p);
                    MyName m = new MyName(p, partners);
                    m.playgui(p, partners);
                }
            }
            
        }
        //Trainer.bag = partners;
       
        // if(male.getType() == "Normal" && female.getType() == "Grass" || female.getType() == "Normal" && male.getType() == "Grass"  ){
        //     for(int i =0 ; i < 1 ;++i){
        //         int type = (int)(Math.random()*3);
        //         if(type == 0){
        //             pokemons.add(new Kangaskhan("Kangaskhan","Normal"));
        //             j1 = new JLabel(new ImageIcon("kangaskhan.jpg"));
        //         }
        //         if(type == 1){
        //             pokemons.add(new Eevee("Eevee","Normal"));
        //             j1 = new JLabel(new ImageIcon("eevee.jpg"));
        //         }
        //         if(type == 2){
        //             pokemons.add(new Jigglypuff("Jigglypuff","Normal"));
        //             j1 = new JLabel(new ImageIcon("jigglypuff.jpg"));
        //         }
        //         if(type == 3){
        //             pokemons.add(new Shiftry("Shiftry","Grass"));
        //             j1 = new JLabel(new ImageIcon("shiftry.jpg"));
        //         }
        //         if(type == 4){
        //             pokemons.add(new Lombre("Lombre","Grass"));
        //             j1 = new JLabel(new ImageIcon("lombre.jpg"));
        //         }
        //         if(type == 5){
        //             pokemons.add(new Grookey("Grookey","Grass"));
        //             j1 = new JLabel(new ImageIcon("grookey.jpg"));
        //         }
        //     }
        // }
        
        
        j1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel pk1 = new JPanel();
        
        JLabel k1 = new JLabel("MY EGG", JLabel.CENTER);
        k1.setFont(myFont2.deriveFont(Font.BOLD,40f));
        k1.setForeground(Color.PINK);
        k1.setBackground(Color.YELLOW);
        pk1.add(k1);

        JButton b1 = new JButton("OK");
        b1.add(Box.createRigidArea(new Dimension(245, 25)));
        b1.setFont(b1.getFont().deriveFont(Font.ITALIC,18.0f));
        b1.addActionListener(new ActionListener(){
			//anonymous class
			public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        c.add(pk1, BorderLayout.NORTH);
        c.add(j1, BorderLayout.CENTER);
        c.add(b1, BorderLayout.SOUTH);

        
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);	
        Bag.bag = partners;
        

    }


    

}