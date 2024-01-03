import java.util.*;

public class InterestingSubarray {
    public static void main(String[] args) throws java.lang.Exception {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while (T != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            int max = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            if (arr[0] < 0 && arr[n - 1] > 0) {
                if (-1 * arr[0] > arr[n - 1])
                    max = arr[0] * arr[0];
                else
                    max = arr[n - 1] * arr[n - 1];
                min = arr[0] * arr[n - 1];
            } else if (arr[0] < 0 && arr[n - 1] < 0) {
                max = arr[0] * arr[0];
                min = arr[n - 1] * arr[n - 1];
            } else {
                max = arr[n - 1] * arr[n - 1];
                min = arr[0] * arr[0];
            }

            System.out.print(min + " ");
            System.out.println(max);
            T--;
        }
        sc.close();
    }
}
