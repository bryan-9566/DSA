import java.util.*;
public class hours24 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        int h=Integer.parseInt(a.substring(0,2));
        int m=Integer.parseInt(a.substring(3,5));
        while(true)
        {
            int c=h*60+m;
            int hr=c/60;
            int min=c%60;
            String digits=String.format("%02d%02d",hr,min);
            if(check(digits)) {
                System.out.println(String.format("%02d:%02d", hr, min));
                break;
            }
        }
    }

    public static boolean check(String s)
    {
        boolean[] bry=new boolean[10];
        for(char c:s.toCharArray())
        {
            int t=c-'0';
            if(bry[t])
                return false;
            bry[t]=true;
        }
        return true;
    }
}
