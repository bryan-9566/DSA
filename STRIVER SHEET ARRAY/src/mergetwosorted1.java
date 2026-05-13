import java.util.*;
public class mergetwosorted1 {
    public static void main(String[] args)
    {
        int[] a1={1,3,5,7};
        int[] a2={0,2,6,8,9};
        int l=a1.length-1;
        int r=0;
        while(l>=0 && r<a2.length)
        {
            if(a1[l]>a2[r])
            {
                swap(a1,a2,l,r);
                l--;
                r++;
            }
            else {
                break;
            }
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
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
