class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }
        int len=0;
        for(int num:set) {
            if(!set.contains(num-1)) {
                int len2=1;
                while(set.contains(num+len2)) {
                    len2++;
                }
                len=Math.max(len,len2);
            }
        }
        return len;

    }
}