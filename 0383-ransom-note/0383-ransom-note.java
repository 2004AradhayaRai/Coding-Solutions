class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap <Character,Integer> mp1= new HashMap<>();
        HashMap <Character,Integer> mp2= new HashMap<>();


        for(char ch:ransomNote.toCharArray()){
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }
        for(char ch:magazine.toCharArray()){
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);
        }
        for(char ch : mp1.keySet()){
            if(!mp2.containsKey(ch) || mp1.get(ch) > mp2.get(ch)){
                return false;
            }
        }
        return true;



    }
}