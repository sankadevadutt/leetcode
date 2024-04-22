// class Solution {
//     private int minSteps = Integer.MAX_VALUE;
//     private List<String> tried = new ArrayList<>();
//     public char returnNext(char digit){
//         int num = (digit-'0');
//         if(num < 9) return (char)(num+1+'0');
//         else return '0';    
//     }

//     public char returnPrev(char digit){
//         int num = (digit-'0');
//         if(num > 0) return (char)(num-1+'0');
//         else return '9';    
//     }

//     // public void helper(String[] deadends, String target, String current, int i, int steps){
//     //     if(tried.contains(current)) return;
//     //     if(current.equals(target)){
//     //         minSteps = Math.min(minSteps, steps);
//     //         return;
//     //     }
//     //     tried.add(current);
//     //     String prev="",next="";
//     //     if(i!=3){
//     //         prev = current.substring(0,i)+returnPrev(current.charAt(i))+current.substring(i+1);
//     //         next = current.substring(0,i)+returnNext(current.charAt(i))+current.substring(i+1);
//     //     }else{
//     //         prev = current.substring(0,i)+returnPrev(current.charAt(i));
//     //         next = current.substring(0,i)+returnNext(current.charAt(i));
//     //     }
//     //     System.out.println(prev+" "+current+" "+next);
//     //     helper(deadends, target, prev, i, steps+1);
//     //     helper(deadends, target, prev, i+1, steps+1);
//     //     helper(deadends, target, next, i, steps+1);
//     //     helper(deadends, target, next, i+1, steps+1);
//     //     return;
//     // }

//     public void helper(String[] deadends, String target, String current, int i, int steps){
//     if(tried.contains(current)) return;
//     if(current.equals(target)){
//         minSteps = Math.min(minSteps, steps);
//         return;
//     }
//     tried.add(current);
    
//     for (int j = 0; j < 4; j++) {
//         String prev = current.substring(0, j) + (char)(current.charAt(j) == '0' ? '9' : current.charAt(j) - 1) + current.substring(j + 1);
//         String next = current.substring(0, j) + (char)(current.charAt(j) == '9' ? '0' : current.charAt(j) + 1) + current.substring(j + 1);
        
//         helper(deadends, target, prev, j, steps + 1);
//         helper(deadends, target, next, j, steps + 1);
//     }
// }

    
//     public int openLock(String[] deadends, String target) {
//         String start = "0000";
//         for(String deadend : deadends){
//             tried.add(deadend);
//         }
//         if(tried.contains("0000")) return -1;
//         helper(deadends, target, "0000", 0, 0);
//         if(minSteps == Integer.MAX_VALUE) return -1;
//         return minSteps;
//     }
// }

class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        visited.add("0000");
        int steps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                if (deadSet.contains(current)) continue;
                if (current.equals(target)) return steps;

                for (int j = 0; j < 4; j++) {
                    for (int k = -1; k <= 1; k += 2) {
                        char[] chars = current.toCharArray();
                        chars[j] = (char)(((chars[j] - '0') + k + 10) % 10 + '0');
                        String next = new String(chars);
                        if (!visited.contains(next)) {
                            queue.offer(next);
                            visited.add(next);
                        }
                    }
                }
            }
            steps++;
        }

        return -1;
    }
}