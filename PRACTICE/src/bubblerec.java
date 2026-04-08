import java.util.Arrays;

public class bubblerec {
    public static void main(String[] args)
    {
        int[] bry={90,67,56,4,5,7};
        sort(bry,bry.length-1,0);
        System.out.print(Arrays.toString(bry));
    }
    public static void sort(int[] b,int r,int c)
    {
        if(r==0)
            return;
        if(c<r)
        {
            if(b[c]>b[c+1])
            {
                int temp=b[c];
                b[c]=b[c+1];
                b[c+1]=temp;
            }
            sort(b,r,++c);
        }
        else {
            sort(b,r-1,0);
        }
    }
}
