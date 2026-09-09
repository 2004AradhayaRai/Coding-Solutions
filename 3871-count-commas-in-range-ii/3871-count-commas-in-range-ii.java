class Solution {
    public long countCommas(long n) {
        if (n<1000) {
            return 0;
        }

        long comma=0;
        long digit = 1000;

        while(digit <= n){
            comma = comma + (n-digit+1);
            digit = digit*1000;
        }
        return comma;
    }
}