package me.droized.atlastest.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import me.droized.atlastest.enums.Gender;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class Users {

    @Id
    private String _id;

    @Field(name = "fullName")
    private String fullName;

    @Field(name = "age")
    private Integer age;

    @Field(name = "occupation")
    private String occupation;

    @Field(name = "gender")
    private Gender gender;

    public Users(String fullName, Integer age, String occupation, Gender gender) {
        this.fullName = fullName;
        this.age = age;
        this.occupation = occupation;
        this.gender = gender;
    }
}
