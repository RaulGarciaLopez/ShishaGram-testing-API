package com.testing.shishagram.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Usuario {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 25)
    private String username;
    @Column(length = 30)
    private String realname;
    @Column(length = 25)
    private String password;
    @Column(length = 50)
    private String mail;
    @Column(length = 25)
    private String telephone;
    private String image;
}
