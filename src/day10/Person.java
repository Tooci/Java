package day10;

/*
*   构造器：创建对象 初始化
    //默认
    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    *
    *
    this的使用：修饰属性、方法、构造器 表示当前对象
* */
public class Person {
    private int age;
    private String name;


    public Person() {
    }

    public Person(int age, String name) {
        this();
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }


}
