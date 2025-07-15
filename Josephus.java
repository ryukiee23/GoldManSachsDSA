package ReferenceList;

public class Josephus {

        public static int solve(int n, int k) {
            int result = 0;
            for (int i = 2; i <= n; i++) {
                result = (result + k) % i;
            }
            return result + 1;
        }

        public static void main(String[] args) {
            int n = 4;
            int k = 2;
            System.out.println("Answer: " + solve(n, k));
        }
    }
