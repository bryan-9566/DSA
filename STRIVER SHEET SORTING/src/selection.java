import java.util.*;
public class selection {
public static void main(String[] args)
{
    int[] a={7,1,3,500,200,100,0};
    int n=a.length;
    for(int i=0;i<n-1;i++)
    {
        int min=i;
        for(int j=i+1;j<n;j++)
        {
            if(a[j]<a[min])
            {
                min=j;
            }
        }
        int temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    }
    System.out.print(Arrays.toString(a));
}
}
