class Solution {
    public int singleNumber(int[] nums) {

        int n=nums.length;
        int singleNum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){

            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);

        }
        for(int i=0;i<n;i++){
            if(mp.get(nums[i])==1){
                singleNum=nums[i];
            }
        }
        return singleNum;
    }
}