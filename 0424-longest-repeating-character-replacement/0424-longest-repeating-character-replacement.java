class Solution {
    public int characterReplacement(String s, int k) {
        int []freq = new int [26];
        int i=0;
        int windowSize=0;
        int maxFreq=0;

        for(int j=0;j<s.length();j++) {
            freq[s.charAt(j)-'A'] ++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(j)-'A']);

            int len = j-i+1;

            if(len - maxFreq > k ){
                freq[s.charAt(i)-'A'] --;
                i++;
            }
            len = j-i+1;
            windowSize = Math.max(windowSize,len) ;

        }
        return windowSize;
    }
}