package day10;

public class ValueTest {
    public static void main(String[] args) {
        String s1="hello";
        ValueTest valueTest=new ValueTest();
        valueTest.change(s1);
        System.out.println(s1);//hello  地址传递
    }

    public void change(String s){
        s="h1---";
    }
}
