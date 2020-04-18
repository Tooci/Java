package day14.Block;
/*
*   代码块：
*       1.作用:初始化类、对象
*       2.只能用static修饰或者不修饰
*       3.静态代码块VS非静态代码块
*
*       4静态代码块:输出语句/ 随着类的加载而执行,只有一次  顺序按先后顺序
*
*       5非静态代码块：输出语句/随着对象的创建而执行，每创建一个对象执行一次  顺序按先后顺序
*               作用：可以创建对象时，属性初始化
*
*       赋值：1.默认初始化 2.显示初始化 3.构造器初始化 4.对象初始化 5.代码块赋值
*
* */
public class BlcokTest {
    public static void main(String[] args) {
        String desc=Person.desc;
        String de= Person.desc;
        System.out.println(desc);

        Person p1=new Person();


    }
}
class Person{
    //属性
    String name;
    int age;
    static String desc="我是一个人";
    //构造器
    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //static代码块 会执行
    static {
        System.out.println("hello static");
        desc="爱学习";
    }

    //非静态代码块
    {
        System.out.println("hello");
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info(){
        System.out.println("我是一个快乐的人");
    }
}
