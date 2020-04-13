package day11.customer;

public class CustomerView {
    private CustomerList customerList=new CustomerList(10);

    //显示软件界面方法
    public void enterMainMenu(){
        boolean isFlag=true;
        while (isFlag) {
            System.out.println("\n-------------客户信息管理软件-------------");
            System.out.println("               1添加客户                    ");
            System.out.println("               2修改客户                    ");
            System.out.println("               3删除客户                    ");
            System.out.println("               4客户列表                    ");
            System.out.println("                 5退出                      ");
            System.out.println("              请选择（1-5）：                ");

            char menu=CMUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.println("退出");
                    char  isexist=CMUtility.readConfirmSelection();
                    if(isexist=='Y'){
                        isFlag=true;
                    }

            }
            isFlag=false;
        }


    }
    //添加客户的操作
    private void addNewCustomer(){
        System.out.println("添加客户操作");

    }
    //修改客户
    private void modifyCustomer(){
        System.out.println("修改客户操作");

    }
    //删除客户
    private void deleteCustomer(){
        System.out.println("删除客户操作");
    }
    //显示客户列表
    private void listAllCustomer(){
        //System.out.println("显示列表操作");
        System.out.println("------------------客户列表-----------------------");


    }
    public static void main(String[] args){
        CustomerView customerView=new CustomerView();
        customerView.enterMainMenu();
    }
}
