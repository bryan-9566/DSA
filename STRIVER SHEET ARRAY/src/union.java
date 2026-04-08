import java.util.*;
public class union {
    public static void main(String[] main)
    {
        int[] a={1,2,3,4,9};
        int[] b={1,3,6,7};
        int[] res=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
                if(i>0 && a[i]==a[i-1])
                {
                    i++;
                    continue;
                }
                if(j>0 && b[j]==b[j-1])
                {
                    j++;
                    continue;
                }
                if(a[i]<b[j])
                {
                    res[k++]=a[i++];
                }
                else if(b[j]<a[i])
                {
                    res[k++]=b[j++];
                }
                else
                {
                    res[k++]=a[i++];
                    j++;
                }
        }
        while(i<a.length)
        {
            if(i>0 && a[i]==a[i-1])
            {
                i++;
                continue;
            }
            res[k++]=a[i++];
        }
        while(j<b.length)
        {
            if(j>0 && b[j]==b[j-1])
            {
                j++;
                continue;
            }
            res[k++]=b[j++];
        }
        System.out.print(Arrays.toString(res));
    }
}
