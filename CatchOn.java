
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.*;

public class CatchOn extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private ArrayList<Pokemon> bag;
    private ArrayList<Pokemon> wild;
    private JRadioButton j1,j2,j3,j4,j5;
    
    
    public CatchOn(ArrayList<PokemonBall> ball){
        
        super("Catch Wild Pokemon ");
        Container c = getContentPane();
        ArrayList<Pokemon> wildPokemon = PokemonRandomizer.getPokemon(5);
        
        bag = new ArrayList<Pokemon>();
        wild = new ArrayList<Pokemon>();
        for(Pokemon m : wildPokemon){
            wild.add(m);
        }
        
        Font myFont = null;
        Font myFont2 = null;
      
        
        try{
            
            myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font2/Pokemon Hollow.ttf" ) );   
            myFont2 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font2/Pokemon Solid.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }
        
        JPanel head = new JPanel();
        head.setLayout(new BoxLayout(head, BoxLayout.Y_AXIS));
        JLabel k1 = new JLabel("Pokemon Catching ",JLabel.CENTER);
        head.setBorder(BorderFactory.createEmptyBorder(20, 95, 10, 10));
		k1.setFont(myFont.deriveFont(Font.BOLD,35f));
        k1.setForeground(Color.BLUE);
        JLabel k2 = new JLabel("Select wild pokemon ",JLabel.CENTER);
        k2.setBorder(BorderFactory.createEmptyBorder(20, 60, 10, 10));
		k2.setFont(myFont2.deriveFont(Font.BOLD,20f));
        k2.setForeground(Color.magenta);
        head.add(k1);
        head.add(k2);

        JPanel radio1 = new JPanel();
        radio1.setBorder(BorderFactory.createEmptyBorder(10, 90, 10, 30));
        radio1.setLayout(new BoxLayout(radio1, BoxLayout.Y_AXIS));
        j1 = new JRadioButton(""+ wild.get(0),true);
        j2 = new JRadioButton(""+ wild.get(1),false);
        j3 = new JRadioButton(""+ wild.get(2),false);
        j4 = new JRadioButton(""+ wild.get(3),false);
        j5 = new JRadioButton(""+ wild.get(4),false);

        radio1.add(j1);
        radio1.add(j2);
        radio1.add(j3);
        radio1.add(j4);
        radio1.add(j5);
        
        ButtonGroup group = new ButtonGroup();
        group.add(j1);
        group.add(j2);
        group.add(j3);
        group.add(j4);
        group.add(j5);

        // JPanel radio2 = new JPanel();
        // ButtonGroup group2 = new ButtonGroup();

        // j6 = new JRadioButton("" + bag.get(0),true);
        // radio2.add(j6);
        // group2.add(j6);
        // for(int j = 1 ; j < bag.size() ; ++j ){
        //     radio2.add(new JRadioButton(""+bag.get(j),false));
        //     group2.add(new JRadioButton(""+bag.get(j),false));

        // }
        
        JPanel button = new JPanel();
        JButton btn = new JButton("CATCH");
        button.setLayout(new BoxLayout(button, BoxLayout.X_AXIS));
        btn.add(Box.createRigidArea(new Dimension(240, 20)));
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               
                try {

                    if(j1.isSelected()){
                        
                        //bag.removeAll(bag);
                        new MyPokemon(wild.get(0),ball);
                        setVisible(false);
                       
                    } else if (j2.isSelected()) {
                        
                        //bag.removeAll(bag);
                        new MyPokemon(wild.get(1),ball);
                        setVisible(false);
                                       
                    } else if (j3.isSelected()) {
                        
                        //bag.removeAll(bag);
                        new MyPokemon(wild.get(2), ball);
                        setVisible(false);
                       
                    } else if(j4.isSelected()){ 
                        
                        //bag.removeAll(bag);
                        new MyPokemon(wild.get(3), ball);
                        setVisible(false);
                       
                    } else if(j5.isSelected()){ 
                        
                        //bag.removeAll(bag);
                        new MyPokemon(wild.get(4), ball);
                        setVisible(false);
                        // Pokemon pokemons = partner.get(4);
                        // bag.add(pokemons);
    
                    } else if(j5.isSelected()){ 
                        
                        bag.removeAll(bag);
                        new MyPokemon(wild.get(5),ball);
                        setVisible(false);
                        // Pokemon pokemons = partner.get(4);
                        // bag.add(pokemons);
                    }
                
                } catch (NullPointerException e) {
                    System.out.println("No Pokemon");
                    JOptionPane.showMessageDialog(null,"No Pokemon ");
                }
                
            
            
            }

        });
        JButton btn2 = new JButton("RUN");
        btn2.add(Box.createRigidArea(new Dimension(240, 20)));
        btn2.addActionListener(new ActionListener(){
			//anonymous class
			public void actionPerformed(ActionEvent e) {
               
                setVisible(false);
               
            }
        });
        button.add(btn);
        button.add(btn2);
        
        c.add(button, BorderLayout.SOUTH);
        c.add(radio1, BorderLayout.WEST);
        //c.add(radio2, BorderLayout.EAST);
        c.add(head, BorderLayout.NORTH);
        
        
        setSize(550, 380);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}