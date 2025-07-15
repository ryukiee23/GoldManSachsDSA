package ReferenceList;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

        public static Character solve(String s) {
            if (s == null || s.isEmpty()) {
                return null;
            }
            Map<Character, Integer> countMap = new LinkedHashMap<>();

            for (char c : s.toCharArray()) {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            return null;
        }

        public static void main(String[] args) {
            String str1 = "12345";
            System.out.println(solve(str1));

            String str2 = "abbacd";
            System.out.println(solve(str2));
        }
    }
