import java.util.*;
public class longestsubarrayposneg {
    public static void main(String[] args)
    {
        int[] arr={1,-1,5,-2,3};
        int k=3;
        HashMap<Integer,Integer> bry=new HashMap<>();
        int sum=0,maxlen=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                maxlen=Math.max(maxlen,i+1);
            }
            int rem=sum-k;
            if(bry.containsKey(rem))
            {
                maxlen=Math.max(maxlen,i-bry.get(rem));
            }
            if(!bry.containsKey(sum))
            {
                bry.put(sum,i);
            }
        }
        System.out.print(maxlen);
    }
}
