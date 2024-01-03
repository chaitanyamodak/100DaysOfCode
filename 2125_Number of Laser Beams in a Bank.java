class Solution {
    public int numberOfBeams(String[] bank) {
        int currentDeviceCount = 0;
        int previousDeviceCount = 0;
        int result=0;
        for(int i=0;i<bank.length;i++){
            currentDeviceCount=0;
            for(char ch:bank[i].toCharArray()){
                if(ch=='1')
                    currentDeviceCount++;
            }
            result += (currentDeviceCount * previousDeviceCount);

            previousDeviceCount = (currentDeviceCount == 0)? previousDeviceCount : currentDeviceCount;
        }
        return result;
    }
}