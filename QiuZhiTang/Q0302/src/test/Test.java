package test;

public class Test {
	public static void main(String[] args) {

//		for (int i = 0; i < 5; ++i) {
//			System.out.println("hello world");
//		}
//		
//		//练习1
//		int sum = 0;
//		for(int i = 0;i<100;++i) {
//			if((i+1)%2!=0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
//		
//		sum = 0;
//		int ii=0;
//		while(ii<100) {
//			if((ii+1)%2==0) {
//				sum +=ii+1;
//			}
//			++ii;
//		}
//		System.out.println(sum);
//		
//		//练习2
//		sum = 0;
//		for(int i = 0;i<100;++i) {
//			if((i+1)%7==0) {
//				sum+=i+1;
//			}
//		}
//		System.out.println("个数:"+(100/7));
//		System.out.println("总和:"+sum);
//		
//		//练习3
//		int a = 0,b=0,c=0;
//		for(int i=100;i<1000;++i) {
//			a=i/100;
//			b=i/10%10;
//			c=i%10;
//			if(i==a*a*a+b*b*b+c*c*c) {
//				System.out.println(i);
//			}
//		}
//		
//		//99乘法表
//		for(int i = 1;i<10;++i) {
//			for(int j = 1;j<=i;++j) {
//				System.out.print(""+i+"*"+j+"="+i*j+" ");
//			}
//			System.out.println("");
//		}
//		
//		
//		//数组
//		//声明
//		int m[];
//		int[] m;
//		
//		//动态初始化
//		int m1[] = new int[3];
//		m1[0] = 0;
//		m1[1] = 1;
//		m1[2] = 2;
//		
//		//静态初始化
//		int m2[] = new int[] {1,2,3};
//		int m3[] = {1,2,3};
//		
//		//多维数组
//		int[][][] arr = new int[3][][];
//		arr[0] = new int[2][];
//		arr[1] = new int [3][];
//		arr[2] = new int [4][];
//		arr[0][0] = new int[3];
		
		//数组算法
		int[] arr = new int [] {1,2,3,4,5,6,7};
		
		//最大值
		int max = arr[0];
		for(int i = 0; i<arr.length;++i) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		//最小值
		int min = arr[0];
		for(int i = 0;i<arr.length;++i) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		//和，均值
		int res = 0;
		for(int i = 0;i<arr.length;++i) {
			res += arr[i];
		}
		System.out.println(res);
		System.out.println(res/arr.length);
		//复制
		int[] copy = new int[arr.length];
		for(int i = 0; i<arr.length;++i) {
			copy[i] = arr[i];
		}
		//排序
		int temp = 0;
		for(int i = 0; i<arr.length-1;++i) {
			for(int j = 0;j<arr.length-1-i;++j) {
				 if(arr[j]<arr[j+1]) {
					 temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
			}
		}
	}

}
