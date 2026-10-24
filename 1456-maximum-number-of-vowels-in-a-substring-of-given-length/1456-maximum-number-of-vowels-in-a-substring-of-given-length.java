class Solution {
    public int maxVowels(String s, int k) {
        int len=0;
        int cnt=0;

        for(int i=0;i<k;i++) {
            if(vowel(s.charAt(i))) {
                cnt++;
            }
        }
        len=cnt;

        for(int i=k;i<s.length();i++) {
            if(vowel(s.charAt(i-k))) {
                cnt--;
            }
            if(vowel(s.charAt(i))) {
                cnt++;
            }
            len=Math.max(len,cnt);
        }
        return len;
    }
    public boolean vowel(char s) {
        if(s=='a' || s=='e' || s=='i'||s=='o'||s=='u') {
            return true;
        }
        return false;
    }
}