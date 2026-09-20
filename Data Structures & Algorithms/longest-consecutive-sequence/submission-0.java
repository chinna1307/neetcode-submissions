class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer,Boolean> visited = new HashMap<>();
        for(int num : nums) {
            visited.put(num, false);
        }
        for(int num : nums){
            int currentLength = 1;
            int nextNum = num + 1;
            while(visited.containsKey(nextNum) && visited.get(nextNum) == false){
                currentLength++;
                visited.put(num,true);
                nextNum++;
            }
            int prevNum = num - 1;
            while(visited.containsKey(prevNum) && visited.get(prevNum) == false){
                currentLength++;
                visited.put(num,true);
                prevNum--;
            }
            longestLength = Math.max(longestLength,currentLength);
        }
        return longestLength;
    }
}
