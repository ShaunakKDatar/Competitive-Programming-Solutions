import java.util.*;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int currentHIndex = Math.min(citations[i], n - i);
            hIndex = Math.max(hIndex, currentHIndex);
        }
        return hIndex;
    }
}