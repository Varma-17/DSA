class Main
{
    public static int cons(String s,int c)
    {
        if(s.equals(""))
        {
            return c;
        }
        else{
            if(Character.toLowerCase(s.charAt(0))!='a' && Character.toLowerCase(s.charAt(0))!='e' && Character.toLowerCase(s.charAt(0))!='i' && Character.toLowerCase(s.charAt(0))!='o' && Character.toLowerCase(s.charAt(0))!='u')
            {
                c++;
            }
            return cons(s.substring(1),c);
        }
    }
	public static void main(String[] args) {
	    
		System.out.println(cons("robot",0));
	}
}
