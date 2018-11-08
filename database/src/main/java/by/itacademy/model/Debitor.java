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
@Table(name = "debitor")
@NoArgsConstructor
@ToString
public class Debitor extends BaseEntity {

    @Column(name = "subdivisions")
    private String subdivisions;

    @Column(name = "debitor")
    private String debitor;

    @Column(name = "date_of_occurrence")
    private String dateOfOccurrence;

    @Column(name = "principal_amount")
    private String principalAmount;

    @Column(name = " sent_date")
    private String sentDate;

    @Column(name = " amount_claimed")
    private String amountClaimed;

    @Column(name = " date_of_debit")
    private String date_of_debit;

    @Column(name = " redemption_amount")
    private String redemptionAmount;

    @Column(name = " balance_owed")
    private String balanceOwed;

    @Column(name = " redemption_measures")
    private String redemptionMeasures;

}