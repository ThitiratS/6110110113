
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Hatching3 extends JFrame{


    private static final long serialVersionUID = 1L;

    public Hatching3(Pokemon pokemons, ArrayList<Pokemon> partners) {
        super("Hatch Pokemon Egg");
  
     
        Font myFont2 = null;
        
        try{
            
            myFont2 = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font2/Pokemon Solid.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }
        Container c = getContentPane();
        JLabel j1 = new JLabel(new ImageIcon(""));;
        if(pokemons.getName() == "Electabuzz"){
           
            j1 = new JLabel(new ImageIcon("img/electabuzz.jpg"));
        }
        else if(pokemons.getName() == "Voltorb"){
           
            j1 = new JLabel(new ImageIcon("img/voltorb.jpg"));
        }
        else if(pokemons.getName() == "Pichu"){
           
            j1 = new JLabel(new ImageIcon("img/pichu.jpg"));
        }
        else if(pokemons.getName() == "Sobble"){
           
            j1 = new JLabel(new ImageIcon("img/sobble.jpg"));
        }
        else if(pokemons.getName() == "Drednaw"){
           
            j1 = new JLabel(new ImageIcon("img/drednaw.jpg"));
        }
        else if(pokemons.getName() == "Krabby"){
           
            j1 = new JLabel(new ImageIcon("img/krabby.jpg"));
        }
        else if(pokemons.getName() == "Shiftry"){
           
            j1 = new JLabel(new ImageIcon("img/shiftry.jpg"));
        }
        else if(pokemons.getName() == "Lombre"){
           
            j1 = new JLabel(new ImageIcon("img/lombre.jpg"));
        }
        else if(pokemons.getName() == "Grookey"){
           
            j1 = new JLabel(new ImageIcon("img/grookey.jpg"));
        }
        else if(pokemons.getName() == "Kangaskhan"){
           
            j1 = new JLabel(new ImageIcon("img/kangaskhan.jpg"));
        }
        else if(pokemons.getName() == "Eevee"){
           
            j1 = new JLabel(new ImageIcon("img/eevee.jpg"));
        }
        else if(pokemons.getName() == "Jigglypuff"){
           
            j1 = new JLabel(new ImageIcon("img/jigglypuff.jpg"));
        }
        
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
                MyName m = new MyName(pokemons, partners);
                m.playgui(pokemons, partners);
                setVisible(false);
            }
        });

        c.add(pk1, BorderLayout.NORTH);
        c.add(j1, BorderLayout.CENTER);
        c.add(b1, BorderLayout.SOUTH);
        
        Bag.bag = partners;
        
        setSize(600, 450);
        setVisible(true);	

    }

}
