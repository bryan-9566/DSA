public class checkifsorted {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        System.out.println(check(a));
    }
    public static boolean check(int[] a)
    {
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>=a[i-1])
            {

            }
            else {
                return false;
            }
        }
        return true;
    }
}
