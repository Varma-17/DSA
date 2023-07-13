class Solution {
    public String reverseStr(String s, int k) {
        char[] words=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k)
        {
            reverse(words,i,Math.min(i+k-1,s.length()-1));
        }
        return new String(words);
    }
    
    public void reverse(char[] words,int l,int r)
    {
        while(l<=r)
        {
            char ch=words[l];
            words[l]=words[r];
            words[r]=ch;
            l++;r--;
        }
    }

}
