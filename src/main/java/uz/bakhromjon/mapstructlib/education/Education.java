package uz.bakhromjon.mapstructlib.education;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Data
@Builder
@ToString
public class Education {
    private String degreeName;
    private String institute;
    private Integer yearOfPassing;
}
