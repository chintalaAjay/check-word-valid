import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        TreeSet<Integer>set=new TreeSet<>();
        for(int x:a){
            set.add(x);
        }
        for(int x:b){
            set.add(x);
        }
        ArrayList<Integer>list=new ArrayList<>(set);
        return list;
        
        
    }
}