class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        int minLen=Integer.MAX_VALUE;
        int sum=0;
        while(j<n) {
            sum = sum+nums[j];
            while(sum>=target) {
                minLen = Math.min(minLen,j-i+1);
                sum = sum-nums[i];
                i++;
            }
            j++;
        }
        if(minLen!=Integer.MAX_VALUE){
            return minLen;
        }
        return 0;
    }
}