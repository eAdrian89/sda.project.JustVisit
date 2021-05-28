package com.justvisit.justvisit.dashboard.services;

import com.justvisit.justvisit.dashboard.company.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
@Table
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "service_name")
    private String name;
    @Column(name = "service_description")
    private String description;
    @Column(name = "service_price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}

