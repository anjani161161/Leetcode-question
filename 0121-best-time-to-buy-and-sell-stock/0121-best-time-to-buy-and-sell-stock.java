class Solution {
    static int n;
     static Integer[][] dp;
    public int maxProfit(int[] prices) {
        n = prices.length;
        dp = new Integer[n][3];
        return func(0, 0, prices);
    }
    static int func(int i, int t, int[] nums) {
        if (i >= n || t == 2)  return 0;

        if (dp[i][t] != null)  return dp[i][t];

        int a=0, b=0;

        if (t == 0) {   
           a = -nums[i] + func(i + 1, 1, nums);
           b = func(i + 1, t, nums);
        } 
        if(t==1){       
           a = nums[i] + func(i + 1, 2, nums);
           b = func(i + 1, t, nums);
        }
        return dp[i][t]= Math.max(a, b);
    }
}

