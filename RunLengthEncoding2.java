package ReferenceList;

public class RunLengthEncoding2 {
        public static Object[] longestUniformSubstring(String s) {
            if (s == null || s.length() == 0) {
                return new Object[]{-1, ""};
            }

            int maxLength = 1;
            int maxStart = 0;

            int currentLength = 1;
            int currentStart = 0;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currentLength++;
                } else {
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        maxStart = currentStart;
                    }
                    currentStart = i;
                    currentLength = 1;
                }
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxStart = currentStart;
            }

            String longestSubstring = s.substring(maxStart, maxStart + maxLength);
            return new Object[]{maxStart, longestSubstring};
        }

        public static void main(String[] args) {
            String str = "aabbbbCCddd";
            Object[] result = longestUniformSubstring(str);
            System.out.println("Start index: " + result[0]);
            System.out.println("Substring: " + result[1]);
        }
    }

