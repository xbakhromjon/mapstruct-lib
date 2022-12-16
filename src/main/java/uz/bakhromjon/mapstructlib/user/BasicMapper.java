package uz.bakhromjon.mapstructlib.user;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import uz.bakhromjon.mapstructlib.address.Address;
import uz.bakhromjon.mapstructlib.education.Education;
import uz.bakhromjon.mapstructlib.person.PersonDTO;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper
public abstract class BasicMapper {
    public static final BasicMapper INSTANCE = Mappers.getMapper(BasicMapper.class);

    public abstract BasicUserDTO convert(BasicUser user);


//    public PersonDTO convertCustom(BasicUser user) {
//        return PersonDTO
//                .builder()
//                .id(String.valueOf(user.getId()))
//                .firstName(user.getName().substring(0, user.getName().indexOf(" ")))
//                .lastName(user.getName().substring(user.getName().indexOf(" ") + 1))
//                .build();
//    }

    @Mapping(source = "user.id", target = "id")
    @Mapping(source = "user.name", target = "firstName")
    @Mapping(source = "education.degreeName", target = "educationalQualification")
    @Mapping(source = "address.city", target = "residentialCity")
    @Mapping(source = "address.country", target = "residentialCountry")
    public abstract PersonDTO convert(BasicUser user, Education education, Address address);

}
