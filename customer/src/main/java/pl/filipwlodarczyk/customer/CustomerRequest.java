package pl.filipwlodarczyk.customer;

public record CustomerRequest(
        String firstName,
        String lastName,
        String email
) {

}
