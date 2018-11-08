package by.itacademy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "privilege")

@NoArgsConstructor
public class Privilege extends BaseEntity {
    @Setter
    @Getter
    @Column(name = "name")
    private String namePrivilege;

    public Privilege(Long id) {

    }

    public Privilege(String namePrivilege) {
        this.namePrivilege = namePrivilege;
    }


    public Privilege(Long id, String namePrivilege) {

        this.namePrivilege = namePrivilege;
    }

    @Override
    public String toString() {
        return "Privilege{" +
                "id=" + getId() + " " +
                "namePrivilege='" + namePrivilege + '\'' +
                "} " + super.toString();
    }
}