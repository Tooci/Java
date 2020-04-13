package day12;

public class Student extends Person {
    //    String name;
//    int age;
    String major;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    //    public void eat(){
//        System.out.println("吃饭");
//    }
//    public void sleep(){
//        System.out.println("睡觉");
//    }
    public void study() {
        System.out.println("学习" + major);
    }

    @Override//重写
    public void eat() {
        System.out.println("吃有营养的东西");
    }

    public void show() {
        System.out.println("name:" + name + ",age:" + getAge());
    }
}

