public class lowerbound {
    public static void main(String[] args)
    {
        int[] arr={2, 3, 7, 10, 11, 11, 25};
        int target = 9;
        int ans=arr.length;
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
