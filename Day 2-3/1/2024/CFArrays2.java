import java.util.Arrays;
import java.util.Scanner;

public class CFArrays2 {

    int[] first;
    int[] second;
    int[] third;
    static int neg = 0;
    static int pos = 0;
    static int zero = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] < 0)
                neg++;
            if (a[i] > 0)
                pos++;
            if (a[i] == 0)
                zero++;
        }
        Arrays.sort(a);
        CFArrays2 cfa = new CFArrays2();
        cfa.populateThird(a);
        cfa.populateFirst(a);
        cfa.populateSecond(a);
        cfa.print(cfa.first);
        cfa.print(cfa.second);
        cfa.print(cfa.third);
        sc.close();

    }

    public void populateThird(int[] a) {
        third = new int[zero];
        for (int i = 0; i < zero; i++)
            third[i] = a[i + neg];
    }

    public void populateFirst(int[] a) {
        if (neg % 2 != 0) {
            if (pos != 0) {
                first = new int[neg];
                for (int i = 0; i < neg; i++)
                    first[i] = a[i];
            } else {
                first = new int[neg - 2];
                for (int i = 0; i < neg - 2; i++) {
                    first[i] = a[i];
                }
            }
        }
    }

    public void populateSecond(int[] a) {
        if (pos == 0) {
            second = new int[2];
            for (int i = neg - 2; i < neg; i++)
                second[i - neg + 2] = a[i];
        } else {
            second = new int[pos];
            for (int i = a.length - pos; i < a.length; i++) {
                second[i - a.length + pos] = a[i];
            }
        }
    }

    public void print(int[] a) {
        System.out.print(a.length + " ");
        for (int j : a)
            System.out.print(j + " ");
        System.out.println();
    }
}