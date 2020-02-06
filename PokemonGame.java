import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("Start Game!");
        Pokemon A = new Pokemon();
        Random rand = new Random();   
        for(int i=1 ; i <= 8 ;i++){
            System.out.println(A.setType(rand.nextInt(i)));
        }
        A.start();
    }      
}
