package wyss.businessapplication.springapplication.services;

import wyss.businessapplication.springapplication.Database.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerByID(Long id);

    List<Customer> findallCustomers();

    Customer saveCustomer(Customer customer);
}
