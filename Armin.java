import java.util.Scanner;

public class Armin 
{
    public static int[] irr(int n, Scanner sc) {
        int[] arr = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int mn(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int mX(int[] arr) {
        int max  = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max)
             {
                max = arr[i];
            }
        }
        return max;
    }
     
    public static int sum(int[] arr) {
        int s = 0;
         for(int i = 1; i < arr.length; i++)
        {
            s=s+arr[i];
        }
        return s;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] ar = irr(n, sc);
        int minimum = mn(ar);
        int maximum = mX(ar);
        int sum = sum(ar);

        System.out.println("The lowest number in array is: " + minimum);
        System.out.println("The highest number in array is: " + maximum);
        System.out.println("The sum of  array is: " +sum );

        sc.close();
    }
}


   

