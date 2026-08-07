class Solution {
    public int smallestNumber(int n, int t) {

        while(productOfDigit(n) % t != 0){
            n++;
        }
        return n;



    }
    public int productOfDigit(int num){

        int prod=1;
        while(num != 0){
            prod *= num % 10;
            num=num/10;
        }
        return prod;
    }

}