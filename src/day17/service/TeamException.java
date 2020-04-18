package day17.service;

/**
 *
 * @Description 自定义异常类
 * @author shkstart  Email:shkstart@126.com
 * @version
 * @date 2019年2月12日上午12:02:58
 *
 */
public class TeamException extends Exception {
    static final long serialVersionUID=-3387514229948L;

    public TeamException() {
        super();
    }

    public TeamException(String message) {
        super(message);
    }
}
