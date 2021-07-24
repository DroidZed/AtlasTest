package me.droized.atlastest.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import me.droized.atlastest.enums.Gender;

@Data
@NoArgsConstructor
public class UserDataDTO {

    private String fullName;

    private Integer age;

    private String occupation;

    private Gender gender;
}
