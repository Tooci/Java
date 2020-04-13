package day12;
/*
重写：子类对父类的方法进行覆盖重写
    重写以后，创建子类对象，通过调用子类方法是，是重写后的方法
    返回值类型，可以是父类的子类
                基本数据类型，必须是基本数据类型
                static 不是重写
* */
public class PersonTest {
    public static void main(String[] args) {
        Student s=new Student("计算机科学技术");
        s.eat();
        s.walk(10);

        s.study();
    }
}
