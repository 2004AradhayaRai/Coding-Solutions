class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();

        char []left=strs[0].toCharArray();
        char []right=strs[strs.length-1].toCharArray();

       for(int i=0;i<left.length;i++){
        if(left[i]!=right[i]) {
            break;
        }
        else{
            sb.append(left[i]);
        }
        
        
       }
        return sb.toString();
    }
}