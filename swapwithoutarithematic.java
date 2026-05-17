public class swapwithoutarithematic {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("Before swapping: a="+a+" b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping: a="+a+" b="+b);
        //even or add without using modulus operator
        int num=15;
        String res=(num&1)==0?"Even":"Odd";
        System.out.println(num+" is "+res);
        //bitwisenot operator
        int x=5;
        System.out.println("Bitwise NOT of "+x+" is "+(~x));
    }
}
