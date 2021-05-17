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
    private String name;
    private String location;
    private String logoPicture;

    @OneToOne
    private Category category;

    @OneToMany
    private List<Services> servicesList;

}
