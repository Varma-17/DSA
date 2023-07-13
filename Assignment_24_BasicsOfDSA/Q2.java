class Solution {
    public int lengthOfLongestSubstring(String s) {
        int mx=0;
        int left=0;
        int right=0;
        HashSet<Character> set=new HashSet<>();
        while(right<s.length())
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left++));
            }
            set.add(s.charAt(right++));
            mx=Math.max(mx,right-left); 
        }
        
        return mx;
    }
}
