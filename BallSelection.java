
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class BallSelection extends JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<Pokemon> bag;
    private ArrayList<PokemonBall> balls;
    
    public BallSelection(Pokemon wildPokemon, Pokemon myPokemon, ArrayList<Pokemon> bag, ArrayList<PokemonBall> ball){

        super("Select balls");
        this.bag = bag;
        Container c = getContentPane();
       
        Partner p = new Partner();
        balls = new ArrayList<PokemonBall>();
        
        for(PokemonBall b2 : Bag.ball){
            balls.add(b2);
        }
        
        //System.out.println(balls);

        JPanel head = new JPanel();
        JLabel k1 = new JLabel("Select Your Balls ", JLabel.CENTER);
        head.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		k1.setFont(k1.getFont().deriveFont(Font.BOLD,35f));
        head.setForeground(Color.BLACK);
        head.setBackground(Color.YELLOW);
        head.add(k1);
    
        JPanel b1 = new JPanel();
        b1.setLayout(new BoxLayout(b1, BoxLayout.Y_AXIS));

        JPanel button1 = new JPanel();
        button1.setLayout(new BoxLayout(button1, BoxLayout.Y_AXIS));

        JButton btn = new JButton("Pokeball");
        btn.add(Box.createRigidArea(new Dimension(360, 50)));
        btn.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {
                
                for(int i = 0 ; i < balls.size() ; ++i ){
                    if(balls.get(i).getName()=="Pokeball"){
                        if(balls.get(i).getNum()!= 0){
                            p.deleteBall(balls.get(i));
                            checkWin(wildPokemon, myPokemon, balls.get(i));
                            setVisible(false);
                        }
                        
                        else if(balls.get(i).getNum() == 0){
                            new BallSelection( wildPokemon, myPokemon, bag, ball);
                        }
                    }
                    
                }
                
                
            }

        });
        JButton btn2 = new JButton("Quickball");
        btn2.add(Box.createRigidArea(new Dimension(360, 50)));
        btn2.addActionListener(new ActionListener(){
			//anonymous class
			public void actionPerformed(ActionEvent e) {
             
                for(int i = 0 ; i < balls.size() ; ++i ){
                    if(balls.get(i).getName()=="Quickball"){
                        if(balls.get(i).getNum()!= 0){
                            p.deleteBall(balls.get(i));
                            checkWin(wildPokemon, myPokemon, balls.get(i));
                            setVisible(false);
                        }
                        
                        else if(balls.get(i).getNum() == 0){
                            new BallSelection( wildPokemon, myPokemon, bag, ball);
                        }
                    }
                    
                }
                
            }
        });

        JPanel button2 = new JPanel();
        button2.setLayout(new BoxLayout(button2, BoxLayout.Y_AXIS));
        Bag.ball = balls;
        System.out.println(balls);

        JButton btn3 = new JButton("Timerball");
        
        btn3.add(Box.createRigidArea(new Dimension(360, 50)));
        btn3.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent arg0) {
               
                for(int i = 0 ; i < balls.size() ; ++i ){
                    if(balls.get(i).getName()=="Timerball"){
                        if(balls.get(i).getNum()!= 0){
                            p.deleteBall(balls.get(i));
                            checkWin(wildPokemon, myPokemon, balls.get(i));
                            setVisible(false);
                        }
                        
                        else if(balls.get(i).getNum() == 0){
                            new BallSelection( wildPokemon, myPokemon, bag, ball);
                        }
                    }
                    
                }
                
            }

        });
        JButton btn4 = new JButton("Ultraball");
        btn4.add(Box.createRigidArea(new Dimension(360, 50)));
        btn4.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {
              
                for(int i = 0 ; i < balls.size() ; ++i ){
                    if(balls.get(i).getName()=="Ultraball"){
                        if(balls.get(i).getNum()!= 0){
                            p.deleteBall(balls.get(i));
                            checkWin(wildPokemon, myPokemon, balls.get(i));
                            setVisible(false);
                        }
                        
                        else if(balls.get(i).getNum() == 0){
                            new BallSelection( wildPokemon, myPokemon, bag, ball);
                        }
                    }
                    
                }
                
            }

        });
        JPanel button3 = new JPanel();
        button3.setLayout(new BoxLayout(button3, BoxLayout.X_AXIS));
        button3.setBorder(BorderFactory.createEmptyBorder(10, 140, 10, 10));
        //button3.setBackground(Color.WHITE);
        JButton btn5 = new JButton("Masterball");
        btn5.add(Box.createRigidArea(new Dimension(360, 50)));
        btn5.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {
    
                for(int i = 0 ; i < balls.size() ; ++i ){
                    if(balls.get(i).getName()=="Masterball"){
                        if(balls.get(i).getNum()!= 0){
                            p.deleteBall(balls.get(i));
                            checkWin(wildPokemon, myPokemon, balls.get(i));
                            setVisible(false);
                        }
                        
                        else if(balls.get(i).getNum() == 0){
                            new BallSelection( wildPokemon, myPokemon, bag, ball);
                        }
                    }
                    
                }
                
            }

        });

        Bag.ball = balls;


        button1.add(btn);
        button1.add(btn2);
        
        button1.add(btn3);
        button1.add(btn4);

        button1.add(btn5);
        
        c.add(head, BorderLayout.NORTH);
        c.add(button1, BorderLayout.CENTER);
   
        setSize(400, 420);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void checkWin(Pokemon wildPokemon,Pokemon myPokemon,PokemonBall b){
        
        int value = ((3*wildPokemon.getMaxHp()) - (2*wildPokemon.getHp())+(3*myPokemon.getMaxHp()) -(2*myPokemon.getHp()) )* b.getRate() * 100 / 10 * (3*wildPokemon.getMaxHp());
        if(value > 50 ){

            MyName m = new MyName(wildPokemon,bag);
            m.playgui(wildPokemon,bag);
            int exp = myPokemon.getExp()+60;
            myPokemon.setExp(exp);
            myPokemon.upLevel(myPokemon);
            myPokemon.upPokemon(myPokemon);
               
        }

        else{
            System.out.println("You failed to catch");
            JOptionPane.showMessageDialog(null,"You failed to catch");
            new BallSelection( wildPokemon, myPokemon, bag, balls);
            int exp = myPokemon.getExp()+20;
            myPokemon.setExp(exp);
            myPokemon.upLevel(myPokemon);
            myPokemon.upPokemon(myPokemon);
   
        }
    }
}
