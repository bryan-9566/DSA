class maxsubarraylength {
    public static void main(String[] args)
    {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(a);
    }
    public static void maxSubArray(int[] nums) {
        int sum=0,max=Integer.MIN_VALUE;
        int sti=0,endi=0,length=0,st=0;
        for(int i=0;i<nums.length;i++)
        {
            if(sum==0)
            {
                st=i;
            }
            sum+=nums[i];
            if(sum>max)
            {
                max=sum;
                sti=st;
                endi=i;
                length=endi-sti+1;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println(max);
        System.out.print(length);

    }
}