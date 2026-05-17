public class operators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));  
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
        a+=10;
        b+=30;
        b-=10;
        System.out.println("a="+a);
        System.out.println("b="+b);
        /*
         relational / comparison Operators	Name	Example	
==	Equal to	                x == y	
!=	Not equal	                x != y	
>	Greater than	            x > y	
<	Less than	                x < y	
>=	Greater than or equal to	x >= y	
<=	Less than or equal to	    x <= y	

        */
        if(a<b){
            System.out.println("a is less than b");
        }
        else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is equal to b");
        }
        //logical operators

        if(a>0 && b>0){
            System.out.println("both a and b are positive");
        }
         if(a>0 || b>0){
            System.out.println("either a or b is positive");
        }
         if(!(a>0)){
            System.out.println("a is not positive");
        }
    }
}
