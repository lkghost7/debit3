package by.itacademy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "system_user")
@NoArgsConstructor
@ToString
public class SystemUser extends BaseEntity {

    @Column(name = "name")
    private String nameUser;

    @Column(name = "family")
    private String familyUser;

    @NotEmpty
    @Column(name = "e_mail", nullable = false)
    private String email;

    @NotEmpty
    @Column(name = "password", nullable = false)
    private String passwordUser;

    @JoinTable(name = "users_privilege",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "privilege_id"))
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Privilege> privilege = new HashSet<>();

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "country", column = @Column(name = "home_region_country")),
            @AttributeOverride(name = "city", column = @Column(name = "home_region_City"))
    })
    private Address firstAddress;

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