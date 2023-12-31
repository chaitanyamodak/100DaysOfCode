class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        /*Brute-Force TC-O(n^2)
        int n=s.length();
        int res=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    res=Math.max(res,j-i-1);
                }
            }
        }    
        return res;
        */

        /*Using HashMap SC-O(n)
        int n=s.length();
        int res=-1;
        Map<Character,Integer> hmap=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hmap.containsKey(s.charAt(i))){
                res=Math.max(res,(i-hmap.get(s.charAt(i))-1));
            }
            else
                hmap.put(s.charAt(i),i);
        }
        return res;
        */

        //Using Array TC-O(n)   SC-O(1)
        int n=s.length();
        int res=-1;
        int[] arr=new int[26];
        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(arr[ch-'a']==-1){
                arr[ch-'a']=i;
            }
            else{
                res=Math.max(res,i-arr[ch-'a']-1);
            }
        }
        return res;
    }
}