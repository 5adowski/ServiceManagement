package sadowski.wojciech.order;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;


@Component
@Data
public class Task {
    private Long id;
    private Long idTemp;
    private String idString;
    private String description;
    private String notes;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Integer price;
    private String status;
    private Long idAddress;
    private Long idCustomer;
    private Long idTechnician;
}
