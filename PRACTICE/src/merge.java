import java.util.Arrays;

public class merge {
    public static void main(String[] args)
    {
        int[] bry={7,1,8,100,2,4};
        bry=mergesort(bry);
        System.out.print(Arrays.toString(bry));
    }
    public static int[] mergesort(int[] b)
    {
        int mid=b.length/2;
        if(b.length==1)
            return b;

        int[] l=mergesort(Arrays.copyOfRange(b,0,mid));
        int[] r=mergesort(Arrays.copyOfRange(b,mid,b.length));
        return merge(l,r);
    }
    public static int[] merge(int[] l,int[] r) {
        int[] org = new int[l.length + r.length];
        int i=0,j=0,k=0;
        while (i < l.length && j < r.length) {
            if (l[i] <= r[j]) {
                org[k] = l[i];
                i++;
            }else{
                org[k] = r[j];
                j++;
            }
            k++;
        }
        while (k < org.length) {
            if (i == l.length) {
                org[k] = r[j];
                j++;
                k++;
            } else {

                org[k] = l[i];
                i++;
                k++;
            }
        }
        return org;
    }
}
