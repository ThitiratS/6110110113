
import java.net.URL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class MyBag extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MyBag(ArrayList<Pokemon> bag, ArrayList<PokemonBall> ball, ArrayList<Food> food) {
        super("My Bag");
        Container c = getContentPane();

        Font myFont = null;
        
        try{
            
            myFont = Font.createFont ( Font.TRUETYPE_FONT, new FileInputStream ( "font3/LmsPokedex-XEja.ttf" ) );   
            

        }catch ( FontFormatException error ){

            
        }catch ( FileNotFoundException error ){

            
        }catch ( IOException error ){

        
        }

        JPanel p1 = new JPanel();
        JLabel k1 = new JLabel("Pokemon Hatching ", JLabel.CENTER);
        p1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		k1.setFont(myFont.deriveFont(Font.BOLD,35f));
        k1.setForeground(Color.MAGENTA);
        p1.add(k1);

        JPanel p2 = new JPanel();
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        URL url1 = this.getClass().getResource("font3/friend.gif");
        ImageIcon imageIcon1 = new ImageIcon(url1);
        JLabel label1 = new JLabel(imageIcon1);
        JButton b1 = new JButton("POKEMON");
        b1.add(Box.createRigidArea(new Dimension(230, 40)));
        b1.setFont(b1.getFont().deriveFont(Font.ITALIC,18.0f));
        b1.addActionListener(new ActionListener(){
			//anonymous class
			public void actionPerformed(ActionEvent e) {
                new StatusPokemon(bag);
            }
        });
        label1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        p2.add(label1);
        p2.add(b1);
        

        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        p3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        URL url2 = this.getClass().getResource("font3/eat.gif");
        ImageIcon imageIcon2 = new ImageIcon(url2);
        JLabel label2 = new JLabel(imageIcon2);
        JButton b2 = new JButton("BERRIES");
        b2.add(Box.createRigidArea(new Dimension(230, 40)));
        b2.setFont(b2.getFont().deriveFont(Font.ITALIC,18.0f));
        b2.addActionListener(new ActionListener(){
			//anonymous class
			public void actionPerformed(ActionEvent e) {
                new StatusBerry(food);
            }
        });
        label2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        p3.add(label2);
        p3.add(b2);
        
        JPanel p4 = new JPanel();
        p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
        p4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        URL url3 = this.getClass().getResource("font3/ball.gif");

        ImageIcon imageIcon3 = new ImageIcon(url3);
        JLabel label3 = new JLabel(imageIcon3);
        JButton b3 = new JButton("POKEMON BALLS");
        b3.add(Box.createRigidArea(new Dimension(230, 40)));
        b3.setFont(b3.getFont().deriveFont(Font.ITALIC,18.0f));
        b3.addActionListener(new ActionListener(){
			//anonymous class
			public void actionPerformed(ActionEvent e) {
                new StatusBall(ball);
            }
        });
        label3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        p4.add(label3);
        p4.add(b3);
       

        JButton b4 = new JButton("CANCLE");
        //b4.add(Box.createRigidArea(new Dimension(245, 25)));
        //b3.setFont(b3.getFont().deriveFont(Font.ITALIC,18.0f));
        b4.addActionListener(new ActionListener(){
			//anonymous class
			public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        c.add(p1, BorderLayout.NORTH);
        c.add(p2, BorderLayout.EAST);
        c.add(p3, BorderLayout.CENTER);
        c.add(p4, BorderLayout.WEST);
        c.add(b4, BorderLayout.SOUTH);

        setSize(850, 430);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);	

    }



}