class Solution {
    public int[] applyOperations(int[] nums) {
        
        for(int i=0;i<nums.length-1;i++) {
            if(nums[i]==nums[i+1]) {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int cnt=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                nums[cnt]=nums[i];
                cnt++;
            }
        }
        while(cnt<nums.length) {
            nums[cnt]=0;
            cnt++;
        }
        return nums;
    }
}