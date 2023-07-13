class Solution {

    public boolean isRotated(String s,String goal,int rotate)
    {
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)!=goal.charAt((j+rotate)%s.length()))
            {
                return false;
            }
        }
        return true;
    }

    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(isRotated(s,goal,i))
            {
                return true;
            }
        }
        return false;
    }
}
