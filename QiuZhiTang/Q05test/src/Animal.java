/**
 * 动物类
 */
public class Animal {
    String name;//动物名
    int eye;//眼睛个数
    int legs;//腿数目

    /**
     * 输出动物吃的食物
     *
     * @param food 实物
     */
    public void eat(String food) {
        System.out.println("此动物的食物是：" + food);
    }

    /**
     * 动物的移动方式
     *
     * @param moveType 移动方式
     */
    public void move(String moveType) {
        System.out.println("此动物的移动方式是：" + moveType);
    }
}

