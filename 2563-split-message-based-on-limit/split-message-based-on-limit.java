class Solution {
    public String[] splitMessage(String message, int limit) {

        List<String> lt = new ArrayList<>();
        String b ;
        int k = 1;
        int ind = 0;
        StringBuilder sb = new StringBuilder();
        int len = message.length();
        int k2 = 1;
        while(ind<len){
            if(k/10>=k2){
                ind = 0;
                lt = new ArrayList<>();
                k2 *= 10;
                k = 1;
            }
            b = "<"+k+"/"+k2+">";
            int bLen = b.length();
            int rmng = limit-bLen;
            sb = new StringBuilder();
            if(rmng <= 0) return (new String[0]);
            while(ind<len && rmng-->0){
                sb.append(message.charAt(ind));
                ind++;
            }
            sb.append(b);
            k++;
            lt.add(sb.toString());
        }
        
        
        String[] ans = new String[lt.size()];
        k2 = k-1;
        k = 0;
        
        for(String st: lt){
            int i1 = st.indexOf("/");
            String temp = st.substring(0,i1+1)+k2+">";
            ans[k++] = temp;
        }
        
        return ans;


    }
}