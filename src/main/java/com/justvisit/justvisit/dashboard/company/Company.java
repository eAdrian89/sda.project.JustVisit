package com.justvisit.justvisit.dashboard.company;

import com.justvisit.justvisit.dashboard.category.Category;
import com.justvisit.justvisit.dashboard.model.Services;
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
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "logo_picture")
    private String logoPicture;

    public Company(Long id, String name, String location, String logoPicture) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.logoPicture = logoPicture;
    }

    @OneToOne
    private Category category;

    @OneToMany
    private List<Services> servicesList;

}
