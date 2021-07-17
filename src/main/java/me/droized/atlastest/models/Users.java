package me.droized.atlastest.models;

import lombok.*;
import me.droized.atlastest.enums.Sex;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
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

    @Field(name = "sex")
    private Sex sex;
}
