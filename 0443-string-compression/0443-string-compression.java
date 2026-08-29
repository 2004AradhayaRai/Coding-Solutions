class Solution {
    public int compress(char[] chars) {
        int n=chars.length;

        int idx=0;
        int i=0;
        while(i<n){
            char curr= chars[i];
            int cnt=0;

            //find cnt of duplicate 
            while(i<n && chars[i]==curr){
                cnt++;
                i++;
            }

            // do the assign work
            chars[idx] = curr;
            idx++;

            if(cnt>1){
                String cnt_str = String.valueOf(cnt);
                for(char ch:cnt_str.toCharArray()){
                    chars[idx]=ch;
                    idx++;
                }
            }
        }
        return idx;

    }
}