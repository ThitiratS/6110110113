
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Mine extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel jLabel1;
    public JTextField txtName;
    private JButton btnClick;
    private String no;
    private Pokemon wildPokemon;
    private ArrayList<Pokemon> bag;

    public Mine(Pokemon wildPokemon,ArrayList<Pokemon> bags, ArrayList<PokemonBall> ball){
        
        super("Enter Your Pokemon number");
        jLabel1 = new JLabel();
        txtName = new JTextField();
        btnClick = new JButton();
        this.wildPokemon = wildPokemon;
        bag = new ArrayList<Pokemon>();
	    
        for(Pokemon b : bags){
            bag.add(b);
        }
        
        System.out.println(bag);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        jLabel1.setText("My Pokemon Number");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 60, 140, 18);

        txtName.setName("txtName"); // NOI18N
        txtName.setSize(180, 150);
        getContentPane().add(txtName);
        txtName.setBounds(80, 100, 260, 20);
        btnClick.setText("Click");

        btnClick.addActionListener(new ActionListener(){
	    //anonymous class
	    public void actionPerformed(ActionEvent e) { 
  
                btnClickActionPerformed(e);
                setVisible(false);
                
	    }
	});

        getContentPane().add(btnClick);
        btnClick.setBounds(160, 140, 90, 23);
 
    }
    private void btnClickActionPerformed(ActionEvent evt) {   
                                     
        try {
            no = txtName.getText();
            int result = Integer.parseInt(no);
           
            for(int i = 0; i < bag.size() ; i++){
               
                if(result == i){
                    Pokemon myPokemon = bag.get(i);

                    win(wildPokemon, myPokemon, null);
        
                    System.out.println(bag);
                }
            }
            
        } catch (NumberFormatException e) {
           
            JOptionPane.showMessageDialog(null, "Please Enter Number","ErrorMsg", JOptionPane.ERROR_MESSAGE);
        }

    } 
	
    public void win(Pokemon wildPokemon,Pokemon myPokemon,ArrayList<PokemonBall> ball){
        boolean isWin = false;
        do{
            myPokemon.attack(wildPokemon);
            if(wildPokemon.getHp() == 0){
                System.out.println(wildPokemon.getHp());
                isWin = true;
                break;
            }

            wildPokemon.attack(myPokemon);
            if(myPokemon.getHp() == 0){
                System.out.println(myPokemon.getHp());
                isWin = false;
                break;
            }
            
        }while(true);

        if(isWin){
            
            Trainer.bag = bag;
            System.out.println(bag);
            JOptionPane.showMessageDialog(null,"You Win");
	    int exp = myPokemon.getExp()+60;
            myPokemon.setExp(exp);
	    myPokemon.upLevel(myPokemon);
            myPokemon.upPokemon(myPokemon);
            new BallSelection(wildPokemon,myPokemon,bag,ball);
 
        }
	    
        else{
            System.out.println(wildPokemon.getName() + " win");
	    JOptionPane.showMessageDialog(null,""+wildPokemon.getName()+" win");
	    int exp = myPokemon.getExp()+20;
            myPokemon.setExp(exp);
	    myPokemon.upLevel(myPokemon);
            myPokemon.upPokemon(myPokemon);
        }
    }
    
    public void playgui(Pokemon wildPokemon,ArrayList<Pokemon> bags, ArrayList<PokemonBall> ball) {
        Mine frame = new Mine(wildPokemon,bags,ball);
        frame.setSize(400, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
