package day16.Error;
/*
*       Error StackOveflowError
* */
public class ErrorTest {
    public static void main(String[] args) {
        //1.栈溢出：java.lang.StackOverflowError
       // main(args);

        //2.堆溢出：java.lang.OutOfMemoryError
        Integer[] arr=new Integer[1024*1024*1024];
    }
}
