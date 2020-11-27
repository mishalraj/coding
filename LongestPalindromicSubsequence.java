package arrays;

public class LongestPalindromicSubsequence {
	
	 static int longestSubsequence (char s[],int i,int j)
	{
		if(i==j)
			return 1;
		
		if(s[i]==s[j] && i+1==j)
			return 2;
		
		if(s[i]==s[j])
		{
			return longestSubsequence(s,i+1,j-1)+ 2;
		}
		
		return max(longestSubsequence(s, i+1,j),longestSubsequence(s,i,j-1));
	}
	
	 static int max(int x, int y) { 
	        return (x > y) ? x : y; 
	    } 

	public static void main(String[] args) {

		String s= "GEEKSFORGEEKS"; 	
		
		int len=s.length(); 
		System.out.println(longestSubsequence(s.toCharArray(),0,len-1));
		
	}

}
