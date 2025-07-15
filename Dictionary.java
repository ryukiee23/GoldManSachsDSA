package ReferenceList;

import java.util.*;

public class Dictionary {

        public static List<String> solve(String[] dict, String input) {
            List<String> result = new ArrayList<>();
            int[] inputFreq = new int[26];

            for (char c : input.toCharArray()) {
                inputFreq[c - 'a']++;
            }
            for (String word : dict) {
                if (canForm(word, inputFreq)) {
                    result.add(word);
                }
            }

            return result;
        }

        private static boolean canForm(String word, int[] inputFreq) {
            int[] wordFreq = new int[26];

            for (char c : word.toCharArray()) {
                wordFreq[c - 'a']++;
                if (wordFreq[c - 'a'] > inputFreq[c - 'a']) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            String[] dict1 = {"ab", "abcd", "bcdaf", "bcad", "acb", "acab"};
            String input1 = "abcd";
            System.out.println(solve(dict1, input1));

            String[] dict2 = {"ab", "abcd", "bcdaf", "bcad", "acaab", "acab"};
            String input2 = "caab";
            System.out.println(solve(dict2, input2));
        }
    }

