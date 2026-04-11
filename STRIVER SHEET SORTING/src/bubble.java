import java.util.*;
public class bubble {
    public static void main(String[] args)
    {
        int[] a={7,8,1,5,100,70,0};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
