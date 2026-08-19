class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans=n*2;

        HashMap <Integer, boolean[]> map=new HashMap<>();

        for(int s[]:reservedSeats) {

            int r=s[0];
            int c=s[1];

            if(!map.containsKey(r)){
            map.put(r,new boolean[11]);
        }
        map.get(r)[c]=true;

        }
        for(int r:map.keySet()){

            boolean [] vis=map.get(r);

            boolean Fsec=true;
            boolean Ssec=true;
            boolean Tsec=true;

            for(int i=2;i<=5;i++){
                if(vis[i]){
                    Fsec=false;
                    break;
                }
            }
            for(int i=4;i<=7;i++){
                if(vis[i]){
                    Ssec=false;
                    break;
                }
            }
            for(int i=6;i<=9;i++){
                if(vis[i]){
                    Tsec=false;
                    break;
                }
            }

            if(Fsec && Tsec){

            }
            else if(Fsec||Ssec||Tsec){
                ans=ans-1;
            }
            else{
                ans=ans-2;
            }

        }
        return ans;
        
    }
}