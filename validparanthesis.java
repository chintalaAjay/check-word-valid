class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(char x:s.toCharArray()){
            if(x=='(' || x=='{' || x=='['){
                stack.push(x);
            }
            else{
                if(stack.isEmpty()) return false;
                char pop=stack.pop();
                if( (pop=='(' && x!=')') || (pop=='{' && x!='}') || (pop=='[' && x!=']') ){
                    return false;
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;

        
    }
}