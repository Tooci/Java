package day17.domin;
/**
 *
 * @Description 表示员工的状态
 * @author 123
 * @version
 * @date 2019年2月12日上午12:02:58
 *
 */
public class Status {
    private final String NAME;

    private Status(String name){
        this.NAME=name;
    }
    public static final Status FREE=new Status("FREE");
    public static final Status BUSY=new Status("BUSY");
    public static final Status VOCATION=new Status("VOCATION");

    public String getNAME() {
        return NAME;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
