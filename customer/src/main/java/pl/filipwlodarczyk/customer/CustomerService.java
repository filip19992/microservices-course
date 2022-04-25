package pl.filipwlodarczyk.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRequest customerRequest) {
       new Customer(null, customerRequest.firstName(),
               customerRequest.lastName(),
               customerRequest.email());
    }
}
