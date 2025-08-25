import java.util.Scanner;
public class Arr {
 public static int main(String[] args){
 Scanner sc = new Scanner(System.in);
 int [] arr= new int[100];
 System.out.println("enter the lenght array:-");
 int n = sc.nextInt();
for (int i =0;i<n;i++)
{
    System.err.println("enter the " + i+1 + "element of array:-" );
    arr[i]=sc.nextInt();
}
int sum=0;
for (int i=0; i<n;i++){
    sum=sum+arr[i];
}
System.out.println("the sum of elements of array is"+ sum);
return sum;
}

    
}


    

