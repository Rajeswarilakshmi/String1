package String1;

public class Make {
	public static  String makeAbba(String a, String b) {
		 return a+b+b+a;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Make makeAbba=new Make();
		System.out.println(Make.makeAbba("Hi", "Bye"));
		System.out.println(Make.makeAbba("Yo", "Alice"));
		System.out.println(Make.makeAbba("What", "Up"));
		

	}

}
