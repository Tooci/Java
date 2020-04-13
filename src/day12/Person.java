package day12;

public class Person {
    String name;
    int age;


    public Person() {
    }

    public Person(String name, int age,String major) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(int distance){
        System.out.println("走路,距离时"+distance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
