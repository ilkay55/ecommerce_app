package com.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


}
