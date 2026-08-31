class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.getOrDefault(nums[i],0)==2){
                list.add(nums[i]);
            }
        }

        
        return list;

    }
}