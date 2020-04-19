
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class Hello extends JFrame {

    private static final long serialVersionUID = 1L;
    public Hello(ArrayList<PokemonBall> balls,Actor a){

        super("Pokemon Game");
       
        
        Container c = getContentPane();
        
        if(a.getName() == "Satochi"){
            JPanel head = new JPanel();
            JLabel k1 = new JLabel("Hi Satochi", JLabel.CENTER);
            head.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            k1.setFont(k1.getFont().deriveFont(Font.BOLD,28f));
        
            head.setForeground(Color.RED);
            head.setBackground(Color.orange);
            head.add(k1);
            head.setBounds(0, 0, 500, 60);
            c.add(head);

        }
        else if(a.getName() == "Hikari"){
            JPanel head = new JPanel();
            JLabel k1 = new JLabel("Hi Hikari", JLabel.CENTER);
            head.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            k1.setFont(k1.getFont().deriveFont(Font.BOLD,28f));
        
            head.setForeground(Color.RED);
            head.setBackground(Color.orange);
            head.add(k1);
            head.setBounds(0, 0, 500, 60);
            c.add(head);

        }
        
    
        JPanel button1 = new JPanel();
        button1.setLayout(new BoxLayout(button1, BoxLayout.X_AXIS));
        button1.setBounds(170, 300, 130, 30);

        JButton btn = new JButton("Go");
        btn.add(Box.createRigidArea(new Dimension(100, 20)));

        btn.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {
                MainGame m = new MainGame(Bag.ball);
                m.use(Bag.ball);
                setVisible(false);

            }

        });
        
        button1.add(btn);
        c.add(button1);

    }
    public void use(ArrayList<PokemonBall> balls,Actor a){
        JLabel j = new JLabel(new ImageIcon("img/satochi.jpeg"));
        JLabel j1 = new JLabel(new ImageIcon("img/hikari.jpg"));
        Hello m = new Hello(balls,a);
        
        m.setSize(500, 410);
        if(a.getName() == "Satochi"){
            m.add(j);
            m.setIconImage(new ImageIcon("img/satochi.jpg").getImage());
        }
        if(a.getName() == "Hikari"){
            m.add(j1);
            m.setIconImage(new ImageIcon("img/hikari.jpg").getImage());
        }

        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
        
    }
 
}