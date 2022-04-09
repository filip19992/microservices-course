package pl.filipwlodarczyk.customer;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Data
@Builder
public class Customer {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
