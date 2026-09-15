class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashSet <Character> set1=new HashSet<>();
        HashSet <String> set2=new HashSet<>();

        HashMap <Character,String> map = new HashMap <>();

        for(char ch:pattern.toCharArray()) {
            set1.add(ch);
        }

        String []words = s.split(" ");
        for(String word:words) {
            
            set2.add(word);
        }

        if(set1.size()!=set2.size()) {
            return false;
        }
        if(pattern.length() != words.length) {
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word = words[i];

            if(map.containsKey(ch)) {
                if(!map.get(ch).equals(word)) {
                    return false;
                } 

            } 
            else {
                map.put(ch,word);
            }

        }
        return true;
        

    }
}