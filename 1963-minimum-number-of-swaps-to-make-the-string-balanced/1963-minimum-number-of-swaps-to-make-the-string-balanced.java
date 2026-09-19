class Solution {
    public int minSwaps(String s) {
       int cnt=0;
       Stack <Character> st = new Stack <>();

       for(int i=0;i<s.length();i++) {
        if(s.charAt(i)=='[') {
            st.push(s.charAt(i));
        }
        else if(!st.isEmpty() && st.peek()=='[' && s.charAt(i)==']') {
            st.pop();
        }
        else if(s.charAt(i)==']') {
            cnt++;
        }
       } 
       return (cnt+1) / 2;
    }
}