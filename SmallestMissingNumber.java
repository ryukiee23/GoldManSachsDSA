package GoldManSachsQuestions;

public class SmallestMissingNumber {
    public static void main(String args[]){

        int[] arr2 = {1, 2, 3, 4}; 

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
