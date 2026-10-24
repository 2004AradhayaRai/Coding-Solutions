class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        //k=k%n;
        double sum=0;
        double maxAvg=0;
        double avg=0;
        for(int i=0;i<k;i++) {
            sum=sum+nums[i];
        }
        maxAvg=sum/k;
        for(int i=k;i<n;i++) {
            sum = sum+nums[i]-nums[i-k];
            avg=sum/k;
            maxAvg=Math.max(avg,maxAvg);
        }
        return maxAvg;
    }
}