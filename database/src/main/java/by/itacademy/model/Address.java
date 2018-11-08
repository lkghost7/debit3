package by.itacademy.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Setter
@Getter
@Embeddable
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Address {
    @Column(name = "country")

    private String country;
    @Column(name = "city")

    private String city;
}