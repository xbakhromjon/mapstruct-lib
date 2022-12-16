package uz.bakhromjon.mapstructlib.manager;

import org.mapstruct.Mapper;
import org.mapstruct.Named;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface EnumMapper {
    @Named("enumConverter")
    default EManager convert(String name) {
        try {
            EManager eManager = Enum.valueOf(EManager.class, name);
            return eManager;
        } catch (Exception e) {
            throw new RuntimeException("Works");
        }
    }
}
