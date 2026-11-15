class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack <>();
        for(int i=0;i<tokens.length;i++) {
            if(st.size()>=2 && tokens[i].equals("+")) {
                int tmp1=  st.pop();
                int tmp2=  st.pop();
                st.push(tmp1+tmp2);
            }
            else if((st.size()>=2 && tokens[i].equals("*"))) {
                int tmp1= st.pop();
                int tmp2= st.pop();
                st.push(tmp1*tmp2);
            }
            else if((st.size()>=2 && tokens[i].equals("-"))) {
                int tmp1=  st.pop();
                int tmp2=  st.pop();
                st.push(tmp2-tmp1);
            }
            else if((st.size()>=2 && tokens[i].equals("/"))) {
                int tmp1=  st.pop();
                int tmp2=  st.pop();
                st.push(tmp2/tmp1);
            }
            else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}