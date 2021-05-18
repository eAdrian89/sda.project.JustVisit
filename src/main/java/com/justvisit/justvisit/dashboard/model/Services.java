package com.justvisit.justvisit.dashboard.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String serviceName;
    private String description;
    private double price;

}
