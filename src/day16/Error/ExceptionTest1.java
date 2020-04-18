package day16.Error;

import org.junit.Test;

/*
* 异常处理：
*       抛：执行过程中，出现异常，就会生成一个异常类对象，将次对象抛出
*
*       抓：1try-catch-finaly  2.throw
*
*   1.
*       try{
* }catch(异常1, 变量名1){}
* catch(异常2, 变量名2){}
* finally{
*  一定会执行的代码
* }
*   finally 可选
*   finally的代码一定会被执行
*   使用，数据库连接，Socket连接等物理连接
*   try封装可能出现异常的代码，根据异常对象的类型，与catch匹配，匹配完成后进行处理，处理完成跳出结构
*   catch异常类型没有子父类关系，则没有顺序关系
*   满足子父类关系，则子类一定在父类上方
*
*   常用处理方式：getMessage() printStackTrace()
*
*   子类重写方法抛出的异常类型不大于父类抛出的异常类型
*   如果父类被重写的方法没有throws，则子类重写的方法也不能使用throws
*   几个递进方法互相调用，建议使用throws
*
* */
public class ExceptionTest1 {
    @Test
    public void test(){
        String str="abc";
        try{
            int num=Integer.parseInt(str);
            System.out.println("hello1");
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("异常。。。");
        }
        System.out.println("hello2");
    }
}
