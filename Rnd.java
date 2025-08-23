import java.util.Scanner;
import java.util.Random;
public class Rnd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random r = new Random();
        int n = r.nextInt(100)+1;
        int guess;
        System.out.println("guess the number between 1-100");
        do{
            guess = sc.nextInt();
            if(guess == n )
                System.out.println("right guess!!!!!");
             else if (guess> n)
                System.out.println("u guessed higher !!!");
            else {System.err.println("u guessed lower!!!!!!");}

        }
        while (n != guess);
               System.out.println("the number was "+n);
               sc.close();


        }
    }


