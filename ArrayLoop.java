package ReferenceList;

public class ArrayLoop {
        public static int solve(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                int slow = i;
                int fast = i;

                do {
                    slow = nextIndex(arr, slow, n);
                    fast = nextIndex(arr, fast, n);
                    if (fast != -1) {
                        fast = nextIndex(arr, fast, n);
                    }
                } while (slow != -1 && fast != -1 && slow != fast);

                if (slow != -1 && slow == fast) {
                    int length = 1;
                    int current = nextIndex(arr, slow, n);
                    while (current != slow) {
                        current = nextIndex(arr, current, n);
                        length++;
                    }
                    if (length > 1) {
                        return length;
                    }
                }
            }
            return -1;
        }

        private static int nextIndex(int[] arr, int current, int n) {
            if (current == -1) return -1;

            int move = arr[current];
            int next;

            if (move > 0) {
                next = (current + move) % n;
            } else {
                next = (current - (-move)) % n;
            }

            next = (next + n) % n;

            if (next == current) {
                return -1;
            }

            return next;
        }

        public static void main(String[] args) {
            int[] arr = {2, -1, 1, 2, 2};
            System.out.println(solve(arr));
        }
    }

