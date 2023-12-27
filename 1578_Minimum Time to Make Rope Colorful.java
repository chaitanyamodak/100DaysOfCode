public class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        
        int time = 0;
        int prevMax = 0;
        
        for (int i = 0; i < n; i++) {
            
            if (i > 0 && colors.charAt(i) != colors.charAt(i - 1)) {
                prevMax = 0;
            }

            int curr = neededTime[i];
            
            // Greedily select the minimum between prevMax and curr
            time += Math.min(prevMax, curr);
            
            // Update prevMax to the maximum between prevMax and curr
            prevMax = Math.max(prevMax, curr);
        }
        
        return time;
    }
}