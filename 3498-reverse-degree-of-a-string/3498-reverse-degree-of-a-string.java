class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int []freq=new int[26];
        for(int i=0;i<s.length();i++) {

            int j='z'-s.charAt(i)+1;
            sum=sum+(j*(i+1));
        }
        return sum;
    }
}