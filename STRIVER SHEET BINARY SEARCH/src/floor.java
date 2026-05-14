public class floor {
    public static void main(String[] args)
    {
        int[] a={1,2,8,10,10,12,19};
        int x=0;
        int ans=-1;
        int low=0,high=a.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(a[mid]<=x)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
