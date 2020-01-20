package wyss.businessapplication.springapplication.services;

import org.springframework.stereotype.Service;
import wyss.businessapplication.springapplication.Database.Customer;
import wyss.businessapplication.springapplication.repositories.CustomerRepository;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerByID(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findallCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Methoden für normale logik
    // hier kann programmiert werden


}
