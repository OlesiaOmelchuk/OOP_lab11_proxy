package ua.edu.ucu.task_1;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString
@Getter
public class User extends Human{
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;
}