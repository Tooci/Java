package day14.single;
/*
*   单例设计模式：
*       1.采取一定的方法只存在一个实例
*
*       2.实现
*       饿汉式VS懒汉式
*
*       3.区分
*       饿汉式： 对象加载时间过长，但线程安全
*       懒汉式：延迟对象的创建，但线程不安全
*
* */
public class SingleTest1 {
    public static void main(String[] args) {
        Bank b1=Bank.getInstance();
        Bank b2=Bank.getInstance();
        System.out.println(b1==b2);//true

    }
}

//饿汉式
class Bank{
    //1.私有化类的构造器
    private Bank(){

    }

    //2.内部创建类的对象,必须有静态
    private  static Bank instance=new Bank();

    //提供方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
