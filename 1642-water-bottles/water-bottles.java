class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrinkable = numBottles;
        int emptyBottles = 0;
        int ans = 0;
        ans += totalDrinkable;
            emptyBottles += totalDrinkable;
            totalDrinkable = emptyBottles/numExchange;
            emptyBottles = emptyBottles%numExchange;
        while(totalDrinkable > 0 ){
            ans += totalDrinkable;
            emptyBottles += totalDrinkable;
            totalDrinkable = emptyBottles/numExchange;
            emptyBottles = emptyBottles%numExchange;
        }
        return ans;
    }
}