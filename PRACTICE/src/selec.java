import java.util.*;
public class selec {
    public static void main(String[] args)
    {
        int[] bry={7,6,5,3};
        sel(bry,bry.length,0,0);
        System.out.println(Arrays.toString(bry));

    }
    public static void sel(int[] b,int r,int c,int max)
    {
        if(r==0)
            return;
        if(c<r)
        {
            if(b[c]>b[max])
            {
                sel(b,r,++c,c);
            }
            else {
                sel(b,r,++c,max);
            }
        }
        else {
            int temp=b[c-1];
            b[c-1]=b[max];
            b[max]=temp;
            sel(b,r-1,0,0);
        }
    }
}
