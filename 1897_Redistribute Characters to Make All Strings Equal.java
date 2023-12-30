class Solution {
    public boolean makeEqual(String[] words) {
        int n=words.length;
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(String str:words){
            for(char ch:str.toCharArray()){
                hmap.put(ch,hmap.getOrDefault(ch,0)+1);    
            }
        }

        for(int value:hmap.values()){
            if(value%n != 0)
                return false;
        }
        return true;
    }
}