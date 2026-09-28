class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap <Integer,Integer> mp = new HashMap <>();

        // for(int i=0;i<nums.length;i++) {
        //     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1) ;
        //     if(mp.get(nums[i])>1) {
        //         return nums[i];
        //     }
        // }
        //return -1;
        int n=nums.length;
        int low=1;
        int high = n-1;
        while(low<high) {
            int mid=low+(high-low) /2 ;
            int cnt = 0;
            for(int i=0;i<n;i++) {
                if(nums[i]<=mid) {
                    cnt++;
                }
            }
            if(cnt<=mid) {
                low=mid+1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
}