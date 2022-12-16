package uz.bakhromjon.mapstructlib.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import uz.bakhromjon.mapstructlib.address.Address;
import uz.bakhromjon.mapstructlib.education.Education;
import uz.bakhromjon.mapstructlib.manager.ManagerMapper;
import uz.bakhromjon.mapstructlib.person.PersonDTO;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(uses = {ManagerMapper.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "user.id", target = "id")
    @Mapping(source = "user.name", target = "firstName")
    @Mapping(source = "education.degreeName", target = "educationalQualification")
    @Mapping(source = "address.city", target = "residentialCity")
    @Mapping(source = "address.country", target = "residentialCountry")
    PersonDTO convert(BasicUser user, Education education, Address address);
}

