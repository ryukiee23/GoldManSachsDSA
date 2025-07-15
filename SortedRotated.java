package GoldManSachsQuestions;

public class SortedRotated {

    public static void main(String[] args) {
//    Given a sorted rotated array,
//            return the minimum element from it.
//
//            Examples:
//        int[] arr = {6, 7, 1, 2, 3, 4, 5};    //Return 1
      int arr[] = {3,1,2};
//          int[] arr = {1, 2, 3, 4};            //Return 1

        int low = 0;
        int high = arr.length - 1;
        int ans = arr[0];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] <= ans){
                ans = arr[mid];
            }

            if (arr[mid] <= arr[high]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
