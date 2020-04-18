package day16.Error;

import org.junit.Test;

/*
*   一：异常体系结构：
*       java.lang.Throwable
*               ----java.lang.Error：不作针对性处理
*               ----java.lang.Exception:可以处理
*                               编译异常（IOException\ClassNotFoundException、FileNotFoundException）
*                               运行异常(NullPointerException、ArrayIndexOutOfBoundsException)
* */
public class ExceptionTest {
    @Test
    public void test2(){
        int[] arr=new int[10];
        System.out.println(arr[10]);
    }
//    public void test1(){
//        //NullPointerException
//        int[] arr=null;
//        System.out.println(arr[3]);
//    }
}
