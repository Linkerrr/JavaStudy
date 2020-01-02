public class Person3 {
    //用数组方式传递可变个数的参数
    public static void printInfo(String[] args) {
        //问题，我们能够打印的信息都来源于方法的参数的传递
        //现在可能给方法传递不同参数
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }

    //Java特有的“...”方式来传递可变个数的参数，这种参数在使用时与数组的使用方法相同
    public static void printInfo1(String... args){
        for(int i = 0; i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
