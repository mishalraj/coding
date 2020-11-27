package arrays;

import java.util.ArrayList;

public class PossiblePhoneChars {

	static final String codes[] = { " ", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

	public static ArrayList<String> printKeyWords(String str) {

		if (str.length() == 0) { 
			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}		
		char ch = str.charAt(0);
		String restStr = str.substring(1);  
		ArrayList<String> prevRes = printKeyWords(restStr);
		ArrayList<String> res = new ArrayList<>();
	
		String code = codes[ch - '0'];
		
		for (String val : prevRes) {
			for (int i = 0;i < code.length();i++) {
				res.add(code.charAt(i) + val);
			}
		}
		return res;
	}

	public static void main(String[] args) {

		String str = "12";

		System.out.println(printKeyWords(str));
	}

}
