package wyss.businessapplication.springapplication.API;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import wyss.businessapplication.springapplication.Database.Customer;
import wyss.businessapplication.springapplication.services.CustomerService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

    public static final String BASE_URL = "/wyss/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @CrossOrigin(origins = "*")
    @GetMapping
    List<Customer> getAllCustomers() {
        return customerService.findallCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomersById(@PathVariable Long id) {
        return customerService.findCustomerByID(id);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
}
