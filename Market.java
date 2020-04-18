
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.util.*;

public class Market extends JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<PokemonBall> balls;

    public Market(RazzBerry r, Banana b, Pineapple p, ArrayList<PokemonBall> ball2)  {
        
        super("Pokemon Market");
        balls = new ArrayList<PokemonBall>();
  
        //System.out.println(ball2);
        Container c = getContentPane();
        Pokeball pokeball = new Pokeball("Pokeball");
        Quickball quickball = new Quickball("Quickball");
        Timerball timerball = new Timerball("Timerball");
        Ultraball ultraball = new Ultraball("Ultraball");
        Masterball masterball = new Masterball("Masterball");

        pokeball.setNum(0);
        quickball.setNum(0);
        timerball.setNum(0);
        ultraball.setNum(0);
        masterball.setNum(0);
        balls.add(pokeball);
        balls.add(quickball);
        balls.add(timerball);
        balls.add(ultraball);
        balls.add(masterball);

        for (PokemonBall ball : ball2) {
            if (ball.getName() == "Pokeball") {
                int num = ball.getNum();
                pokeball.setNum(num);
                
                System.out.println(balls);
                
            } else if (ball.getName() == "Quickball") {
                int num = ball.getNum();
                quickball.setNum(num);
                
                System.out.println(balls);
            } else if (ball.getName() == "Timerball") {
                int num = ball.getNum();
                timerball.setNum(num);
                
                System.out.println(balls);
            } else if (ball.getName() == "Ultraball") {
                int num = ball.getNum();
                ultraball.setNum(num);
                
                System.out.println(balls);
            } else if (ball.getName() == "Masterball") {
                int num = ball.getNum();
                masterball.setNum(num);
                
                System.out.println(balls);
            }

        }
     

        System.out.println(balls);
        Font myFont = null;

        try {
           
            myFont = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream("font/BoyzRGrossNF.ttf"));
            myFont = myFont.deriveFont(Font.BOLD, 22f);

        } catch (Exception error) {
            System.out.print("Exception : " + error);
        }
        
        JPanel pk1 = new JPanel();
        
        JLabel k1 = new JLabel("Welcome to Market ", JLabel.CENTER);
		k1.setFont(myFont.deriveFont(Font.BOLD,30f));
        k1.setForeground(Color.BLACK);
        
        
        pk1.add(k1);

        JPanel panel1 = new JPanel ( );
        panel1.setLayout ( new BorderLayout ( ) );
        JButton b1 = new JButton("Razz Berry");
        b1.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
                addBerry(r);
	    }
        });
        
        JButton b2 = new JButton("Nanab Berry");
        b2.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {       
                addBerry(b);
            }
        });
	    
        JButton b3 = new JButton("Pinab Berry");
        b3.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {          
                addBerry(p);
	    }
        });
	    
        JButton d1 = new JButton("CLOSE");
        d1.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
                System.out.println("Have : "+r.getNum()+" RAZZ Berry "+ b.getNum()+ " BANAB Berry "+ p.getNum()+ " PINAB Berry ");
                setVisible(false);
	    }
        });
       
        JLabel j1 = new JLabel(new ImageIcon("img/fruit.jpg"));

        JPanel p3 = new JPanel ( );
        p3.setLayout(new BoxLayout(p3, BoxLayout.Y_AXIS));
        b1.add(Box.createRigidArea(new Dimension(150, 94)));
        b2.add(Box.createRigidArea(new Dimension(150, 94)));
        b3.add(Box.createRigidArea(new Dimension(150, 94)));
	    
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);

        panel1.add ( pk1, BorderLayout.NORTH );
        panel1.add ( p3, BorderLayout.WEST );
        panel1.add ( j1, BorderLayout.EAST );
        panel1.add ( d1, BorderLayout.SOUTH );
        

        JPanel panel2 = new JPanel ( );
        panel2.setLayout ( new BorderLayout ( ) );

        JPanel pk2 = new JPanel();
        JLabel k2 = new JLabel("Welcome to Market ", JLabel.CENTER);
	k2.setFont(myFont.deriveFont(Font.BOLD,30f));
        k2.setForeground(Color.RED);
        pk2.add(k2);

        JButton b4 = new JButton("Pokeball");
        b4.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {     
                addBall(pokeball);
                //System.out.println(pokeball);
 
	    }
        });

        
        JButton b5 = new JButton("Quickball");
        b5.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
               
                addBall(quickball);
                System.out.println(quickball);
	    }
        });
        
                
        JButton b6 = new JButton("Timerball");
        b6.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
              
                addBall(timerball);
                System.out.println(timerball);
	    }
        });
 
        JButton b7 = new JButton("Ultraball");
        b7.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
               
                addBall(ultraball);
                System.out.println(ultraball);
	    }
        });
        
        
        JButton b8 = new JButton("Masterball");
        b8.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
                
                addBall(masterball);
                System.out.println(masterball);
            }
           
        });
       
        JButton d2 = new JButton("CLOSE");
        d2.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {   
                
                System.out.println(balls);
                Bag.ball = balls;
                System.out.println(Bag.ball);
                setVisible(false);
               
	    }
        });

        JPanel p4 = new JPanel();
        p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));

        b4.add(Box.createRigidArea(new Dimension(150, 52)));
        b5.add(Box.createRigidArea(new Dimension(150, 52)));
        b6.add(Box.createRigidArea(new Dimension(150, 52)));
        b7.add(Box.createRigidArea(new Dimension(150, 52)));
        b8.add(Box.createRigidArea(new Dimension(150, 52)));

        p4.add(b4);
        p4.add(b5);
        p4.add(b6);
        p4.add(b7);
        p4.add(b8);

        JLabel j2 = new JLabel(new ImageIcon("img/ball.jpg"));

        panel2.add ( pk2, BorderLayout.NORTH );
        panel2.add ( p4, BorderLayout.EAST );
        panel2.add ( j2, BorderLayout.CENTER );
        panel2.add ( d2, BorderLayout.SOUTH );

        JTabbedPane tabbedPane = new JTabbedPane ( );

        tabbedPane.setSize ( 750, 420 );
        tabbedPane.setLocation ( 30, 10 );

        c.add ( tabbedPane );

        tabbedPane.setFont ( myFont );

        tabbedPane.addTab ( "FOOD", panel1 );
        tabbedPane.setBackgroundAt ( 0, Color.ORANGE );
        tabbedPane.setForegroundAt ( 0, Color.BLACK);

        tabbedPane.addTab ( "POKEMON BALLS", panel2);
        tabbedPane.setBackgroundAt ( 1, Color.YELLOW );
        tabbedPane.setForegroundAt ( 1, Color.BLACK );
        
        setSize ( 780, 460 );
        
        setVisible ( true );
        
    }

    public void addBerry(Food food){
        int berry = food.getNum()+1;
        food.setNum(berry);
        System.out.println("" + food.getType() + " have " + food.getNum());
    }
    public void addBall(PokemonBall ball){
        int b= ball.getNum()+1;
        ball.setNum(b);
        System.out.println(ball);
        
    }

}

