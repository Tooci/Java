package day12;
/*
* 继承、
*
* */
public class Kid extends ManKind
{
    private int yearOld;

    public Kid() {
    }

    public Kid(int yearOld) {
        this.yearOld = yearOld;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public void printAge(){
        System.out.println("I am "+yearOld+"years old.");
    }

}
