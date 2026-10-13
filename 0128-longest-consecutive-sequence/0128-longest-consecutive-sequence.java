class Solution {
    public int longestConsecutive(int[] nums) {
        int len1=0;
        HashSet <Integer> set = new HashSet<>();
        for(int n:nums) {
            set.add(n);
        }
        for(int n:set){
            if(!set.contains(n-1)) {
                int len2 = 1; 
                while(set.contains(n+len2)) {
                    len2++;
                }
                len1=Math.max(len1,len2);
            }
            

        }
        return len1;
    }
}