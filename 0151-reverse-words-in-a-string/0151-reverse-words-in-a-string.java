class Solution {
    public String reverseWords(String s) {
        
         StringBuilder sb=new StringBuilder();
        int right=s.length()-1;
        while(right>=0){
             while(right >= 0 && s.charAt(right) == ' '){
            right--;
             }
            if(right < 0){
                break;
            }
            int left=right;
            while(left>=0 && s.charAt(left) != ' '){
                left--;
            }
            sb.append(s.substring(left+1,right+1)).append(' ');
            right=left-1;
        
        }
        return sb.toString().trim();
       
         

        
    }
}