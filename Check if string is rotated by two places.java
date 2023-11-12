class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        int n=str1.length();
        if(n==2)
            return str1==str2;
        
        for(int i=0;i<n;i++){
            if(str1.charAt((i+2)%n)==str2.charAt(i) || str1.charAt((n+i-2)%n)==str2.charAt(i))
                continue;
            else
                return false;
        }
        return true;
    }
}