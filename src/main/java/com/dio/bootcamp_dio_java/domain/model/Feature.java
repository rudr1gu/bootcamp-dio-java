package com.dio.bootcamp_dio_java.domain.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Feature {

    private Long id;
    private String icon;
    private String description;
}
