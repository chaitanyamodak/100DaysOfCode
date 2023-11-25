class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=nums[i]+pre[i-1];
        }
        
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            int leftSum=pre[i]-nums[i];
            int rightSum=pre[n-1]-pre[i];

            int leftCount=i;
            int rightCount=n-i-1;

            int leftTotal = (leftCount*nums[i])-leftSum;
            int rightTotal = rightSum - (nums[i]*rightCount);

            result[i]=leftTotal+rightTotal;
        }

        return result;
    }
}