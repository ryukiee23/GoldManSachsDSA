package GoldManSachsQuestions;

public class SmallestMissingNumber {
    public static void main(String args[]){
//        Given a sorted array of non-negative integers of size n,
//        return the smallest missing integer.
//
//                Examples:
        int[] arr2 = {1, 2, 3, 4};    // Return 0

//        int[] arr2 = {0, 1, 3, 4};    // Return 2
        int ans = -1;

        for(int i=0;i<arr2.length;i++){
            if(i != arr2[i]){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
