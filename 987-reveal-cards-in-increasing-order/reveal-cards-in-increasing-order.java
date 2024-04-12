class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        
        int n = deck.length;
        int orderedDeck[] = new int[n];

        boolean skip = false;

        int i = 0, j = 0;

        Arrays.sort(deck);
        
        while(i < n){
            
            if(orderedDeck[j] == 0){
            
                if(!skip){
                    orderedDeck[j] = deck[i];
                    i++;
                }
            
                skip = !skip;
            
            }
            j = (j+1)%n;
        }
        return orderedDeck;

        
    }
}