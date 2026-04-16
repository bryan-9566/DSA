import java.util.*;
public class mergekunal {
    public static void main(String[] args)
    {
        int[] a={7,1,3,500,200,100};
        a=mergesort(a);
        System.out.print(Arrays.toString(a));
    }
    public static int[] mergesort(int[] a)
    {
        if(a.length==1)
            return a;
        int mid=a.length/2;
        int[] l=mergesort(Arrays.copyOfRange(a,0,mid));
        int[] r=mergesort(Arrays.copyOfRange(a,mid,a.length));
        return merge(l,r);
    }
    public static int[] merge(int[] l,int[] r)
    {
        int[] bry=new int[l.length+r.length];
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length)
        {
            if(l[i]<=r[j])
            {
                bry[k++]=l[i++];
            }
            else
            {
                bry[k++]=r[j++];
            }
        }
        while(k<bry.length)
        {
            if(i<l.length)
            {
                bry[k++]=l[i++];
            }
            if(j<r.length)
            {
                bry[k++]=r[j++];
            }
        }
        return bry;
    }
}
