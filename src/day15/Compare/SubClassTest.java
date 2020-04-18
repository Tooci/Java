package day15.Compare;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s=new SubClass();

       // s.method1();//接口中的静态方法只能通过接口来调用
        CompareA.method1();
        s.method2();//默认方法可以被实现类调用

        //父类方法和接口方法同名同参数的方法，子类无重写方法，默认调用父类的方法--类优先原则

        //实现类多个接口有同名同参数的默认方法，没有重写方法的情况下，报错-->接口冲突

        //CompareA.super.method3()//调用接口中的默认方法，在实现类中重写方法时使用

        //SubClass.method2();//实现类


    }

}
class SubClass implements CompareA{
    @Override
    public void method2() {
        System.out.println("SubClass 上海");
    }
}
