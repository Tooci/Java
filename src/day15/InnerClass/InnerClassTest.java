package day15.InnerClass;
/*
*   内部类
*       1.A声明在类B中，A就是内部类B是外部类
*       2.内部类分类：
*           成员内部类 vs 局部内部类（方法、代码块、构造器）
*
*       成员内部类：作为外部类的成员：调用外部类结构
*                               用static修饰
*                                  被四种权限修饰
*                  作为一个类：定义方法、属性，构造器
*                             可以被final修饰
*                             可以被abstract
*
* */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建Dog实例 ,静态成员内部类
        Person.Dog dog=new Person.Dog();
        dog.show();
        //创建Bird实例 ,非静态成员内部类
       // Person.bird
        Person p=new Person();
        Person.Bird bird=p.new Bird();
        bird.sing();
        bird.display("卡莎");
    }
}

class Person{
    String name="小明";
    int age;
    public void eat(){
        System.out.println("吃饭");
    }

    //静态成员内部类
    static class Dog{
        String name;
        int age;
        public void show(){
            System.out.println("卡拉");
            //
           // eat();
        }
    }
    //非静态成员内部类
    class Bird{
        String name="小华";
        public void sing(){
            System.out.println("唱歌");
            Person.this.eat();//调用外部类的非属性、方法
        }
        public void display(String name){
            System.out.println(name);//方法的形参
            System.out.println(this.name);//内部类的属性
            System.out.println(Person.this.name);//外部类的属性
        }
    }

    //开发中少见
    public void method(){
        //方法内部类
        class A{

        }
    }
    {
        //代码块内部类
        class B{

        }
    }

    public Person(){
        //构造器内部类
        class C{

        }
    }

    public Comparable getComparable(){
        //局部内部类
        //一：
        class MyComparable implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }

        //二
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        //return new MyComparable();
    }
}