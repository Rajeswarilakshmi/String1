package String1;

public class Hello {
	public  static String helloName(String name) {
	  return "Hello " + name + "!";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello helloName=new Hello();
		System.out.println(Hello.helloName("Bob"));
		System.out.println(Hello.helloName("Alice"));
		System.out.println(Hello.helloName("X"));

	}

}
