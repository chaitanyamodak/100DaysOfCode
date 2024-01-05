class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        List<Integer> sorted=new ArrayList<>();
        for(int i=0;i<n;i++){
            int index=binarySearch(sorted,nums[i]);

            if(index==sorted.size()){
                sorted.add(nums[i]);
            }
            else{
                sorted.set(index,nums[i]);
            }
        }
        return sorted.size();
    }

    private int binarySearch(List<Integer> sorted,int target){
        int start=0;
        int end=sorted.size();
        int result=sorted.size();
        while(start<end){
            int mid=start+(end-start)/2;
            if(sorted.get(mid)<target){
                start=mid+1;
            }
            else{
                result=mid;
                end=mid;
            }
        }
        return result;
    }
}