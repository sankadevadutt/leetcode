class Solution {
    public boolean isPossible(int[] position, int m, int dist){
        int x = position[0];
        int stored = 1;
        for(int i : position){
            if(x+dist <= i){
                x = i;
                stored++;
            }
            if(stored == m) return true;
        }
        return stored == m;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int len = position.length;
        int low = 1;
        int high = (int)Math.ceil(position[len-1]/(m-1.0));
        int current = 0;
        while(low <= high){
            int mid = low + (high - low)/2 ;
            if(isPossible(position, m, mid)){
                current = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return current;
    }
}