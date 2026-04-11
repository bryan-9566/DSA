import java.util.*;
public class insertion {
public static void main(String[] args)
{
    int[] a={7,1,3,500,200,100};
    int n=a.length;
    for(int i=1;i<n;i++)
    {
        int key=a[i];
        int j=i-1;
        while(j>=0 && a[j]>key)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
    }
    System.out.print(Arrays.toString(a));
}
}
