
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;


public class StatusBall extends JFrame {

    private static final long serialVersionUID = 1L;
    private static int i = 0;

    public StatusBall(ArrayList<PokemonBall> balls) {
        
        super("Profile of you Pokemon");
        Container c = getContentPane();
        JPanel p1 = new JPanel();
        
        // balls = Bag.ball;
        PokemonBall ball = balls.get(i);

        p1.setBorder(BorderFactory.createEmptyBorder(50, 15, 15, 10));
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        
        JRadioButton b1 = new JRadioButton("Name : " + ball.getName());
        JRadioButton b2 = new JRadioButton("Rate : " + ball.getRate());
        JRadioButton b3 = new JRadioButton("Number : " + ball.getNum());
  
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        

        JLabel j1 = new JLabel(new ImageIcon(""));;
        if(ball.getName() == "Pokeball"){
            j1 = new JLabel(new ImageIcon("img/pokeball.jpg"));
        }
        else if(ball.getName() == "Quickball"){
            j1 = new JLabel(new ImageIcon("img/quickball.jpg"));
        }
        else if(ball.getName() == "Timerball"){
            j1 = new JLabel(new ImageIcon("img/timerball.jpg"));
        }
        else if(ball.getName() == "Ultraball"){
            j1 = new JLabel(new ImageIcon("img/ultraball.jpg"));
        }
        else if(ball.getName() == "Masterball"){
            j1 = new JLabel(new ImageIcon("img/masterball.jpg"));
        }
        
        j1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel p3 = new JPanel();
        p3.setBorder(BorderFactory.createEmptyBorder(10, 265, 15, 10));
        p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));

        JButton button1 = new JButton("Next");
        p3.add(button1);
        button1.add(Box.createRigidArea(new Dimension(40, 18)));
        p3.add(Box.createRigidArea(new Dimension(30, 0)));
        
        JButton button2 = new JButton("Back"); 
        
        p3.add(button2);
        button2.add(Box.createRigidArea(new Dimension(40, 18)));
        button2.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
	});
        button1.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) { 
                
                i++;
                try {
                    new StatusBall(balls);
                    setVisible(false);
                } catch (IndexOutOfBoundsException t) {

                    i = 0;
                    new StatusBall(balls);
                    setVisible(false);
                    //t.getMessage();
                }
	    }
	});

        c.add(j1, BorderLayout.WEST);
        c.add(p1, BorderLayout.CENTER);		
        c.add(p3, BorderLayout.SOUTH);

        setSize(720, 350);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);	
        setResizable(false);
        
    }
    
    
}

