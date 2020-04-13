package day09;
/*
*   方法的重载：同名方法，参数个数或者类型不同
* */
public class Override {
    public static void main(String[] args) {

    }
}

class Array{
    public void getSum(int[] arr){

    }

    public void getSum(double[] arr){

    }

    public void getSum(String s){}


    //可变数形参 不构成重载
    public void getSum(String s,String...str){}
}

