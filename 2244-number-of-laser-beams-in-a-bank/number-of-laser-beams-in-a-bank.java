class Solution {
    public int cal(String s){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            count += (ch-'0');
        }
        return count;
    }
    public int numberOfBeams(String[] bank) {
        int prevCount = 0;
        int totalbeam = 0;
        for(String s : bank){
            int curCount = cal(s);
            if(curCount == 0) continue;

            totalbeam += (curCount * prevCount);
            prevCount = curCount;
        }
        return totalbeam;
    }
}