class Solution {
    public int maximumSum(int[] nums) {
        HashMap <Integer,Integer> mp= new HashMap <>();
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++) {
            int dSum = digitSum(nums[j]);
            if(mp.containsKey(dSum)) {
                sum=nums[j]+mp.get(dSum);
                maxSum=Math.max(sum,maxSum);
            }
            mp.put(dSum,Math.max(mp.getOrDefault(dSum,0),nums[j]));
        }
        if(maxSum==Integer.MIN_VALUE) {
            return -1;
        }
        return maxSum;
    }
    public int digitSum(int num) {
        int sum=0;
        while(num>0) {
            int digit = num % 10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }
}