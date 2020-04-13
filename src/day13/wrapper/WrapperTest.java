package day13.wrapper;

import org.junit.Test;

/*
* 包装类的使用;
* 1.基本数据类型、包装类、String三者转换
* parsexxx  valueOf
* */
public class WrapperTest {

    //包装类->基本数据类型
    @Test
    public void test2(){
        Integer i=new Integer(12);
        int in1=i.intValue();
        System.out.println(in1+1);
    }

    //基本数据类型->包装类
    @Test
    public void test1(){
        int num1=10;
       // System.out.println(num1.toString());
        Integer in1=new Integer(num1);
        System.out.println(in1.toString());

        Integer in2=new Integer("123");
        System.out.println(in2.toString());
    }
}
