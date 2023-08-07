class Solution {
    public String intToRoman(int num) {
        
        String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundreads[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thousands[] = {"","M","MM","MMM"};

        StringBuilder sb = new StringBuilder();
        while(num>0){
            if(num>=1000){
                int ind = num/1000;
                sb.append(thousands[ind]);
                num %= 1000;
            }else if(num>=100){
                int ind = num/100;
                sb.append(hundreads[ind]);
                num %= 100;

            }else if(num>=10){
                int ind = num/10;
                sb.append(tens[ind]);
                num %= 10;
            }else{
                sb.append(ones[num]);
                num = 0;
            }
        }
        return sb.toString();


    }
}