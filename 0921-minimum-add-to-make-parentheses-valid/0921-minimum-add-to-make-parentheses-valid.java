class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack <Character> st = new Stack <>();
        int cnt = 0;
        int j=0;

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(') {
                st.push(s.charAt(i));

            }
            else if (!st.isEmpty() && st.peek()=='(' && s.charAt(i) == ')' ) {
                st.pop();
            }
            else if(s.charAt(i)==')') {
                j++;
            }
        }

        while(!st.isEmpty()) {
            st.pop();
            cnt++;
        }
        if (j>=cnt || cnt>=j) {
            return j+cnt;
        }

        else if(j>0) {
            return j;
        }
        return cnt;

        

    }
}