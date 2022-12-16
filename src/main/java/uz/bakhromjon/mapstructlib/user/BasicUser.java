package uz.bakhromjon.mapstructlib.user;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import uz.bakhromjon.mapstructlib.manager.Manager;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Data
@Builder
@ToString
public class BasicUser {
    private int id;
    private String name;
    private List<Manager> managerList;
}
