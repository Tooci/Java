package day15.abstracT;
/*
*   abstract的使用：
*           1.修饰类、方法
*
*   2.抽象类：不能实例化,但是一定有构造器，便于子类实例化时调用，提供抽象类的子类进行实例化
*
*   3.抽象方法：只有方法的生命，没有方法体
*       抽象方法的类一定是抽象类，反之抽象类中不一定有抽象方法
*       子类没有重写抽象方法，则子类也需用abstract修饰
*
*       匿名子类
* */
public class AbstractTest {
    public static void main(String[] args) {
        //类抽象，不可实例化
//        Person p1=new Person();
//        p1.eat();
    }
}

abstract class Person{
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //抽象方法
    public abstract void eat();

    public void walk(){
        System.out.println("睡觉");
    }
}

class Student extends Person {

    @Override
    public void eat() {
    }
}