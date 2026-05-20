class logical{

public boolean andop(boolean x,boolean y){
	return x&&y;

}
boolean orop(boolean x,boolean y){
return x||y;


}

boolean notop(boolean x,boolean y){
	return (!x);

}

static boolean and(){
	return true &&true;



}

static boolean or(){
	return false || false;


}
static boolean not(){
	return !(false);

}


	public static void main(String args[]){
	boolean a=true,b=false;
	logical l1=new logical();
	System.out.println(l1.andop(a,b));
	System.out.println(l1.orop(a,b));
	System.out.println(l1.notop(a,b));
	System.out.println(!not());
	System.out.println(and());
	System.out.println(or());
	



	}



}