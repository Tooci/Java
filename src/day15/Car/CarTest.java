package day15.Car;
/*
*   工厂模式
* */
public class CarTest {
    public static void main(String[] args) {
       Car a= new AudiFactory().getCar();
       Car b=new BydFactory().getCar();
       a.run();
       b.run();
    }
}

interface Car{
    void run();
}

class Audi implements Car{
    @Override
    public void run() {
        System.out.println("奥迪车");
    }
}

class Byd implements Car{
    @Override
    public void run(){
        System.out.println("比亚迪车");
    }
}

interface CarFactory{
    Car getCar();
}

class AudiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Audi();
    }
}

class BydFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Byd();
    }
}
