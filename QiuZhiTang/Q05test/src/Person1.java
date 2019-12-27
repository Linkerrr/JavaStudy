public class Person1 {
    //实例变量
    //在类实例化成对象之后才能使用
    public String name = "zhangsan";
    private int age;

    //类变量
    //不需要类实例化成对象就可以使用
    //直接可以通过 类名.属性 这样的方法调用
    public static String sex = "male";

    public void showAge(){
        System.out.println(age);
    }
}
