package String1;

public class MiddleThree {
	public  static String middleThree(String str) {
		  int len = str.length() / 2;
		  return str.substring(len-1,len+2);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleThree middleThere=new MiddleThree();
		System.out.println(MiddleThree.middleThree("Candy"));
		System.out.println(MiddleThree.middleThree("and"));
		System.out.println(MiddleThree.middleThree("solving"));

	}

}
