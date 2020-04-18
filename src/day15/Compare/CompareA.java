package day15.Compare;

public interface CompareA{
    //静态方法
    public static void method1(){
        System.out.println("背景");
    }

    //默认方法
    public default void method2(){
        System.out.println("上海");
    }

    default void method3(){
        System.out.println("深圳");
    }
}
