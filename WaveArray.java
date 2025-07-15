package ReferenceList;

import java.util.Arrays;

public class WaveArray {
        public static void solve(int[] arr) {
            if (arr == null || arr.length <= 1) {
                return;
            }

            for (int i = 0; i < arr.length - 1; i++) {
                if (i % 2 == 0) {
                    if (arr[i] < arr[i + 1]) {
                        swap(arr, i, i + 1);
                    }
                } else {
                    if (arr[i] > arr[i + 1]) {
                        swap(arr, i, i + 1);
                    }
                }
            }
        }

        private static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void main(String[] args) {
            int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
            solve(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

