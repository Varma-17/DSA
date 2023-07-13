class Solution {
    public int track(int n,boolean left)
    {
        if(n==1)
        {
            return n;
        }
        int track = track(n/2,!left);
        return !left&&n%2==0?2*track-1:track*2;
    }
    public int lastRemaining(int n) {
        return track(n,true);
    }
}
