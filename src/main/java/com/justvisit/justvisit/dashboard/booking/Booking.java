package com.justvisit.justvisit.dashboard.booking;


import com.justvisit.justvisit.dashboard.company.Company;
import com.justvisit.justvisit.dashboard.services.Services;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "createdAt")
    private Date createdAt;
    @Column(name = "bookedAt")
    private Date bookedAt;


    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Services.class)
    @JoinColumn(name="service_id", nullable = false)
    private Services services;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Company.class)
    @JoinColumn(name="company_id", nullable = false)
    private Company company;

    //TODO Add of users after implementation of user respository
   // @OneToMany(targetEntity = Users.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //private List<Users> usersList;

}
