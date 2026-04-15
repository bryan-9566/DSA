import java.util.*;
public class quick {
    public static void main(String[] args)
    {
        int[] a={7,8,1,5,100,70,0};
        int n=a.length;
        quicksort(a,0,n-1);
        System.out.print(Arrays.toString(a));
    }
    public static void quicksort(int[] a,int low,int high)
    {
        if(low<high)
        {
            int pindex=partition(a,low,high);
            quicksort(a,low,pindex-1);
            quicksort(a,pindex+1,high);

        }
    }
    public static int partition(int[] a,int low,int high)
    {
        int pivot=a[low];
        int i=low;
        int j=high;
        while(i<j)
        {
            while(a[i]<=pivot && i<=high-1)
            {
                i++;
            }
            while(a[j]>pivot && j>=low+1)
            {
                j--;
            }
            if(i<j)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }
}
