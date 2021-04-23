package j8streamexamples;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class Employee {
    private String employeeName;
    private int age;
    private ArrayList<Address> addressList;
}
