class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int first=solve(nums,0,n-2);
        int sec=solve(nums,1,n-1);
        return Math.max(first,sec);
    }
    public int solve(int []nums,int start,int end){
        int n=nums.length;
        if(start==end) return nums[start];
        
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start],nums[start+1]);

        for(int i=start+2;i<=end;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[end];
    }
}