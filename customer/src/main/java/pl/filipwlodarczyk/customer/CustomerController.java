package pl.filipwlodarczyk.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController() {

    @PostMapping("/register")
    public void registerCustomer(@RequestBody CustomerRequest customer) {
        log.info("new customer registration {}", customer);
    }
}
