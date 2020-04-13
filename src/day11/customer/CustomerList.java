package day11.customer;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /**
     * 初始化customer数组的构造器
     *
     * @param totalCustomer:指定数组长度
     */
    public CustomerList(int totalCustomer) {
        this.customers = new Customer[totalCustomer];
    }

    /**
     * @Description Customer 实体对象
     * @author Tooci
     * @version
     * @date
     */
    //增加元素
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    /**
     * @param index
     * @param cust
     * @Description Customer 实体对象
     * @author Tooci
     * @version
     * @date
     */
    //修改元素
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    //删除元素
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }

        //元素置空
        customers[total--] = null;
        return true;
    }

    //获取所有信息
    public Customer[] getAllCustomer() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    //获取指定位置的信息
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    //获取客户数量
    public int getTotal() {
        return total;
    }
}

