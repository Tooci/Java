package day12;

public class ManKind {
    private int sex;//性别
    private int salary;//薪资

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public void manOrWomen(){
        if(sex==1){
            System.out.println("man");
        }else if(sex==0){
            System.out.println("women");
        }
    }

    public void employed(){
        if (salary==0){
            System.out.println("no jbo");
        }else{
            System.out.println("job");
        }

    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
