import java.util.*;
public class merge2 {
    public static void main(String[] args)
    {
        int[] a={7,1,3,300,200,100};
        mergesort(a,0,a.length-1);
        System.out.print(Arrays.toString(a));
    }
    public static void mergesort(int[] a,int low,int high)
    {
        int mid=(low+high)/2;
        if(low>=high)
        {
            return;
        }
        mergesort(a,low,mid);
        mergesort(a,mid+1,high);
        merge(a,low,mid,high);
    }
    public static void merge(int[] a,int low,int mid,int high)
    {
        int[] temp=new int[high-low+1];
        int l=low,r=mid+1,k=0;
        while(l<=mid && r<=high)
        {
            if(a[l]<=a[r])
            {
                temp[k++]=a[l++];
            }
            else
            {
                temp[k++]=a[r++];
            }
        }
        while(l<=mid)
        {
            temp[k++]=a[l++];
        }
        while(r<=high)
        {
            temp[k++]=a[r++];
        }
        for(int i=low;i<=high;i++)
        {
            a[i]=temp[i-low];
        }
    }
}
