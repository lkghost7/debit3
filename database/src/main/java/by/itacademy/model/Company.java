package by.itacademy.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "company")
@Setter
@Getter
@ToString(exclude = "person")
@NoArgsConstructor
@AllArgsConstructor
public class Company extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "company")
    private Set<Person> person = new HashSet<>();

    public Company(String name) {
        this.name = name;
    }
}