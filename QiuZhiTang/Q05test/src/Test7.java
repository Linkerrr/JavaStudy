
public class Test7 {
    public static void swap(DataSwap ds1){
        ds1.a  = 6;
        System.out.println("在swap方法中，ds1.a的值："+ds1.a);
    }

    public static void main(String[] args){
        DataSwap ds = new DataSwap();
        System.out.println("调用swap方法前，ds.a的值："+ds.a);
        swap(ds);
        System.out.println("调用swap方法后，ds.a的值："+ds.a);
    }

    //不同包下的同名类
    Person p = new Person();
}
