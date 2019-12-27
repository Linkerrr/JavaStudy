public class Test4 {
    public static void main(String[] args) {
//        //实例化Person类
//        Person person = new Person();//声明一个Person类型的变量
//        //new Person()就是实例化；
//        person.name = "张三";//给person对象的name赋值；
//        person.showName();
//        person.getAge();
//
//        Animal ani = new Animal();
//        ani.eat("老鼠");
//        ani.move("飞");
//
//        Person p1 = new Person();
//        Person p2 = new Person();
//        p1.name = "zhangsan";
//        p2.name = "lisi";
//        p1.showName();
//        p2.showName();
//
//        Student stu = new Student();
//        stu.name = "Xiaoming";
//        stu.age = 12;
//        stu.course = "shuxue";
//        stu.interest = "changge";
//        stu.showInfo();
//
//        Person2 p3 = new Person2();
//        p3.name = "lucy";
//        p3.age = 11;
//        p3.sex = 1;
//        p3.study();
//
//        p3.addAge(2);
//        System.out.println("a:"+2+" p.age:"+p3.age);
//
//        double area = new Circle().area(2);
//        System.out.println("半径为2的圆的面积："+ area);

        Test4 t4 = new Test4();
        t4.mOL(2);
        t4.mOL(2, 3);
        t4.mOL("overload");

        System.out.println(t4.max(3, 4));
        System.out.println(t4.max(3.14, 4.13));
        System.out.println(t4.max(3.14, 4.13, 1.34));
    }

    public int add(int x, int y) {
        return x + y;
    }

    public double add(int x, double y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public void mOL(int i) {
        System.out.println(i * i * i);
    }

    public void mOL(int x, int y) {
        System.out.println(x * y);
    }

    public void mOL(String s) {
        System.out.println(s);
    }

    public int max(int x, int y) {
        return x > y ? x : y;
    }

    public double max(double x, double y) {
        return x > y ? x : y;
    }

    public double max(double x, double y, double z) {
        return (x > y ? x : y) > z ? (x > y ? x : y) : z;
    }
}
