package com.bank.registration.entity;

import com.bank.registration.constants.PhoneType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Phone")
public class Phone {
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Getter @Setter
    @Column(name = "phoneNumber")
    String phoneNumber;

    @Getter @Setter
    @Column(name = "isPrimary")
    Boolean isPrimary;

    @Getter @Setter
    @Column(name = "phoneType")
    @Enumerated(EnumType.ORDINAL)
    PhoneType phoneType;

    //Foreign Key
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
