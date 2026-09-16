class Solution {
    public int repeatedStringMatch(String a, String b) {
        String newStr = "";
        int cnt=0;

        while(newStr.length()<b.length() ) {
            newStr = newStr + a ;
            cnt++;


        }
        if(newStr.contains(b)) {
            return cnt;
        }
        newStr = newStr + a;
        cnt++;

        if(newStr.contains(b)) {
            return cnt;
        }

        return -1;
    }
}