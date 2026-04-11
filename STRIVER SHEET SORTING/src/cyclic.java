import java.util.*;
public class cyclic {
    public static void main(String[] args)
    {
        int[] a={5,3,2,4,1};
        int n=a.length;
        int i=0;
        while(i<n)
        {
            int corr=a[i]-1;
            if(a[i]!=a[corr])
            {
                int temp=a[corr];
                a[corr]=a[i];
                a[i]=temp;
            }
            else
            {
                i++;
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
