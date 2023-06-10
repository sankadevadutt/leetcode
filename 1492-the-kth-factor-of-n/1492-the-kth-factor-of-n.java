class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> lt = new ArrayList<>();
        int ind = 0;
        for(int i = 1 ; i <= Math.sqrt(n) ; i++){
            
            if( n%i == 0 ){
                if( i * i == n ) lt.add(ind,i);
                else{
                    lt.add(ind,n/i);
                    lt.add(lt.size()-ind-1,i);
                }
                ind++;
            }
        }
        if(lt.size() < k) return -1;
        else return lt.get(k-1);
        
    }
}