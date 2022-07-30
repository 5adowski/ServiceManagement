package sadowski.wojciech.address;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class Address {
    private Long id;
    private String zipCode;
    private String city;
    private String streetName;
    private String buildingNumber;
    private String localNumber;
    private List<String> devices;
}
