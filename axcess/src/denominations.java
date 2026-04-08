import java.util.*;

public class denominations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int n = s.nextInt();
        int[] bry = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int c = 0;
        for (int a : bry) {
            if (n >= a) {
                int r = n / a;
                c += r;
                n = n % a;
            }

        }
        System.out.println(c);
    }
}
