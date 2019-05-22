package pl.coderslab.homework;

import java.util.List;

public interface CustomerRepository {

    void addCustomer(Customer customer);

    void deleteCustomer(Long id);

    List<Customer> getCustomers();
}
