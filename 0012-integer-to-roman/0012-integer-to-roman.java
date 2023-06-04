class Solution {
    public String intToRoman(int num) {
        String []units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String []tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String []hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String []thousands = {"","M","MM","MMM"};
        
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            if(num >= 1000){
                int ind = num/1000;
                sb.append(thousands[ind]);
                num%=1000;
            }
            if(num >= 100){
                int ind = num/100;
                sb.append(hundreds[ind]);
                num%=100;
            }
            if(num >= 10){
                int ind = num/10;
                sb.append(tens[ind]);
                num%=10;
            }
            if(num > 0){
                int ind = num;
                sb.append(units[ind]);
                num = 0;
            }
        }
        return sb.toString();
        
    }
}