package day03;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("请输入你的年龄");
        int age=sc.nextInt();
        System.out.println("我的年龄是："+age);

        System.out.println("请输入你的姓名");
        String name=sc.next();
        System.out.println("我的名字是"+name);



    }
}
