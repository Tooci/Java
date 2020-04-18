package day14.stati;

import java.security.spec.RSAOtherPrimeInfo;

/*
* static的使用：
*       1.静态的
*       2.修饰属性、方法、代码块，内部类
*       3.修饰属性
*           多个独享，共享同一个属性  调用类.静态变量
*       4.修饰方法：
*           类.静态方法进行调用 静态方法不能调用非静态方法。
*
*       如何确定一个属性是否声明为static
*           属性可以共享，不会随对象的不同而不同，例如国家
*       如何确定一个方法是否声明为static
*           操作静态属性的方法
*           工具类中的方法，Math, Arrays,Collections
* */
public class StaticTest {
    public static void main(String[] args) {
        Chinese c1=new Chinese();
        c1.name="小明";
        c1.age=21;


        Chinese c2=new Chinese();
        c2.name="小华";
        c2.age=20;

        c1.nation="CHN";
        System.out.println(c2.nation);
        //不需要实例化
        Chinese.show();
    }
}

class Chinese{
    String name;
    int age;
    static String nation;

    public static void show(){
        System.out.println("我是一个中国人");
    }
}
