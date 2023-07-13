import java.util.*;
class Solution {

	static List<String> al = new ArrayList<>();
  
	public static void main(String[] args)
	{
		String s = "abc";
		findsubsequences(s, "");
    al.add("");
		System.out.println(al);
	}

	private static void findsubsequences(String s,String ans)
	{
		if (s.length() == 0) {
			al.add(ans);
			return;
		}
		findsubsequences(s.substring(1), ans + s.charAt(0));
		findsubsequences(s.substring(1), ans);
	}
}
