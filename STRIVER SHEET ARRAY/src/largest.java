public class largest {
    public static void main(String[] args)
    {
        int[] a={4,7,8,3,2};
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>lar)
            {
                lar=a[i];
            }

        }
        System.out.print(lar);
    }
}
