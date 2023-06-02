package com.kevinchege47.companyDB.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String position_Name;
    @OneToMany(mappedBy = "position",cascade = CascadeType.ALL)
    private List<Employee> employee;

}
