class Solution {
    public int countLargestGroup(int n) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        int max=0;
        int cnt=0;

        for(int i=1;i<=n;i++) {
            int dSum = digitSum(i);
            mp.put(dSum,mp.getOrDefault(dSum,0)+1);
            max=Math.max(max,mp.get(dSum));
        }
        for (int val:mp.values()) {
            if(val==max) {
                cnt++;
            }
        }
        return cnt;
    } 
    public int digitSum(int num) {
        int sum=0;
        while(num>0) {
            int digit = num % 10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }
}