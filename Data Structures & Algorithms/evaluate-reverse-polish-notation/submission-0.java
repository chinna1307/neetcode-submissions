class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> result = new Stack<>();

        for(String s : tokens) {
            if(s.equals("+")) {
                result.push(result.pop() + result.pop());
            } else if(s.equals("*")) {
                result.push(result.pop() * result.pop());
            } else if(s.equals("-")) {
                int a = result.pop();
                int b = result.pop();
                result.push(b - a);
            } else if(s.equals("/")) {
                int a = result.pop();
                int b = result.pop();
                result.push(b / a);
            } else {
                result.push(Integer.parseInt(s));
            }
        }
        return result.pop();
    }
}
