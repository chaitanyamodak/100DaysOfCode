class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] t = new int[n + 1];
        
        //t[i] = Maximum sum for the partition arr of size i
        //we need to find max for whole array = t[n]
        for (int i = 0; i <= n; i++) {
            int currMax = -1;
            
            for (int j = 1; j <= k && i - j >= 0; j++) { // I am taking subarray of size j
                currMax = Math.max(currMax, arr[i - j]);
                t[i] = Math.max(t[i], t[i - j] + currMax * j);
            }
        }

        return t[n];
    }
}