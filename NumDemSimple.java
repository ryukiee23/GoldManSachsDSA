package GoldManSachsQuestions;

public class NumDemSimple {
    public static int gcd(int a,int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    public  static int[] solve(int num1,int dem1,int num2,int dem2){
        int num = num1*dem2 + num2*dem1;
        int dem = dem1*dem2;

        int div = gcd(num,dem);
        num = num/div;
        dem = dem/div;

        return new int[]{num,dem};
    }
    public static void main(String[] args){
        int num1 = 1,dem1 = 2;
        int num2 = 3,dem2 = 2;
        int[] arr = solve(num1,dem1,num2,dem2);

        System.out.println(arr[0]+"/"+arr[1]);
    }
}
