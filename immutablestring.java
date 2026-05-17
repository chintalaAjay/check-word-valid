public class immutablestring {
    public static void main(String[] args) {
        String str="hello";
        str.concat("world");
        System.out.println(str);
        StringBuilder sb=new StringBuilder("hello");
        sb.append("world");
        System.out.println(sb);
        //corect way to append string
        String str1="hello";    
        str1=str1.concat("world");
        System.out.println(str1);
    }
}
