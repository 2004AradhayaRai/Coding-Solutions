class Solution {

    int t[];
    public int numDecodings(String s) {

        t=new int [101];
       Arrays.fill(t,-1);
       int n=s.length();
       return solve(0,s,n);
    }

    public int solve(int i,String s,int n) {

        if(t[i]!=-1) {
            return t[i];
        }

        if(i==n) {
            return t[i]=1; // one valid output
        }

        if(s.charAt(i)=='0') {
            return t[i]=0;
        }

        int res = solve(i+1,s,n);

        if(i+1 <n) {
            if(s.charAt(i)=='1' || (s.charAt(i)=='2' && s.charAt(i+1) <= '6')){
             res += solve(i+2,s,n);
        }
        }
        
        
        return t[i]=res;


    }
}