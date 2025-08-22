import java.util.Scanner;

public class Armin {

    // Method to input array
    public static int[] irr(int n, Scanner sc) {
        int[] arr = new int[n]; // size = n
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] ar = irr(n, sc);
        int minimum = mn(ar);

        System.out.println("The lowest number in array is: " + minimum);

        sc.close();
    }
}

   

