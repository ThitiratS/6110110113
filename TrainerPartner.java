



import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.*;

public class TrainerPartner extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private ArrayList<Actor> actors;
    private JRadioButton j1,j2;

    public TrainerPartner(){
        
        super("Pokemon Game");
        Container c = getContentPane();
        actors = new ArrayList<Actor>();
        
        Partner p = new Partner();
        actors = p.act();

        JPanel head = new JPanel();
        JLabel k1 = new JLabel("Pokemon Hatching ", JLabel.CENTER);
        head.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		k1.setFont(k1.getFont().deriveFont(Font.BOLD,35f));
        head.setForeground(Color.BLACK);
        head.setBackground(Color.PINK);
        head.add(k1);

        JPanel radio1 = new JPanel();
        radio1.setBorder(BorderFactory.createEmptyBorder(50, 20, 10, 30));
        radio1.setLayout(new BoxLayout(radio1, BoxLayout.Y_AXIS));
        j1 = new JRadioButton(""+ actors.get(0)+"\n",true);
        JLabel k2 = new JLabel( " " + p.satochiBall());
        radio1.add(j1);
        radio1.add(k2);
        
        // JPanel radio2 = new JPanel();
       
        // radio2.setBorder(BorderFactory.createEmptyBorder(50, 0, 10, 30));
        // radio2.setLayout(new BoxLayout(radio2, BoxLayout.Y_AXIS));
        j2 = new JRadioButton(""+ actors.get(1),false);
        JLabel k3 = new JLabel(" "+p.hikariBall());
        radio1.add(j2);
        radio1.add(k3);
       
        ButtonGroup group = new ButtonGroup();
        group.add(j1);
        group.add(j2);
        

        JPanel button = new JPanel();
        JButton btn = new JButton("SELECT");
        button.setLayout(new BoxLayout(button, BoxLayout.X_AXIS));
        btn.add(Box.createRigidArea(new Dimension(290, 20)));
        btn.addActionListener(new ActionListener() {
           

            public void actionPerformed(ActionEvent arg0) {

                if(j1.isSelected()){
                    System.out.println(p.satochiBall());
                    
                    JOptionPane.showMessageDialog(null,"Your Partner is " + actors.get(0));
                    Bag.ball = p.satochiBall();
                    System.out.println(Bag.ball);
                    new MainGame(Bag.ball);
                   
  
                } else if (j2.isSelected()) {
                    System.out.println(p.hikariBall());
                    Bag.ball = p.satochiBall();
                    JOptionPane.showMessageDialog(null,"Your Partner is "+ actors.get(1));
                    new MainGame(Bag.ball);

                }
                setVisible(false);
                
            }

        });
        JButton btn2 = new JButton("CANCLE");
        btn2.add(Box.createRigidArea(new Dimension(290, 20)));
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
        // c.add(radio2, BorderLayout.EAST);
        c.add(head, BorderLayout.NORTH);
        
        
        setSize(660, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}