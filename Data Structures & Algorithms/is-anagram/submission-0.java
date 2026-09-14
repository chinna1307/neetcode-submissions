class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> set = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            set.put(c,set.getOrDefault(c,0)+1);
        }
        for(int i = 0;i < t.length();i++){
            char c = t.charAt(i);
            if(!set.containsKey(c)) {
                return false;
            }
            set.put(c, set.get(c) -1);

            if(set.get(c) < 0){
                return false;
            }
        }
        return true;
    }
}
