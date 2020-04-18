
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Hatching2 extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Hatching2(Pokemon male,Pokemon female,ArrayList<Pokemon> partners) {

        super("Eggs Hatching ");
        Container c = getContentPane();
        
        Font myFont = null;
        
        
        try{
            myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font2/Pokemon Hollow.ttf" ) ); 
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){


        }catch ( IOException error ){

        
        }
        JPanel pk1 = new JPanel();
        
        JLabel k1 = new JLabel("HATCH EGGS", JLabel.CENTER);
        k1.setFont(myFont.deriveFont(Font.BOLD,40f));
        k1.setForeground(Color.RED);
        pk1.setBackground(Color.BLACK);
        pk1.add(k1);

        JPanel p1 = new JPanel();
        p1.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));
        p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));

        JButton b1 = new JButton("HATCH");
        b1.add(Box.createRigidArea(new Dimension(245, 25)));
        b1.setFont(b1.getFont().deriveFont(Font.ITALIC,18.0f));
        b1.addActionListener(new ActionListener(){
			//anonymous class
			public void actionPerformed(ActionEvent e) {
                new Hatching3(male, female,partners);
                setVisible(false);
            }
		});

        JButton b2 = new JButton("CANCLE");
        b2.add(Box.createRigidArea(new Dimension(245, 25)));
        b2.setFont(b2.getFont().deriveFont(Font.ITALIC,18.0f));
        b2.addActionListener(new ActionListener(){
			//anonymous class
			public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        p1.setBackground(Color.BLACK);
        p1.add(b1);
        p1.add(b2);

        JPanel p2 = new JPanel();
        URL url = this.getClass().getResource("font2/eggs.gif");

        ImageIcon imageIcon = new ImageIcon(url);
        JLabel label = new JLabel(imageIcon);
        p2.setBackground(Color.BLACK);
        p2.add(label);

        c.add(pk1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.CENTER);
        c.add(p1, BorderLayout.PAGE_END);
        setSize(600, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

    }
    // public void hatchEgg(){

      
    // }
    // public static void main ( String [] args ){
    //     Hatching2 frame = new Hatching2();

    //     frame.setSize(600, 620);
    //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     frame.setVisible(true);
    //     frame.setResizable(false);
       
    // }

}