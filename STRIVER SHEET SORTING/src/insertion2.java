import java.util.*;
public class insertion2 {
    public static void main(String[] args)
    {
        int[] a={7,1,3,500,200,100};
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
