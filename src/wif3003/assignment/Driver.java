
package wif3003.assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean inputAccepted = false;
        int n = 0;
        int t = 0;
        int m = 0;
       
        while (!inputAccepted) {
            try {
                System.out.println("Please enter the number of coordinates : ");
                n = Integer.valueOf(input.nextLine());
                inputAccepted = true;
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number.");
            }
        }
        
        inputAccepted = false;
        
        while (!inputAccepted) {
            try {
                System.out.println("Please enter the number of threads (has to be smaller than number of coordinates) : ");
                t = Integer.valueOf(input.nextLine());
                boolean k = compare(n,t);
                if(k != true){
                    inputAccepted = true;
                }else{
                    System.out.println("Not a valid number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number.");
            }
        }
          
        
        inputAccepted = false;
        
        while (!inputAccepted) {
            try {
                System.out.println("Please enter the time limit :");
                m = Integer.valueOf(input.nextLine());
                inputAccepted = true;
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number.");
            }
        }
        
     
       
        
        Game game = new Game(n,m);
        game.generatePoints();
        
        
        
        //Generate number of threads based on user input
        for(int i = 0; i < t;i++){
//           ArrayList<Point> points = game.getPoints();  
//           Runnable a = new Threads(points);
//           Thread temp = new Thread(a);
//           temp.setName("Thread " + Integer.toString(i));
//           temp.start();
        }
        
        
    }
    
    
    public static int convertToInt(String x){
        
        int y = Integer.parseInt(x);       
        
        return y;
    }
    
    public static boolean compare(int n, int t){
        
        if(t > n){
            return true;
        }else{
            return false;
        }
        
    }
    
}
