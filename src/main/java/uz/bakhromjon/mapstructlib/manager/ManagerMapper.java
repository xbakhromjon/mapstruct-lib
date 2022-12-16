package uz.bakhromjon.mapstructlib.manager;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface ManagerMapper extends EnumMapper {
    ManagerMapper INSTANCE = Mappers.getMapper(ManagerMapper.class);

    @Mapping(source = "name", target = "name", ignore = true)
    ManagerDTO convertToManagerDTO(Manager manager);

}
