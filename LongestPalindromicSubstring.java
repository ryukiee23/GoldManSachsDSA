package ReferenceList;

public class LongestPalindromicSubstring {
    public static String[] solve(String s) {
        if (s == null || s.length() == 0) {
            return new String[]{"", "0"};
        }

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        String palindrome = s.substring(start, end + 1);
        return new String[]{palindrome, String.valueOf(palindrome.length())};
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;  // Length of palindrome
    }

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        String[] result = solve(str);
        System.out.println("Palindrome: " + result[0]);
        System.out.println("Length: " + result[1]);

        }
    }

