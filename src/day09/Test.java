package day09;

import day03.ScannerTest;

import java.util.Scanner;

/*  斐波那契数列
* */
public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        System.out.println(fun(3));
//        int a=1+1+2+3+5+8+13+21+34+55;
//        System.out.println(a);


    }

    public static int fun(int n){
        if(n==1)
            return 1;
        else if (n==2)
            return 1;
        else
            return fun(n-1)+fun(n-2);
    }
}
