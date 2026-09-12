class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap <Character,Integer> mp1 = new HashMap <>();
        HashMap <Character,Integer> mp2 = new HashMap <>();

        for(int i=0;i<ransomNote.length();i++) {
            mp1.put(ransomNote.charAt(i),mp1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++) {
            mp2.put(magazine.charAt(i),mp2.getOrDefault(magazine.charAt(i),0)+1);
        }

        for (char ch : mp1.keySet()) {
            if(!mp2.containsKey(ch) || mp1.get(ch)>mp2.get(ch)) {
                return false;
            }
        }
        return true;


    }
}