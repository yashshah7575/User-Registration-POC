package com.bank.registration.entity;

import com.bank.registration.constants.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Getter @Setter
    @Column(name = "userName")
    String userName;

    @Getter @Setter
    @Column(name = "jobDescription")
    String jobDescription;

    @Getter @Setter
    @Column(name = "businessUnit")
    String businessUnit;

    @Getter @Setter
    @Column(name = "createdDate")
    Date createdDate;

    @Getter @Setter
    @Column(name = "updatedDate")
    Date updatedDate;

    @Getter @Setter
    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    Status status;

    //ForeignKey
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public List<Email> email;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public List<Phone> phone;

    //Company - id. name
    //Status - enum
    //Permission
    //Role
}
