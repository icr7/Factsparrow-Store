package com.factsparrow.ecommerce.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userId;
    String email;
    String password;
    String name;
    String mobileNo;
    String address;
    String photo;

    @OneToMany(mappedBy = "user")
    @JsonBackReference
    List<Product> products;
}
