package GoldManSachsQuestions;

import java.util.Arrays;

public class ClimbingStairs {
        public static int solve(int n,int dp[],int idx){
            if(idx > n)
                return 0;
            if(idx == n)
                return 1;
            if(dp[idx] != -1) return dp[idx];

            int oneStep = solve(n,dp,idx+1);
            int twoStep = solve(n,dp,idx+2);

            return dp[idx] = oneStep+twoStep;

        }
        public static void main(String args[]) {
            int n = 5;
            int dp[] = new int[n+1];
            Arrays.fill(dp,-1);
            System.out.println(solve(n,dp,0));
        }
    }

