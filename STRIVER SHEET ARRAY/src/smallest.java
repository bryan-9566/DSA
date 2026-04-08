public class smallest {
    public static void main(String[] args)
    {
        int[] a={4,7,8,3,2};
        int small=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<small)
            {
                small=a[i];
            }
        }
        System.out.print(small);
    }
}
