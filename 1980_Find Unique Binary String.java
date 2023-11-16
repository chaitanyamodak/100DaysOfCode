class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            String str=nums[i];
            char ch=str.charAt(i);
            if(ch=='0')
                sb.append('1');
            else
                sb.append('0');
        }
        return sb.toString();
    }
}