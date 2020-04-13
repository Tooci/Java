package day12;

public class KidTest {
    public static void main(String[] args) {
        Kid someKid=new Kid();

        someKid.printAge();

        someKid.setSalary(0);
        someKid.setSex(1);

        someKid.employed();
        someKid.manOrWomen();
    }
}
