class Solution {
    public int maxRepOpt1(String text) {

        HashMap <Character,Integer> map = new HashMap <>();

        for(int i=0;i<text.length();i++) {
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        int max=0;
        
        for(int i=0;i<text.length();) {

            char ch = text.charAt(i);
            int j=i;

            while(j<text.length() && text.charAt(j)==ch) {
                j++;
            }

            int len1=j-i;
            max = Math.max(max,Math.min(len1+1,map.get(ch)));
            int k=j+1;

            while(k<text.length() && text.charAt(k)==ch) {
                k++;
            }
            if(j<text.length() && k>j+1) {
                int len2 = k-(j+1);
                max = Math.max(max,Math.min(len1+len2+1,map.get(ch)));

            }
            i=j;

        }
        return max;
    }
}