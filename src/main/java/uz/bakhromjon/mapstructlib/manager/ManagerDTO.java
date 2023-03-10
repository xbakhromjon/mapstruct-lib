package uz.bakhromjon.mapstructlib.manager;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Data
@Builder
@ToString
public class ManagerDTO {
    private int id;
    private String name;
    private String eManager;
}
