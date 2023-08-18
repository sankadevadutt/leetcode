class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        
        Map<Integer,Integer> mp = new HashMap<>();
        List<List<Integer>> lt = new ArrayList<>();
        Map<Integer, Set<Integer>> mpa = new HashMap<>();
        for( int i = 0 ; i < roads.length ; i++ ){
        
            int x = roads[i][0];
            int y = roads[i][1];

            mp.put(x,mp.getOrDefault(x,0)+1);
            mp.put(y,mp.getOrDefault(y,0)+1);

            if(!mpa.containsKey(x)) mpa.put(x, new HashSet<>());
            if(!mpa.containsKey(y)) mpa.put(y, new HashSet<>());

            mpa.get(x).add(y);
            mpa.get(y).add(x);
            
        
        }

        int max = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = i+1; j<n; j++){
                if(i == j) continue;
                if(!mp.containsKey(i) || !mp.containsKey(j)) continue;
                
                int count = mp.get(i)+mp.get(j);
                if(mpa.get(i).contains(j)) count -=1;

                max = Math.max(max, count);
            }
        }

        return max;
    }
}