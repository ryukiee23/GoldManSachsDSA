package ReferenceList;

public class TrappingRainWater {
        public static int solve(int[] height) {
            int n = height.length;
            int suff[] = new int[n];

            int maxi = Integer.MIN_VALUE;
            int maxi1 = Integer.MIN_VALUE;
            int ans = 0;

            for(int i=n-1;i>=0;i--){
                maxi = Math.max(maxi,height[i]);
                suff[i] = maxi;
            }

            for(int i=0;i<n;i++){
                if(i != 0 || i!= n-1){
                    maxi1 = Math.max(maxi1,height[i]);
                    ans += Math.min(suff[i],maxi1) - height[i];
                }
            }
            return ans;
        }

    public static void main(String[] args) {
    int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(solve(heights));
    }
}
