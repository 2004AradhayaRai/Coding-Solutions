class Solution {
    public int deleteAndEarn(int[] nums) {
        int n=0;
        for(int num:nums){
           n=Math.max(n,num);
        }
        int sum[]=new int[n+1];
        for(int num:nums){
            sum[num]+=num;
        }
        int []dp=new int[n+1];
        dp[0]=sum[0];
        if(n>=1){
            dp[1]=Math.max(sum[0],sum[1]);
        }
        for(int i=2;i<=n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+sum[i]);
        }
        return dp[n];

    }
}