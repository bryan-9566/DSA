public class longestsubarraypositive {
    public static void main(String[] args)
    {
        int[] a = {10, 5, 2, 7, 1, 9};
        int left=0,right=0;
        int sum=a[0],len=0,max=0,k=15;
        while(right<a.length)
        {
            if(left<=right && sum>k)
            {
                sum-=a[left];
                left++;
            }
            if(sum==k)
            {
                len=right-left+1;
                if(len>max)
                {
                    max=len;
                }
            }
            right++;
            if(right<a.length)
            {
                sum+=a[right];
            }
        }
        System.out.print(max);
    }
}
