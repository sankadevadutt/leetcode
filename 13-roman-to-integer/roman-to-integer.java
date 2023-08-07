class Solution {
    public int romanToInt(String s) {
        int ans = 0;

        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundreads[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thousands[] = {"","M","MM","MMM"};

        while(s.length()>0){
            for(int i = 3;i>=0;i--){
                int ind = s.indexOf(thousands[i]);
                if(ind==0){
                    ans += 1000*i;
                    s = s.substring(thousands[i].length());
                }
            }
            System.out.println(s+" "+ans);
            for(int i = 9;i>=0;i--){
                int ind = s.indexOf(hundreads[i]);
                if(ind==0){
                    ans += 100*i;
                    s = s.substring(hundreads[i].length());
                }
            }
            System.out.println(s+" "+ans);
            for(int i = 9;i>=0;i--){
                int ind = s.indexOf(tens[i]);
                if(ind==0){
                    ans += 10*i;
                    s = s.substring(tens[i].length());
                }
            }
            System.out.println(s+" "+ans);
            for(int i = 9;i>=0;i--){
                int ind = s.indexOf(ones[i]);
                if(ind==0){
                    ans+=i;
                    s = s.substring(ones[i].length());
                }
            }
        }

        return ans;
    }
}