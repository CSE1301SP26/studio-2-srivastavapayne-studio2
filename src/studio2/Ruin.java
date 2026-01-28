import java.util.Scanner;

public class Ruin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your starting amount of money?");
        int startAmount = in.nextInt();
        System.out.println("What is the win probability?");
        double winChance = in.nextDouble();
        System.out.println("What is your win limit?");
        int winLimit = in.nextInt();
        System.out.println("How many days are you playing?");
        int totalSimulations = in.nextInt();

        while (totalSimulations>0) {
            totalSimulations--;
            while(startAmount > 0 && winLimit!=startAmount) {
            if (Math.random() < winChance) {
                System.out.println("You won 1$!");
                startAmount++;
                if(startAmount==winLimit){
                    System.out.println("Success!");
                }
            }
                else {
                System.out.println("You lost 1$!");
                startAmount--;
                    if(startAmount==winLimit){
                    System.out.println("Success!");    
                }
        }
            }
        if(startAmount==0) {
                    System.out.println("Ruin!");
                }
        }
            
            }
        }


            
        
