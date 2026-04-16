import java.util.*;
public class selectionmax {
    public static void main(String[] args)
    {
        int[] a={7,1,3,500,200,100,0};
        int n=a.length;
        for(int i=n-1;i>0;i--)
        {
            int max=i;
            for(int j=i-1;j>=0;j--)
            {
                if(a[j]>a[max])
                {
                    max=j;
                }
            }
            int temp=a[i];
            a[i]=a[max];
            a[max]=temp;
        }
        System.out.print(Arrays.toString(a));
    }
}
