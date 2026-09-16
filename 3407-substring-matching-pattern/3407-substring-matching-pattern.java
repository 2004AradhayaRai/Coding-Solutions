class Solution {
    public boolean hasMatch(String s, String p) {
        
        int star = p.indexOf('*');
        String first = p.substring(0,star);
        String second = p.substring(star+1);

        int firstIdx = s.indexOf(first);

        if(firstIdx==-1) {
            return false;
        }

        int secIdx = s.indexOf(second,firstIdx+first.length());

        if(secIdx==-1) {
            return false;
        }
        return true;
    }
}