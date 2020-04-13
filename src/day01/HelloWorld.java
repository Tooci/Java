package day01;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
//        He he=new He();

        //变量：先定义，后使用，同一作用域内不能有两个同名方法名
        int age;
        age = 20;
        System.out.println(age);
    }
}
/* 错误，只能有一个public
public class He{
    public void min(){
        System.out.println("111");
    }
}*/
