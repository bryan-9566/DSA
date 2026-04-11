import java.util.HashMap;
import java.util.Map;

public class occurences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4};
        HashMap<Integer, Integer> bry = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            bry.put(arr[i], bry.getOrDefault(arr[i], 0) + 1);
        }
        HashMap<Integer, Integer> h = new HashMap<>();
        for (Map.Entry<Integer, Integer> e : bry.entrySet())
        {
            int num = e.getKey();
            int cou = e.getValue();
            h.put(cou,h.getOrDefault(cou,0)+num*cou);
        }
        System.out.println(h);
    }}