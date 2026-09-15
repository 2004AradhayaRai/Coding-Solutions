class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st = new Stack <>();
        StringBuilder sb = new StringBuilder();

         if(s.length()==1 || s.length()==0) {
            return s;
        }

        st.push(s.charAt(0));

       

        for(int i=1;i<s.length();i++) {
            if(st.isEmpty() || s.charAt(i) != st.peek()) {
                st.push(s.charAt(i));
            }
            
            else {
                st.pop();
            }
        }

        while(!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}