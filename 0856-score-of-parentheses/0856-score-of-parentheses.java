class Solution {
    public int scoreOfParentheses(String s) {
        Stack <Integer> st = new Stack <>();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') {
                st.push(cnt);
                cnt=0;
            }
            else {
                if (cnt==0) {
                    cnt=1;
                }
                else {
                    cnt=2*cnt;
                }
                cnt=st.pop() + cnt;
            }
        }
        return cnt;
    }
}