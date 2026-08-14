class Solution {

    public int maximumLengthSubstring(String s) {

        int n=s.length();
        HashMap <Character,Integer> mp=new HashMap<>();
        int i=0;
        int cnt=0;

        for(int j=0;j<n;j++){

            char c=s.charAt(j);
            mp.put(c, mp.getOrDefault(c,0)+1);
            while(mp.get(c)>2){
                char left = s.charAt(i);
                mp.put(left,mp.get(left)-1);
                i++;
            }
            cnt=Math.max(cnt,j-i+1);
        }
        return cnt;
        

    }
}