// I have a array
// Choose a subarray which follows the following rules:
// 1. Must be a continuous part of the array
// 2.Must have consecutive elements of different parity
// Check the sum of such a subarray and return the maximum value

import java.util.*;

public class ArraysCFYarikAndArray {

    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        while (T != 0) {
            int n;
            n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++)
                array[i] = sc.nextInt();
            ArraysCFYarikAndArray sol = new ArraysCFYarikAndArray();
            int result = sol.calculate(n, array);
            System.out.println(result);
            T--;
        }
        sc.close();
    }

    int calculate(int n, int[] array) {
        int[] dp = new int[n];
        dp[0] = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] % 2 != array[i - 1] % 2) {
                dp[i] = dp[i - 1] + array[i];
            } else {
                dp[i] = array[i];
            }
        }

        Arrays.sort(dp);
        return dp[n - 1]; // Return the maximum sum
    }

}
