package day14.single;

public class SingleTest2 {
    public static void main(String[] args) {
        Order order1=Order.getInstance();
        Order order2=Order.getInstance();
        System.out.println(order1==order2);//true
    }


}

//懒汉式
class Order{
    private Order(){}

    //声明当前类对象,静态的
    private static Order instance=null;

    //返回当前类对象
    public  static Order getInstance(){
        if(instance==null) {
            instance = new Order();
        }
        return instance;
    }

}
