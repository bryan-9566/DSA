public class ceil {
    public static void main(String[] args)
    {
        int[] arr={1,2,8,11,12,19};
        int target = 20;
        int ans=-1;
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
