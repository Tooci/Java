package day08;
/*      属性：成员变量
        行为：方法
* */
public class PersonTest {
    //创建类的对象，实例化
    public static void main(String[] args) {
        Person p1=new Person();

        p1.name="Tom";
        System.out.println(p1.name);
        p1.sleep();
    }
}

class Person{
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    private void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}