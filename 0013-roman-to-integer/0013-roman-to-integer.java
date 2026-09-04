class Solution {
    public int romanToInt(String s) {
        int num=0;
        int n=s.length();
        HashMap <Character,Integer> mp =new HashMap <>();

        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        for(int i=0;i<n-1;i++){
            if(mp.get(s.charAt(i)) < mp.get(s.charAt(i+1))) {
                num = num- mp.get(s.charAt(i));
            }
            else {
                num = num +mp.get(s.charAt(i));
            }
        }
        return num + mp.get(s.charAt(s.length()-1));
    }
}