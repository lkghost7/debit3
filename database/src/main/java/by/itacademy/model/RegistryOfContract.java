package by.itacademy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "registry_of_contract")
@NoArgsConstructor
@ToString
public class RegistryOfContract extends BaseEntity {


    @Column(name = "number_of_contract")
    private String numberOfContract;

    @Column(name = "name_of_counterparty")
    private String nameOfCounterparty;

    @Column(name = "conclusion_date")
    private String conclusionDate;

    @Column(name = "validity_date")
    private String validityDate;

    @Column(name = "subject_contract")
    private String subjectContract;

    @Column(name = "amount_contract")
    private String amountContract;

    @Column(name = "executor")
    private String executor;

    @Column(name = "note")
    private String note;
}