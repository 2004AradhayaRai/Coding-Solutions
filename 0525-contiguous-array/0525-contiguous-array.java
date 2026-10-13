class Solution {
    public int findMaxLength(int[] nums) {
        int sum=0;
        int len=0;

        HashMap <Integer,Integer> mp =new HashMap <>();
        mp.put(0,-1);

        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0) {
                sum = sum - 1;
            }
            else{
                sum = sum + 1;
            }
            if(mp.containsKey(sum)) {
                len=Math.max(len,i-mp.get(sum));
            }
            else{
                mp.put(sum,i);
            }
            
        }
        return len;
    }
}