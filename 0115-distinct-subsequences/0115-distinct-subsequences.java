class Solution {
    int [][]dp;
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
        dp=new int[m][n];
        for(int []i:dp){
            Arrays.fill(i,-1);
        }
        return solve(s,t,0,0);
    }
    public int solve(String s, String t,int i,int j){
        int m=s.length();
        int n=t.length();
        if(j==n){
            return 1;
        }
        if(i==m){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j)){
           return dp[i][j]=  solve(s,t,i+1,j+1) + solve(s,t,i+1,j);
        }
        return dp[i][j]= solve(s,t,i+1,j);

    }
}