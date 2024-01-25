package org.fasttrackit.lambda;

import lombok.Builder;
import lombok.Data;

@Builder
public record Person(
        String firstName,
        String lastName,
        Integer age,
        String city

) {

    public int getAge() {
        return age;
    }
}
