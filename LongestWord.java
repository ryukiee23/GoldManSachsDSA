package ReferenceList;

    public class LongestWord{

        public static int solve(String[] dict, String toSearch) {
            if (dict == null || toSearch == null || toSearch.isEmpty()) {
                return 0;
            }

            int ans = 0;
            String search = toSearch.toLowerCase();

            for (String s : dict) {
                if (s != null && s.toLowerCase().contains(search)) {
                    ans = Math.max(ans, s.length());
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
            String toSearch = "ODG";

            int result = solve(dict, toSearch);
            System.out.println("Longest word length is "  +result);
        }
    }
