package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Address {
    private String houseNo;
    private String streetName;
    private String cityName;
    private String stateName;
    private String zip;
}
