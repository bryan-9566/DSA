import java.util.*;
public class fibo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1)
        {
            System.out.print(n);
        }
        int a=0,b=1;
        for(int i=2;i<=n;i++)
        {
            int c=a+b;
            a=b;
            b=c;

        }
        System.out.print(b);
    }
}
