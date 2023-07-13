class Solution {
    public String decodeString(String s) {
        String res="";
        Stack<String> ress=new Stack<>();
        Stack<Integer> counts=new Stack<>();
        int i=0;
        while(i<s.length())
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int count=0;
                while(Character.isDigit(s.charAt(i)))
                {
                    count=count*10+(s.charAt(i)-'0');  
                    i++;
                }
                counts.push(count);
            }
            else if(s.charAt(i)=='[')
            {
                ress.push(res);
                res="";
                i++;
            }
            else if(s.charAt(i)==']')
            {
                StringBuilder sb=new StringBuilder(ress.pop());
                int c=counts.pop();
                for(int j=0;j<c;j++)
                {
                    sb.append(res);
                }

                res=sb.toString();
                i++;
            }
            else
            {
                res+=s.charAt(i);
                i++;
            }
        }
        return res;
    }
}
