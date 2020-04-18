package day17.junit;

import day17.domin.Employee;
import day17.service.NameListService;
import day17.service.TeamException;
import org.junit.Test;

/**
 *
 * @Description 将Data中的数据封装到Employee数组中，提供相关方法
 * @author shkstart  Email:shkstart@126.com
 * @version
 * @date 2019年2月12日上午12:02:58
 *
 */
public class NameListServiceTest {
    @Test
    public void testGetEmployee(){
        NameListService nameListService=new NameListService();
        int id=101;
        try{
            Employee employe=nameListService.getEmployee(id);
            System.out.println(employe);
        }catch (TeamException e){
            System.out.println(e.getMessage());
        }
    }



    public void testGetAllEmployees(){
        NameListService nameListService=new NameListService();
        Employee[] employees=nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
