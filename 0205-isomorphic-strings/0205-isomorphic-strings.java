class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap <Character,Character> mp1=new HashMap <>();
        HashMap <Character,Character> mp2=new HashMap<>();

        if(s.length()!=t.length()) {
            return false;
        }

        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           char chh = t.charAt(i);

           if(mp1.containsKey(ch) && mp1.get(ch) != chh) {
            return false;
           }
            if(mp2.containsKey(chh) && mp2.get(chh) != ch) {
            return false;
           }
           mp1.put(ch,chh);
           mp2.put(chh,ch);

        }
        return true;

       
    }
}