class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();

        HashMap <Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            
        }
        for(int i=1;i<=nums.length;i++){
            if(!mp.containsKey(i)){
                list.add(i);
            }
        }
        return list;

    }
}