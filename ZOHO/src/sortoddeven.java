import java.util.Arrays;

public class sortoddeven {
    public static void main(String[] args)
    {
        int oddc=0,evenc=0;
        int[] arr={9,4,3,2,7,8,5};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
                evenc++;
            else
                oddc++;
        }
        int[] odd=new int[oddc];
        int[] even=new int[evenc];
        int e=0,o=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even[e++]=arr[i];
            }
            else {
                odd[o++]=arr[i];
            }
        }
        System.out.print(Arrays.toString(even));
        System.out.print(Arrays.toString(odd));
        sort(odd);
        sort(even);
        reverse(even);
        System.out.print(Arrays.toString(even));
        System.out.print(Arrays.toString(odd));
        int b=0,h=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                arr[i]=odd[b++];
            }
            else {
                arr[i]=even[h++];
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<a.length-i;j++)
            {
                if(a[j-1]>a[j])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }}
    static void reverse(int[] a)
    {
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }}
}
