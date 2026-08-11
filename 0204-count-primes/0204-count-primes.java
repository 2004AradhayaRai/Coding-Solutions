class Solution {
    public int countPrimes(int n) {
       if(n==0 || n==1) return 0;
       int cnt=0;
       boolean []prime=new boolean[n];
       for(int i=2;i<n;i++){
        prime[i]=true;
       }
       for(int i=2;i<n;i++){
        if(prime[i]){
            cnt++;
            for(int j=i*2;j<n;j=j+i){
                prime[j]=false;
            }
        }
       }
       return cnt;
        
    }
}