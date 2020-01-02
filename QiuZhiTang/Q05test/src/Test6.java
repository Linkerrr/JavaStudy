public class Test6 {
    //Java中参数传递的方式只有一种：值传递；

    //基本数据类型的传递
    //基本数据类型在参数传递过程中，就是把实参的值复制到形参上
    public static void swap(int a){
        a = 6;
        System.out.println("swap方法中i："+a);
    }

    public static void main(String[] args){
        int a = 0;
        swap(a);
        System.out.println("main方法中a："+a);
    }

    //引用对象的传递

}
