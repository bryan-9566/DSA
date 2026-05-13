import java.util.*;
public class mergetwosorted2 {
    public static void main(String[] args)
    {
        int[] a1={1,3,5,7};
        int[] a2={0,2,6,8,9};
        int n=a1.length,m=a2.length;
        int len=n+m;
        int gap=(len/2)+(len%2);
        while(gap>0)
        {
            int l=0,r=l+gap;
            while(r<len)
            {
                if(l<n && r>=n)
                {
                    if(a1[l]>a2[r-n])
                    {
                        swap(a1,a2,l,r-n);
                    }
                }
                else if(l>=n)
                {
                    if(a2[l-n]>a2[r-n])
                    {
                        swap(a2,a2,l-n,r-n);
                    }
                }
                else
                {
                    if(a1[l]>a1[r])
                    {
                        swap(a1,a1,l,r);
                    }
                }
                l++;
                r++;
            }
            if(gap==1)
                break;
            gap=(gap/2)+(gap%2);
        }
        System.out.print(Arrays.toString(a1));
        System.out.print(Arrays.toString(a2));
    }
    public static void swap(int[] a,int[] b,int i,int j)
    {
        int temp=a[i];
        a[i]=b[j];
        b[j]=temp;
    }
}
