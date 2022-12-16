package uz.bakhromjon.mapstructlib.address;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Data
@Builder
@ToString
public class Address {
    private String houseNo;
    private String landmark;
    private String city;
    private String state;
    private String country;
    private String zipcode;
}
