public class secondsmallest {
    public static void main(String[] args)
    {
        int[] arr={7,-100,};
        int small=Integer.MAX_VALUE;
        int ssmall=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                ssmall=small;
                small=arr[i];
            }
            else if(arr[i]<ssmall && arr[i]>small)
            {
                ssmall=arr[i];
            }
        }
        System.out.println(ssmall);
    }
}
