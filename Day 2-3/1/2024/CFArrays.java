import java.util.*;

public class CFArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CFArrays solulu = new CFArrays();
        int na = sc.nextInt();
        int nb = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[na];
        int[] b = new int[nb];
        for (int i = 0; i < na; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < nb; i++) {
            b[i] = sc.nextInt();
        }
        if (solulu.calculate(a, b, k, m))
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }

    public boolean calculate(int[] a, int[] b, int k, int m) {
        if (a.length < k)
            return false;
        if (b.length < m)
            return false;
        return (a[a.length - 1] == b[0] && k < a.length) || (a[a.length - 1] < b[0]);
    }
}
