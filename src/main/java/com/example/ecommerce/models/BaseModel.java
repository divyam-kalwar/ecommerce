package com.example.ecommerce.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
//@MappedSuperclass
public class BaseModel {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @CreationTimestamp
    private Date createdAt;
//    @UpdateTimestamp
    private Date updatedAt;
    // for soft delete of a product we have status which denotes that the product is marked deleted.
    private State state;

}
