class Solution {
    public int lengthOfLastWord(String s) {
        String []words = s.trim().split(" ");
        int n=words.length;
        int len = words[n-1].length();
        return len;
    }
}