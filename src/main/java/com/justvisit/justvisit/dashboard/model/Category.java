package com.justvisit.justvisit.dashboard.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "icon")
    private String icon;
    @Column(name = "pictureurl")
    private String pictureUrl;

    public Category(int id, String name, String description, String icon, String pictureUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.pictureUrl = pictureUrl;
    }

    @OneToMany
    private List<Company> companyList;

    public List<Company> getCompanyList() {
        return companyList;
    }
}
