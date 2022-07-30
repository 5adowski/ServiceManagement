package sadowski.wojciech.customer;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private List<Long> idAddresses;
    private Long idCompany;
}
