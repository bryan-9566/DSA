import java.util.Arrays;

public class wave {
    public static void main(String[] args)
    {
        int[] arr={10,5,6,3,2,20,100,80};
        for(int i=0;i<arr.length-1;i++)
        {
            if(i%2==0)
            {
                if(arr[i]<arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            else
            {
                if(arr[i]>arr[i+1])
                {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;}
            }}
        System.out.print(Arrays.toString(arr));
    }
}
