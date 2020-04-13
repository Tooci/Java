 package day05;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的成绩");
        int score = sc.nextInt();
        if (score == 100) {
            System.out.println("奖励一辆BW");
        } else if (80 < score && score < 90){
            System.out.println("奖励一台iphone");
        }else if(60<=score && score<=80){
            System.out.println("奖励 一个ipad");
        }else{
            System.out.println("无奖励");
        }


    }
}
