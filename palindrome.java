class Solution {
    boolean isPalindrome(String s) {
        // code here
        char arr[]=new char[s.length()];
        int k=s.length()-1;
        for(int i=0;i<=k;i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<=k;i++){
            if(arr[i]!=arr[k]){
                return false;
            }
            k--;
        }
        return true;
        
    }
}