import java.util.*;
public class countinversions {
    public static void main(String[] args)
    {
        int cnt=0;
        int[] a={3,2,1};
        cnt=mergesort(a,0,a.length-1);
        System.out.print(Arrays.toString(a));
        System.out.println();
        System.out.println(cnt);
    }
    public static int mergesort(int[] a,int low,int high)
    {
        int cnt=0;
        int mid=(low+high)/2;
        if(low>=high)
        {
            return cnt;
        }
        cnt+=mergesort(a,low,mid);
        cnt+=mergesort(a,mid+1,high);
        cnt+=merge(a,low,mid,high);
        return cnt;
    }
    public static int merge(int[] a,int low,int mid,int high)
    {
        int cnt=0;
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
                cnt+=(mid-l+1);
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
        return cnt;
    }
}
