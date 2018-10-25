package by.itacademy.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "privileges")

@NoArgsConstructor
public class Privilege extends BaseEntity {
    @Setter
    @Getter
    @Column(name = "name")
    private String namePrivilege;

    public Privilege(Long id) {
        super(id);
    }

    public Privilege(Long id, String namePrivilege) {
        super(id);
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
