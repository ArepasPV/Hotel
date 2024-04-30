package com.explorenest.hotel.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Hotel {
    @Id
    private Integer id;
    private String name;
    private String address;
    private String phone;
    private String image;
}
