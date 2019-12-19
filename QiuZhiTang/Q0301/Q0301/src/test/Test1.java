package test;

public class Test1 {
	public static void main(String[] args) {
		System.out.println(4 == 4 & 1 == 1);// 逻辑与
		System.out.println(4 == 4 | 1 != 1);// 逻辑或

		int i = 0, k = 1;
		System.out.println("" + (i != 0 & ++k == 2) + "," + k);
		System.out.println("" + (i != 0 && ++k == 3) + "," + k);

		// 逻辑与
		int x = 1, y = 1;
		if (x++ == 2 & ++y == 2) {
			x = 7;
		}
		System.out.println("x=" + x + ", y=" + y);

		// 短路与
		x = 1;
		y = 1;
		if (x++ == 2 && ++y == 2) {
			x = y;
		}
		System.out.println("x=" + x + ", y=" + y);

		// 逻辑或
		x = 1;
		y = 1;
		if (x++ == 1 | ++y == 1) {
			x = 7;
		}
		System.out.println("x=" + x + ", y=" + y);

		// 短路或
		x = 1;
		y = 1;
		if (x++ == 1 || ++y == 1) {
			x = 7;
		}
		System.out.println("x=" + x + ", y=" + y);
		
		//if else
		i = 1;
		if(i==1){
			System.out.println("one");
		}
		else if(i==2) {
			System.out.println("two");
		}
		else if (i==3) {
			System.out.println("three");
		}
		else {
			System.out.println("other");
		}
		
		//switch
		System.out.println("switch");
		i = 1;
		switch(i) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("other");
			break;
		}
		
		

	}

}
