import java.util.Scanner;
public class Ruin2 {

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
        int baseline = 0;

        while (totalSimulations>0) {
            totalSimulations--;
            while(startAmount > 0 && winLimit!=startAmount) {
            if (Math.random() < winChance) {
                startAmount++;
                if(startAmount==winLimit){
                }
            }
                else {
                startAmount--;
                    if(startAmount==winLimit){   
                }
        }
            }
        if(startAmount==0) {
                }
                baseline++;
        }
            System.out.println("Simulation " + baseline + ":");
            }
        }

    
