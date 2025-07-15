package ReferenceList;

    public class RunLengthEncoding {

        public static String compress(String str) {
            if (str == null || str.isEmpty()) {
                return "";
            }

            StringBuilder ans = new StringBuilder();
            int count = 1;

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                } else {
                    ans.append(str.charAt(i - 1)).append(count);
                    count = 1;
                }
            }

            ans.append(str.charAt(str.length() - 1)).append(count);
            return ans.toString();
        }

    }