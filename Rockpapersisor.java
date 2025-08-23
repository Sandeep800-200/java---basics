
import java.util.Scanner;
import java.util.Random;

public class Rockpapersisor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] ch = {"Rock", "Paper", "Scissors"};
        
        System.out.print("Enter your choice (Rock/Paper/Scissors): ");
        String me = sc.nextLine();
        String cmp = ch[rand.nextInt(3)];
        System.out.println("Computer chose: " + cmp);

        if(me.equalsIgnoreCase(cmp)) System.out.println("It's a Tie!");
        else if(me.equalsIgnoreCase("Rock") && cmp.equals("Scissors") ||
                me.equalsIgnoreCase("Paper") && cmp.equals("Rock") ||
                me.equalsIgnoreCase("Scissors") && cmp.equals("Paper"))
            System.out.println("You Win ✅");
        else System.out.println("You Lose ❌");
        sc.close();
    }
}



