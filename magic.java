import java.util.Scanner;
public class magic
{
     public static void main(String[] args) {
        int n; int sum=0; int sum1=0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("your entered number is= "+n);
        while(n>9){
            sum=0;
        while(n!=0)
        {
            int r = n%10;
            sum=sum+r;
            n=n/10;
        }
        if(sum>9){
            n=sum;
        }
    }
       if(sum==1){
System.out.println("magic");
        }            
        else
        System.out.println(" not magic");
    }
}