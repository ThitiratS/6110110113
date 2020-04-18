
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;


public class StatusPokemon extends JFrame {

    private static final long serialVersionUID = 1L;
    private static int i = 0;

    public StatusPokemon(ArrayList<Pokemon> p) {
        
        super("Profile of you Pokemon");
        Container c = getContentPane();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        
        try {

        	Pokemon partners = p.get(i);

        	p1.setBorder(BorderFactory.createEmptyBorder(70, 15, 15, 10));
        	p2.setBorder(BorderFactory.createEmptyBorder(70, 15, 50, 100));

        	p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        	p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        
        	JRadioButton b0 = new JRadioButton("Number : " + i);
        	JRadioButton b1 = new JRadioButton("Name : " + partners.getMyName());
        	JRadioButton b2 = new JRadioButton("Pokemon : " + partners.getName());
        	JRadioButton b3 = new JRadioButton("Type : " + partners.getType());
        	JRadioButton b4 = new JRadioButton("Level : " + partners.getLevel());
		JRadioButton b5 = new JRadioButton("HP : " + partners.getHp());
        	JRadioButton b6 = new JRadioButton("EXP : " + partners.getExp());
        	JRadioButton b7 = new JRadioButton("Gender : " + partners.getGen());    
        
        	p1.add(b0);
        	p1.add(b1);
        	p1.add(b2);
        	p1.add(b3);
       	 	p2.add(b4);
        	p2.add(b5);
        	p2.add(b6);
        	p2.add(b7); 
               
        

        JLabel j1 = new JLabel(new ImageIcon(""));;
            if(partners.getName() == "Pikachu of Satochi"|| partners.getName() == "Wild Pikachu"){
                j1 = new JLabel(new ImageIcon("img/pikachu.jpg"));
            }
            else if(partners.getName() == "Zanigame" || partners.getName() == "Wild Zanigame"  ){
                j1 = new JLabel(new ImageIcon("img/zanigame.jpg"));
            }
            else if(partners.getName() == "Raichu" || partners.getName() == "Wild Raichu"){
                j1 = new JLabel(new ImageIcon("img/raichu.jpg"));
            }
            else if (partners.getName() == "Kabigon" || partners.getName() == "Wild Kabigon"){
                j1 = new JLabel(new ImageIcon("img/kabigon.jpg"));
            }
            else if(partners.getName() == "Bulbasaur" || partners.getName() == "Wild Bulbasaur"  ){
                j1 = new JLabel(new ImageIcon("img/bulbasaur.jpg"));
            }
            else if(partners.getName() == "Electabuzz" ){
                j1 = new JLabel(new ImageIcon("img/electabuzz.jpg"));
            }
            else if (partners.getName() == "Voltorb" ){
                j1 = new JLabel(new ImageIcon("img/voltorb.jpg"));
            }
            else if(partners.getName() == "Pichu" ){
                j1 = new JLabel(new ImageIcon("img/pichu.jpg"));
            }
            else if (partners.getName() == "Sobble" ){
                j1 = new JLabel(new ImageIcon("img/sobble.jpg"));
            }
            else if(partners.getName() == "Drednaw" ){
                j1 = new JLabel(new ImageIcon("img/drednaw.jpg"));
            }
            else if (partners.getName() == "Krabby" ){
                j1 = new JLabel(new ImageIcon("img/krabby.jpg"));
            }
            else if(partners.getName() == "Shiftry" ){
                j1 = new JLabel(new ImageIcon("img/shiftry.jpg"));
            }
            else if (partners.getName() == "Lombre" ){
                j1 = new JLabel(new ImageIcon("img/lombre.jpg"));
            }
            else if(partners.getName() == "Grookey" ){
                j1 = new JLabel(new ImageIcon("img/grookey.jpg"));
            }
            else if (partners.getName() == "Kangaskhan" ){
                j1 = new JLabel(new ImageIcon("img/kangaskhan.jpg"));
            }
            else if(partners.getName() == "Eevee" ){
                j1 = new JLabel(new ImageIcon("img/eevee.jpg"));
            }
            else if (partners.getName() == "Jigglypuff" ){
                j1 = new JLabel(new ImageIcon("img/jigglypuff.jpg"));
            }
        
        
            j1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            c.add(j1, BorderLayout.WEST);
		
        } catch (NullPointerException e) {
            
        }

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
                    new StatusPokemon(p);
                    setVisible(false);
                } catch (IndexOutOfBoundsException t) {

                    i = 0;
                    new StatusPokemon(p);
                    setVisible(false);
                    //t.getMessage();
                }
			}
		});
        

        
        c.add(p1, BorderLayout.CENTER);		
        c.add(p2, BorderLayout.EAST);	
        c.add(p3, BorderLayout.SOUTH);

        setSize(720, 350);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);	
        setResizable(false);
        
    }
    
    
}





