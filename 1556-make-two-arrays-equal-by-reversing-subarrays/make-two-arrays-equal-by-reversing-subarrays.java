class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length) return false;
        Map<Integer, Integer> mp1 = new HashMap<>();
        for(int i = 0; i < target.length;i++){
            mp1.put(target[i],mp1.getOrDefault(target[i],0)+1);
            mp1.put(arr[i],mp1.getOrDefault(arr[i],0)-1);
        }
        for(int i : mp1.keySet()) if(mp1.get(i)!=0) return false;
        return true;
    }
}