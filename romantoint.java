class Solution {
    public int romanToInt(String s) {
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String roman[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int res=0;
        for(int i=0;i<roman.length;i++){
            while(s.indexOf(roman[i])==0){
                res+=values[i];
                s=s.substring(roman[i].length());
            }
        }
        return res;
        
    }
}