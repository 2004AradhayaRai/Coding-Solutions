class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt=0;
        int n = nums.length;
        int sum[]=new int[n+1];
        sum[0]=0;

        for(int i=1;i<=n;i++){
            sum[i]=sum[i-1]+nums[i-1];
        }
        for(int i=0;i<sum.length;i++){
            for(int j=i+1;j<sum.length;j++) {
                if(sum[j]-sum[i]==k) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}