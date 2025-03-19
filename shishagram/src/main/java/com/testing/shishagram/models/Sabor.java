package com.testing.shishagram.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
public class Sabor {

    @Id
    @EqualsAndHashCode.Include
    @Column(length = 25)
    private String name;
    private List<String> ingredients;
    private float rating;
    @Enumerated(EnumType.STRING)
    private CategoriaSabor category;
    private String image;
}
