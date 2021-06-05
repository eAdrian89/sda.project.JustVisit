package com.justvisit.justvisit.dashboard.services;

import com.justvisit.justvisit.dashboard.booking.Booking;
import com.justvisit.justvisit.dashboard.company.Company;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table
public class Services {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "service_name")
    private String name;
    @Column(name = "service_description")
    private String description;
    @Column(name = "service_price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "services")
    private List<Booking> booking = new ArrayList<>();

}

