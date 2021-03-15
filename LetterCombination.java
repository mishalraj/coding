

import java.util.*;

public class LetterCombination {
	static Map<String, String> store = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String digits = sc.next();

		store.put("1", "");
		store.put("1", "");
		store.put("2", "abc");
		store.put("3", "def");
		store.put("4", "ghi");
		store.put("5", "jkl");
		store.put("6", "mno");
		store.put("7", "pqrs");
		store.put("8", "tuv");
		store.put("9", "xyzw");
		
		
		List<String> res= letterCombo(digits);
		
		for(String s: res)
			System.out.print(s+" ");
		
	}

	private static List<String> letterCombo(String digits) {
			List<String> res= new ArrayList<String>();
			
			if(digits.length()==0 ||digits==null)
				return res;
			
		letterComboUtil(digits,res,0,new StringBuilder());
		
		return res;
	}

	private static void letterComboUtil(String digits, List<String> res, int pos, StringBuilder stringBuilder) {

		if(stringBuilder.length()==digits.length()) {
			res.add(new String (stringBuilder.toString()));
			return;
		}
		for(int i=pos;i<digits.length();i++)
		{
			String temp= store.get(String.valueOf(digits.charAt(i)));
			for(int j=0;j<temp.length();j++)
			{
				stringBuilder.append(temp.charAt(j));
				letterComboUtil(digits,res,i+1,stringBuilder);
				stringBuilder.deleteCharAt(stringBuilder.length()-1);
			}
		}
		
		}
	

}
