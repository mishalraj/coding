
import java.util.*;

public class GroupingAnagrams {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("cat");
		list.add("dog");
		list.add("ogd");
		list.add("god");
		list.add("atc");

		System.out.println(solver(list));
	}

	private static ArrayList<ArrayList<String>> solver(ArrayList<String> list) {

		HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<HashMap<Character, Integer>, ArrayList<String>>();

		for (String s : list) {
			HashMap<Character, Integer> temp = new HashMap<>();

			for (int i = 0; i < s.length(); i++) {
				if (temp.containsKey(s.charAt(i))) {
					temp.put(s.charAt(i), temp.get(s.charAt(i)) + 1);
				} else {
					temp.put(s.charAt(i), 1);
				}
			}
			if (map.containsKey(temp)) {
				map.get(temp).add(s);
			}
			else {
				ArrayList<String> arr = new ArrayList<>();
				arr.add(s);
				map.put(temp, arr);
			}
		}
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		for (HashMap<Character, Integer> m : map.keySet()) {
			res.add(map.get(m));
		}
		return res;
	}

}
