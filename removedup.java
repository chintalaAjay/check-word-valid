import java.util.*;
public class removedup {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        String str="geeksforgeeks";
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            char x=str.charAt(i);
            map.put(x,map.getOrDefault(x,0 )+1);
        }
        for(char x:map.keySet()){
            if(map.get(x)!=1){
                System.out.println(x+" : "+map.get(x));
            }
        }
    }
    
}
