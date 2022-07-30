package sadowski.wojciech.technician;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Technician {
    private Long id;
    private String name;
}
