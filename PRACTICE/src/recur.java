import java.util.*;

public class recur {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,4,5};
        int target=4;
        ArrayList<Integer> bry=find(arr,target,0);
        System.out.print(bry);
    }
    public static ArrayList<Integer> find(int[] a,int t,int index)
{

    ArrayList<Integer> list=new ArrayList<>();
    if(a.length==index)
        return list;
    if(a[index]==t)
        list.add(index);
    ArrayList<Integer> h=find(a,t,++index);
    list.addAll(h);
    return list;

}
        }