class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int result=0;
        for(int m=n/3;m<n;m+=2){
            result+=piles[m];
        }
        return result;
    }
}