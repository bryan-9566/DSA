public class countrotation {
    public static void main(String[] args)
    {
        int[] bry={3,4,5,1,2};
        int in=-1;
        int min=Integer.MAX_VALUE;
        int low=0,high=bry.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(bry[low]<=bry[mid])
            {
                if(min>bry[low])
                {
                    in=low;
                    min=bry[low];
                }
                low=mid+1;
            }
            else
            {
                if(min>bry[mid])
                {
                    in=mid;
                    min=bry[mid];
                }
                high=mid-1;
            }

        }
        System.out.println(in);
        System.out.println(min);
    }
}
