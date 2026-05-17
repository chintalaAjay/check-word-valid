public class ternary {
	public static void main(String[] args) {
		int age=19;
		String mar= age>=21?"Eligible for marriage" :"Not Eligible for marriage";
		System.out.println(mar);
		String vote=age>=18?"Eligible for vote":"Not Eligible for vote";
		System.out.println(vote);
		int marks=33;
		String res=marks>=35?"pass":"fail";
		System.out.println(res);
		double amount=198;
		String freedel=amount>=199?"free delivery":"Delivery charges applied";
		System.out.println(freedel);
		int battery=21;
		String low=battery>=21?"Battery ok":"low battery";
		System.out.println(low);
	}
}
