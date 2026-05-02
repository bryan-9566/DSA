class Solution {
    public int sumOfUnique(int[] nums) {
        int[] h=new int[101];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            h[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(h[nums[i]]==1)
            {
                sum+=nums[i];
            }
        }
        return sum;
    }
}