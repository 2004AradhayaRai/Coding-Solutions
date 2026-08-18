class Solution {
    public int majorityElement(int[] nums) {

        int major=0;
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){
             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

             if(mp.get(nums[i])>n/2){
                major=nums[i];
             }

        }
        return major;
    }
}