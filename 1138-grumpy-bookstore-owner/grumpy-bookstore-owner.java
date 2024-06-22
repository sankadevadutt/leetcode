class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        boolean isGrumpy = false;
        int left = 0, right = customers.length;
        int values = Integer.MIN_VALUE;
        int count = 0;
        int start = -1;
        while(left < right){
            isGrumpy = false;
            int k = left;
            int value = 0;
            count = 0;
            while(k < right && count < minutes){
                if(grumpy[k] == 1){
                    isGrumpy = true;
                    value += customers[k];
                }
                count++;
                k++;
            }
            if(isGrumpy && value > values){
                values = value;
                start = left;
            }
            if(k == right) break;
            count -= grumpy[left] == 1 ?1:0;
            left++;
        }
        
        if(values != Integer.MIN_VALUE) satisfied = values;
        for(int i = 0;i<customers.length;i++){
            if(grumpy[i] == 0) satisfied+= customers[i];
        }
        return satisfied;

    }
}