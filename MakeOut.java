package String1;

public class MakeOut {
	public  static String makeOutWord(String out, String word) {
		  return out.substring(0,2) + word + out.substring(2,4);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeOut makeOutWord=new MakeOut();
		System.out.println(MakeOut.makeOutWord("<<>>", "Yay"));
		System.out.println(MakeOut.makeOutWord("<<>>", "WooHoo"));
		System.out.println(MakeOut.makeOutWord("[[]]", "word"));

	}

}
