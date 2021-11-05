package String1;

public class FirstHalf {
	public  static String firstHalf(String str) {
		  int half = str.length() / 2;
		  return str.substring(0, half);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstHalf firstHalf=new FirstHalf();
		System.out.println(FirstHalf.firstHalf("WooHoo"));
		System.out.println(FirstHalf.firstHalf("HelloThere") );
		System.out.println(FirstHalf.firstHalf("abcdef"));

	}

}
