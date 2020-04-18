package day15.Interface;
/*
*       接口的使用：
*       1.使用接口interface
*       2.java中，接口和类是并列的两个结构
*       3.JDK7:全局常量和抽象方法 public static final的常量  书写时可以省略不写
*               抽象方法 public abstract
*       4.JDK8：还有静态方法、默认方法
*
*       5.接口中不能定义构造器：接口不可实例化
*
*       6.java开发中，类实现来使用接口
*           实现类覆盖了接口中所有抽象方法，类就可以实例化
*           如果没有，则此实现类仍为抽象类
*       7.java类可以实现多个接口，接口也可以多继承
*       8.接口的使用体现多态性
*       9.接口是一种规范
*
*       抽象类与接口异同:
* */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        //全局常量不允许继续赋值
//        Flyable.MIN_SPEED=2;
    }
}

interface Attackable{
    void attack();
}

interface Flyable{
    //全局常量
    public static final int MAX_SPEED=7900;
    int MIN_SPEED=1;//省略了public static final

    //抽象方法
    public abstract void fly();

     void stop();//省略了public abstract
}

class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");

    }
}

abstract class Kite implements Flyable{
    @Override
    public void fly() {

    }
}

class Bullet implements Flyable,Attackable{
    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}



