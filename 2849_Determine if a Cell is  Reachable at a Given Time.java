class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int mn=Math.min(Math.abs(sx-fx),Math.abs(sy-fy))+Math.abs(Math.abs(sx-fx)-Math.abs(sy-fy));
        if(sx==fx && sy==fy && t==1)
            return false;
        
        if(t>=mn)
            return true;

        return false;
    }
}