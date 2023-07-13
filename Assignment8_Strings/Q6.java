class Solution {
    public boolean isAnagram(String s,String t)
    {
        int count[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int c:count)
        {
            if(c!=0)
            {
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length()-p.length()+1;i++)
        {
            if(isAnagram(s.substring(i,p.length()+i),p))
            {
                list.add(i);
            }
        }
        return list;
    }
}
