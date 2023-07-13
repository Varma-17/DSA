class Solution {
	static boolean checkEquality(String s)
	{
		return (s.charAt(0) == s.charAt(s.length() - 1));
	}
	
	static int countSubstringWithEqualEnds(String s)
	{
		int result = 0;
		int n = s.length();

		for (int i = 0; i < n; i++){

		for (int j = 1; j <= n-i; j++){
			if (checkEquality(s.substring(i, i + j)))
				result++;
    }
    }
		return result;
	}
	public static void main(String args[])
	{
		String s = "abcab";
		System.out.println(countSubstringWithEqualEnds(s));
	}
}
