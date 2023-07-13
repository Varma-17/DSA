class Solution {
    public String getString(String str)
    {
        int n = str.length()-1;
        int count=0;
        String result="";
        for(int i=n;i>=0;i--)
        {
            if(str.charAt(i)=='#')
            {
                count++;
            }
            else
            {
                if(count>0)
                {
                    count--;
                }
                else
                {
                    result+=str.charAt(i);
                }
            }
        }
        return result;
    }
    public boolean backspaceCompare(String s, String t) {
        return getString(s).equals(getString(t));
    }
}
