package com.bank.registration.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;

@Entity
@Table(name = "Email")
public class Email {
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Getter @Setter
    @Column(name = "emailValue")
    String emailValue;

    @Getter @Setter
    @Column(name = "isPrimary")
    Boolean isPrimary;

    //Foreign Key
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
