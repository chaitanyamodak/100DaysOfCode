public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        /*Approach 1:
        int count=0;
        for(int i=31;i>=0;i--){
            if(((n>>i)&1)==1)
                count++;
        }
        return count;*/

        /*Approach 2:
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // This expression is used to turn off the rightmost set bit in n. This operation effectively removes one set bit in each iteration.
            count++;
        }
        return count;*/

        
        //Approach 3: 
        return Integer.bitCount(n);
    }
}