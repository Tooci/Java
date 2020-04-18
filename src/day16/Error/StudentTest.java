package day16.Error;

public class StudentTest {
    public static void main(String[] args) {
        try{
            Student s=new Student();
            s.regist(-1001);
            System.out.println(s);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

class Student{
    private int id;
    public void regist(int id) throws Exception{
        if (id>0){
            this.id=id;
        }else {
            throw new Exception("数据非法");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
