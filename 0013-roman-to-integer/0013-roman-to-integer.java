class Solution {
    public int romanToInt(String s) {
        String[] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens =  {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thou = {"","M","MM","MMM"};
        int num = 0;
        
        for(int i =thou.length-1;i>0;i--)
        {
            int ind = s.indexOf(thou[i]); 
            if(ind == 0){
                int len = thou[i].length();
                num += (1000*i);
                s = s.substring(len);
            }
        }
        
        for(int i = hundreds.length-1;i>0;i--)
        {
            int ind = s.indexOf(hundreds[i]); 
            if(ind == 0){
                int len = hundreds[i].length();
                num += (100*i);
                s = s.substring(len);
            }
        }
        
        for(int i = tens.length-1;i>0;i--)
        {
            int ind = s.indexOf(tens[i]); 
            if(ind == 0){
                int len = tens[i].length();
                num += (10*i);
                s = s.substring(len);
            }
        }
        
        for(int i = units.length-1;i>0;i--)
        {
            int ind = s.indexOf(units[i]); 
            if(ind == 0){
                int len = units[i].length();
                num += i;
                s = s.substring(len);
            }
        }
        
        return num;
        
    }
}