class Solution {

    public int maxSubarrayLength(int[] nums, int k) {
        
        int n=nums.length;

        HashMap <Integer,Integer> hm = new HashMap<>();
        int i=0;
        int cnt=0;

        for(int j=0;j<n;j++){
            hm.put(nums[j],hm.getOrDefault(nums[j],0)+1);
            
            while(hm.get(nums[j])>k){
                hm.put(nums[i],hm.get(nums[i])-1);
                i++;
            }
            cnt=Math.max(cnt,j-i+1);
        }
        
        return cnt;
    }
}