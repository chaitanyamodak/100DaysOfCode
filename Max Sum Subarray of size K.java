class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long  ans = 0, sum = 0;
        for(int i = 0; i < N; i++){
            if(i < K) 
                sum += Arr.get(i);
            else{
                ans = Math.max(ans,sum);
                sum += Arr.get(i);
                sum -= Arr.get(i-K);
            }
        }
        ans =Math.max(ans,sum);
        return ans;
    }
}