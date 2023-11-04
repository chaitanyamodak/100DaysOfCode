class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxLeft=0;
        int minRight=Integer.MAX_VALUE;
        for(int l:left){
            maxLeft=Math.max(l,maxLeft);
        }
        for(int r:right){
            minRight=Math.min(r,minRight);
        }

        return Math.max(maxLeft,n-minRight);
        
    //One line solution
    /*return Math.max(Arrays.stream(left).max().orElse(0),n-Arrays.stream(right).min().orElse(Integer.MAX_VALUE));*/
    }
}