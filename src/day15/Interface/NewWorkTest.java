package day15.Interface;

public class NewWorkTest {
    public static void main(String[] args) {
        Server server=new Server();
        ProxyServer proxyServer=new ProxyServer(server);
        proxyServer.browse();
    }
}

interface NetWork {
    public void browse();

}

//被代理类
class Server implements NetWork {
    @Override
    public void browse() {
        System.out.println("真实的服务器");
    }
}

//代理类
class ProxyServer implements NetWork{
    private  NetWork netWork;

    public ProxyServer(NetWork netWork){
        this.netWork=netWork;
    }
    public void check(){
        System.out.println("检查工作");
    }

    @Override
    public void browse() {
        check();
        netWork.browse();
    }
}
