class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int n=nums.length;
        if(n%2 != 0)
            return false;
            
        int[] arr=new int[k+1];
        Arrays.fill(arr,0);
        for(int x:nums){
            x%=k;
            arr[x]++;
            arr[k-x]--;
        }
        for(int i=1;i<k;i++){
            if(arr[i]>0)
                return false;
        }
        return true;
    }
}