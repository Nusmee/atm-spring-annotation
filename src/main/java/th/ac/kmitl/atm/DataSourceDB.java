package th.ac.kmitl.atm;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceDB implements DataSource  {
    public Map<Integer,Customer> readCustomers(){

        //... จำลองการอ่านข้อมูลจากฐานข้อมูล
        Map<Integer,Customer> customers = new HashMap<>();

        customers.put(1 , new Customer(1 , "Peter", 1234 , 1000));
        customers.put(2, new Customer(2 , "Katherlen", 2345 , 2000));
        customers.put(3, new Customer(3, "Chris", 3456 ,3000));

        return  customers;

    }
}
