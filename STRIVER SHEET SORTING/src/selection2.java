import java.util.*;
public class selection2 {
    public static void main(String[] args)
    {
        int[] a={7,1,3,500,200,100,0};
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int last=n-i-1;
            int max=getmax(a,0,last);
            int temp=a[max];
            a[max]=a[last];
            a[last]=temp;
        }
        System.out.print(Arrays.toString(a));
    }
    public static int getmax(int[] a,int s,int l)
    {
        int max=s;
        for(int i=0;i<=l;i++)
        {
            if(a[i]>a[max])
            {
                max=i;
            }
        }
        return max;
    }
}
