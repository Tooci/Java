package day13;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1=new Circle(2.3);
        Circle circle2=new Circle("white",2.3,2.0);
        System.out.println("颜色是否相等"+circle1.getColor().equals(circle2.getColor()));//true

        System.out.println("半径是否相等"+circle1.equals(circle2));//false

        System.out.println(circle1);//2,3
        System.out.println(circle2.toString());//2.0



    }
}
