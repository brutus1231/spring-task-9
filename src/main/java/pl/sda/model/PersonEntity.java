package pl.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonEntity {

    private String firstName;
    private String lastName;
    private int age;
    private String pesel;
}
