class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        String x = "-1";
        for(int i=0; i < tokens.length; i++){
            if(tokens[i].equals("+"))
                x = Integer.toString(Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop()));
            else if(tokens[i].equals("-")){
                String y = stack.pop();
                x = Integer.toString(Integer.parseInt(stack.pop()) - Integer.parseInt(y)); 
            }
            else if(tokens[i].equals("*"))
                x = Integer.toString(Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop()));
            else if(tokens[i].equals("/")){
                String y = stack.pop();
                x = Integer.toString(Integer.parseInt(stack.pop()) / Integer.parseInt(y)); 
            }   
            else
                x = tokens[i];

            stack.push(x);
        }
        return Integer.parseInt(x);
    }
}
