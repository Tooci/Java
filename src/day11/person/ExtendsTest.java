package day11.person;
/*
* 继承的好处：
*       1.减少代码的冗余
*       2.便于功能的扩展
*       3.多态的使用
*
*  继承的格式： class A extends B{}
*           A:子类、派生类 subclass
*           B；父类、超类、基类 superclass
*
*           体现：A继承B后，A获取B声明的结构、属性、方法
*             父类  private声明的子类仍然继承，但是不能直接调用
*               子类可以定义自己的属性和方法
*           子类和父类的关系，不是集合和子集的关系
*
*   java继承的特点：
*       一个类能被多个子类继承
*       一个子类只能有一个父类
*       子父类是相对概念，
*        子类继承父类有，拥有直接父类和间接父类的所有方法和属性
*
*所有类都直接或间接继承与java.lang.Object类
* */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setAge(10);
        p1.eat();

        Student student1=new Student();
        student1.eat();
        student1.sleep();
        student1.setAge(10);
        System.out.println(student1.getAge());
    }
}
