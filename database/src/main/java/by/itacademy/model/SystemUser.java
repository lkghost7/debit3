package by.itacademy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "system_users")
@NoArgsConstructor
@ToString
public class SystemUser extends BaseEntity {
    @Getter
    @Setter
    @Column(name = "name")
    private String nameUser;

    @Getter
    @Setter
    @Column(name = "family")
    private String familyUser;

    @NotEmpty
    @Getter
    @Setter
    @Column(name = "e_mail", nullable=false)
    private String email;

    @NotEmpty
    @Getter
    @Setter
    @Column(name = "password", nullable=false)
    private String passwordUser;

    @Getter
    @Setter
    @JoinTable(name = "users_privileges",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "privilege_id"))
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Privilege> privilege = new HashSet<>();

    @Getter
    @Setter
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Getter
    @Setter
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "home_region_country")),
            @AttributeOverride(name = "city", column = @Column(name = "home_region_City"))
    })
    private Address firstAddress;

    @Getter
    @Setter
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "payment_country")),
            @AttributeOverride(name = "city", column = @Column(name = "payment_city"))
    })
    private Address secondAddress;

    public SystemUser(@NotEmpty String email, @NotEmpty String passwordUser, Set<Privilege> privilege) {
        this.email = email;
        this.passwordUser = passwordUser;
        this.privilege = privilege;
    }

}
