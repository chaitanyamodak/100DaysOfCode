class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> lst=new ArrayList<>();
       Set<Integer> uniqueSet=new HashSet<>();
       for(int num:nums){
           if(uniqueSet.contains(num)){
               lst.add(num);
           }

           uniqueSet.add(num);
       } 
       return lst;
    }
}