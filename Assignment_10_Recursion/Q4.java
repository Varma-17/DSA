class Main
{
    public static int len(String s)
    {
        if(s.equals(""))
        {
            return 0;
        }
        else{
            return 1+len(s.substring(1));
        }
    }
	public static void main(String[] args) {
	    String s="ineuron";
		  int l=len(s);
		  System.out.println(l);
	}
}
