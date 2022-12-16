package uz.bakhromjon.mapstructlib.person;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import uz.bakhromjon.mapstructlib.education.EducationDTO;
import uz.bakhromjon.mapstructlib.manager.ManagerDTO;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Data
@Builder
@ToString
public class PersonDTO {
    private String id;
    private String firstName;
    private String lastName;
    private String educationalQualification;
    private String residentialCity;
    private String residentialCountry;
    private String designation;
    private long salary;
    private EducationDTO education;
    private List<ManagerDTO> managerList;
}
