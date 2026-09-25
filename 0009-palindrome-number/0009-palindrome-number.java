class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        int num = 0;
        if(x<0) {
            return false;
        }
        while(x > 0) {
            int digit = x % 10;
            num = num * 10 + digit;
            x = x/10;
        }
        return num == copy;
    }
}