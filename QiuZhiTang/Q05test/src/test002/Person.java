package test002;

public class Person {
    //属性
    String name;//默认值：null
    int age;//默认值：0

    //方法
    public void showName() {
        System.out.println("姓名:" + name);
    }

    public int getAge(){
        return age;
    }
}
