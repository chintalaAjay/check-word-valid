class Solution {
    public void reverseString(char[] s) {
        char arr[]=s.clone();
        int count=0;
        for(int i=s.length-1;i>=0;i--){
            s[count]=arr[i];
            count++;
        }
        
    }
}