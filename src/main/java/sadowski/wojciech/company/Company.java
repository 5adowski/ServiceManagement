package sadowski.wojciech.company;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Company {
    private Long id;
    private String name;
    private String nip;
    private Long idAddress;
}
