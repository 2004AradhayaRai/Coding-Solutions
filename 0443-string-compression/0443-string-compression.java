class Solution {
    public int compress(char[] chars) {
        
        int i=0;
        int idx=0;

        int n=chars.length;
        while(i<n) {
            char ch=chars[i];
            int cnt=0;
            
            while(i<n && chars[i]==ch) {
                cnt++;
                i++;

            }
            chars[idx] = ch;
            idx++;

            if(cnt > 1) {
                String cntStr = String.valueOf(cnt) ; 
                for (char c : cntStr.toCharArray()) {
                    chars[idx] = c;
                    idx++;
                }
            }
        }
        return idx;
    }
}