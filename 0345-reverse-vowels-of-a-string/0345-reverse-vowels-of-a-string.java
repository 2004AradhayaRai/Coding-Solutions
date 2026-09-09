class Solution {
    public String reverseVowels(String s) {

        int left = 0;
        int right = s.length()-1;
        char ch [] = s.toCharArray();
        while(left < right) {

            while(left<right && !vowel(ch[left])) {
                left ++;
            } 

            while (left<right && !vowel(ch[right])) {
                right -- ;
            }

            char tmp = ch[left];
            ch[left] = ch[right];
            ch[right] = tmp;
            left++;
            right--;

        }
         return new String(ch);
    }
    public boolean vowel (char c) {
        if( c=='a' || c=='e'||c=='i'|| c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
            return true;
        }
        return false;
    }
}