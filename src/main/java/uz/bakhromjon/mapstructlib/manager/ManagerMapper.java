package uz.bakhromjon.mapstructlib.manager;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper
public interface ManagerMapper {
    ManagerMapper INSTANCE = Mappers.getMapper(ManagerMapper.class);
    ManagerDTO convert(Manager manager);
}
