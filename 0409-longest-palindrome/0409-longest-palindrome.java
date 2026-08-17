class Solution {
    public int longestPalindrome(String s) {

        int n=s.length();
        int odd=0;
       
        HashMap <Character,Integer> mp = new HashMap<>();
        for(char ch:s.toCharArray()){

            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(mp.get(ch) %2 ==0){
                odd--;
            }
            else{
                odd++;
            }
        }
        if(odd>1){
            return n-odd+1;
        }
        return n;

    }
}