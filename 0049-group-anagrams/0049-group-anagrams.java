class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,ArrayList <String>> mp=new HashMap <>();
        
        for(String ch : strs) {
            char [] a = ch.toCharArray();
            Arrays.sort(a);

            String b = new String(a);
            if(!mp.containsKey(b)) {
                mp.put(b,new ArrayList<>());
            }
            mp.get(b).add(ch);
        }
        return new ArrayList<>(mp.values());


    }
}