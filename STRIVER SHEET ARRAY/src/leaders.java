import java.util.*;
public class leaders {
    public static void main(String[] args)
    {
        int[] a={10,22,12,3,0,6};
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]>max)
            {
                max=a[i];
                b.add(max);
            }
        }
        System.out.print(b);
    }
}
