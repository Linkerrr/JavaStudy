package test;

public class Test {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		int i = 0;
		i = 1;
		System.out.println(i);
		
		i = 45;
		String str = "ab";
		
		String s1 = str+i;
		System.out.println(s1);
		
		String s2 = 1 + 2 + "hello";
		System.out.println(s2);
		
		String s3 = "hello" + 1 + 2;
		System.out.println(s3);
		
		String s4 = 'a' + 1 + "hello";
		System.out.println(s4);
		
		String s5 = "hello" + 'a' + 1;
		System.out.println(s5);
		
		System.out.println("*" + '\t' + '*');
	}

}
