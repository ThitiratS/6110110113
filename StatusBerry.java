
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;


public class StatusBerry extends JFrame {

    private static final long serialVersionUID = 1L;
    private static int i = 0;

    public StatusBerry(ArrayList<Food> berries) {
        
        super("Profile of you Pokemon");
        Container c = getContentPane();
        JPanel p1 = new JPanel();
        
       
        Food berry = berries.get(i);

        p1.setBorder(BorderFactory.createEmptyBorder(50, 15, 15, 10));
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        
        JRadioButton b1 = new JRadioButton("Type : " + berry.getType());
        JRadioButton b2 = new JRadioButton("Number : " + berry.getNum());
  
        p1.add(b1);
        p1.add(b2);
       
        

        JLabel j1 = new JLabel(new ImageIcon(""));;
        if(berry.getType() == "RAZZ BERRY"){
            j1 = new JLabel(new ImageIcon("razzberry.jpg"));
        }
        else if(berry.getType() == "NANAB BERRY"){
            j1 = new JLabel(new ImageIcon("banana.jpg"));
        }
        else if(berry.getType() == "PINAP BERRY"){
            j1 = new JLabel(new ImageIcon("pineapple.jpg"));
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
                    new StatusBerry(berries);
                    setVisible(false);
                } catch (IndexOutOfBoundsException t) {

                    i = 0;
                    new StatusBerry(berries);
                    setVisible(false);
                    //t.getMessage();
                }
			}
		});
        

       
        c.add(j1, BorderLayout.WEST);
        c.add(p1, BorderLayout.CENTER);		
        c.add(p3, BorderLayout.SOUTH);

        setSize(720, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);	
        setResizable(false);
        
    }
    
    
}





