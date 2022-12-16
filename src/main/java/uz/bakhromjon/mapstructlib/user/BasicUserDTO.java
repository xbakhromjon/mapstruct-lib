package uz.bakhromjon.mapstructlib.user;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Data
@Builder
@ToString
public class BasicUserDTO {
    private int id;
    private String name;
}
