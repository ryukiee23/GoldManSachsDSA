package ReferenceList;

import java.util.List;
import java.util.ArrayList;

    public class Prefix {

        public static List<String> solve(String[] str, String prefix) {
            List<String> result = new ArrayList<>();
            if (str == null || prefix == null) {
                return result;
            }

            for (String word : str) {
                if (word != null && word.startsWith(prefix)) {
                    result.add(word);
                }
            }

            return result;
        }

        public static void main(String[] args) {
            String[] arr = {"apple", "applet", "bread", "aper"};
            String prefix = "app";

            List<String> wordsWithPrefix = solve(arr, prefix);
            System.out.println(wordsWithPrefix);
        }
    }


