public class secondlargest {
    public static void main(String[] args)
    {
        int[] a={-1,7};
        int lar=Integer.MIN_VALUE;
        int slar=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>lar)
            {
                slar=lar;
                lar=a[i];
            }
            else if(a[i]<lar && a[i]>slar)
            {
                slar=a[i];
            }
        }
        System.out.print(slar);
    }
}
