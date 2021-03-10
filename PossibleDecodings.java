import java.util.Scanner;
// time complexity : O(n)
// space complexity : O(n) using dp memorization

public class PossibleDecodings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

       System.out.println(countDecode(str));
    }

    private static int countDecode(String str) {
        int[] mem = new int[str.length() + 1];
        return countDecodeHelper(str, str.length(), mem);
    }

    private static int countDecodeHelper(String s, int k, int memory[]) {
        int result = 0;
        if (k == 0)    // base case when the string is empty;
            return 1;
        int size = s.length() - k;
        if (s.charAt(size) == '0') // if first char is 0 then there will be no char because mappings are starting from 1;
            return 0;

        if (memory[k] != 0) {
            return memory[k];
        }

        result = countDecodeHelper(s, k - 1, memory);

        if (k >= 2 && Integer.parseInt(String.valueOf(s.substring(size,size + 2))) <= 26) {
            result += countDecodeHelper(s, k - 2, memory);
        }
        memory[k] = result;
        return result;
    }
}
