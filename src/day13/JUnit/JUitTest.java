package day13.JUnit;

import org.junit.Test;
/*
* @Test 并且导入import org.junit.Test;
*
* 声明好单元测试后，在方法体内测试代码
* 运行
* 无异常：绿条
* 有异常：红条
* */

public class JUitTest {
    @Test
    public void testEquals(){
        String s1="MM";
        String s2="MM";
        System.out.println(s1.equals(s2));
    }

    @Test
    public void testToString(){
        String s1="mm";
        System.out.println(s1.toString());
    }
}
