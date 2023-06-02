package com.kevinchege47.companyDB.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String name;
    private String email;
    @ManyToOne(optional = false)
    @JoinColumn(name = "position_id",nullable = false,referencedColumnName = "id")
    private Position position;

}
