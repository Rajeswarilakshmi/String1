package String1;

public class Ntwice {
	public  static String nTwice(String str, int n) {
		  return str.substring(0,n) +
				  str.substring(str.length()- n, str.length());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ntwice nTwice=new Ntwice();
		System.out.println(Ntwice.nTwice("Hello",2));
		System.out.println(Ntwice.nTwice("Chocolate",3));
		System.out.println(Ntwice.nTwice("Chocolate",1));
		
		

	}

}
