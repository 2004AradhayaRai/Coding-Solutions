class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<Character> st = new Stack<>();
        Stack<Integer> cnt = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {

            if(!st.isEmpty() && st.peek() == s.charAt(i)) {
                int count = cnt.pop();
                count++;
                cnt.push(count);
            }
            else {
                st.push(s.charAt(i));
                cnt.push(1);
            }

            if(cnt.peek() == k) {
                cnt.pop();
                st.pop();
            }
        }

        while(!st.isEmpty()) {
            char ch = st.pop();
            int count = cnt.pop();

            while(count > 0) {
                sb.append(ch);
                count--;
            }
        }

        return sb.reverse().toString();
    }
}