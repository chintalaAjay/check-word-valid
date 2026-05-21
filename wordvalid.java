class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(char x:s.toCharArray()){
            if(x!='c'){
                stack.push(x);
            }
            else{
                if(stack.size()>=2){
                    char pop1=stack.pop();
                    char pop2=stack.pop();
                    if(pop1!='b' || pop2!='a'){
                        return false;
                    }
                    
                }
            }
        }
        return stack.isEmpty();
        
        
    }
}