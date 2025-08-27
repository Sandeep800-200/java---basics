import java.util.Scanner;
public class Sumn 
{
public static int sum(int n)
{
    Scanner sc = new Scanner (System.in);
    int s= 0;
    for(int i=1 ; i<=n; i++)
        {
            
            System.out.println("enter thr number to be added :- ");
            int e = sc.nextInt();
            s=s+e;
        sc.close();
        }
        return s;
    }
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the number of natural number ");
        int n = sc.nextInt();
        int s = sum(n);
System.out.println("sum of "+ n + "natural number is "+ s);
sc.close();
    }
}


