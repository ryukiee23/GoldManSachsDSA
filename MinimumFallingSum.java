package GoldManSachsQuestions;

import java.util.Arrays;

public class MinimumFallingSum {

    public static int solve(int[][] nums, int i, int j, int n, int dp[][]) {
        if (i < 0 || j < 0 || j >= n) return Integer.MAX_VALUE;

        if (i == n - 1) return nums[i][j];

        if (dp[i][j] != -1) return dp[i][j];

        int down = solve(nums, i + 1, j, n, dp);
        int downleft = solve(nums, i + 1, j - 1, n, dp);
        int downright = solve(nums, i + 1, j + 1, n, dp);

        return dp[i][j] = nums[i][j] + Math.min(down, Math.min(downleft, downright));
    }

    public static void main(String args[]){

        int [][] nums = {{2,1,3},{6,5,4},{7,8,9}};
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int dp[][] = new int[n + 1][n + 1];
        for (int a[] : dp) {
            Arrays.fill(a, -1);
        }
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, solve(nums, 0, i, n, dp));
        }
        System.out.println(ans);
    }
}
