package day09;

public class InstanceTest {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.sendEmail();
        new Phone().sendEmail();
    }
}


class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }


}