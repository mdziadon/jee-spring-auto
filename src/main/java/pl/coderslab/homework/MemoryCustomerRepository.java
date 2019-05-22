package pl.coderslab.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryCustomerRepository implements CustomerRepository {

    private List<Customer> customers = new ArrayList<>();

    private CustomerLogger logger;

    @Autowired
    public MemoryCustomerRepository(CustomerLogger logger) {
        this.logger = logger;
    }

    @Override
    public void addCustomer(Customer customer) {
        logger.log();
        customers.add(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        logger.log();
        customers.removeIf(c -> c.getId().equals(id));
    }

    @Override
    public List<Customer> getCustomers() {
        logger.log();
        return customers;
    }
}
