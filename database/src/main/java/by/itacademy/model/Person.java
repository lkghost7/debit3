package by.itacademy.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person extends BaseEntity {

    private String name;

    private String famaly;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToOne
    @JoinColumn(name = "email_detail_id")
    private EmailDetail emailDetail;

}