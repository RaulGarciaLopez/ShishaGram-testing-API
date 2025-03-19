package com.testing.shishagram.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @Enumerated(EnumType.STRING)
    private TipoDireccion type;
    @Column(length = 25)
    private String name;
    @Column(length = 5)
    private String number;
    @Column(length = 25)
    private String city;
    @Column(length = 5)
    private String cp;
    @Column(length = 25)
    private String country;

}
