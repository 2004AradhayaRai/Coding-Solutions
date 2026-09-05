class Solution {
    public String frequencySort(String s) {

        int []freq = new int [256];
        StringBuilder sb =new StringBuilder();

        for (char ch :s.toCharArray()) {
            freq [ch ]++;
        } 

        int i =s.length();

        while(i>0) {
            int maxFreq = 0;
            int maxIdx = -1; 

            for(int j=0;j<256;j++) {
                if(freq[j]>maxFreq) {
                    maxFreq = freq[j];
                    maxIdx =j;
                }
            }

            if(maxIdx == -1) {
                break;
            }

            char ch = (char) (maxIdx);
            for(int j=0;j<maxFreq;j++) {
                sb.append(ch);
            }

            i = i - maxFreq;
            freq[maxIdx] = 0;
        }
        return sb.toString();


    }
}