package ReferenceList;

    public class MinimumDistance {

        public static int solve(String str, String word1, String word2) {
            if (str == null || word1 == null || word2 == null) {
                return -1;
            }

            String[] words = str.split("\\s+");
            int minDist = Integer.MAX_VALUE;
            int pos1 = -1, pos2 = -1;

            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word1)) {
                    pos1 = i;
                    if (pos2 != -1) {
                        minDist = Math.min(minDist, Math.abs(pos1 - pos2));
                    }
                } else if (words[i].equals(word2)) {
                    pos2 = i;
                    if (pos1 != -1) {
                        minDist = Math.min(minDist, Math.abs(pos1 - pos2));
                    }
                }
            }

            return (minDist == Integer.MAX_VALUE) ? -1 : minDist;
        }

        public static void main(String[] args) {
            String str = "the quick the brown quick brown the frog";
            String word1 = "quick";
            String word2 = "frog";

            System.out.println(solve(str, word1, word2));
        }
    }
