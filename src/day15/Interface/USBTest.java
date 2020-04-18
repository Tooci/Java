package day15.Interface;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
*   1.接口满足多态性
*   2.定义一种规范
*   3.开发中，体会面向接口编程！
*
* */
public class USBTest {
    public static void main(String[] args) {
        Computer com=new Computer();
        Flash flash=new Flash();
        com.transferData(flash);

        //匿名内部类
        com.transferData(new Printer());

        USB phone=new USB() {
            @Override
            public void start() {
                System.out.println("手机");
            }

            @Override
            public void stop() {

            }
        };
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3");
            }

            @Override
            public void stop() {

            }
        });


    }
}

class Computer {
    public void transferData(USB usb) {//USB usb=new Flash()
        usb.start();
        System.out.println("传输数据的细节");
        usb.stop();
    }
}

interface USB {
    //定义长、宽、最大、最小传输速度
    void start();

    void stop();
}

class Flash implements USB {
    @Override
    public void start() {
        System.out.println("U盘开始工作");

    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB {
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
