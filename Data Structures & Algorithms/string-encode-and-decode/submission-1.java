class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String str : strs) {
            res.append(str.length());
            res.append("#");
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> li = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i ,j));
            int start = j + 1;
            int end  = start + length;
            li.add(str.substring(start, end));
            i = end;
        }
        return li;
    }
}