package br.edu.uniesp.api.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Favoritos {

    @Id
    @GeneratedValue
    private Integer id;

    private String filmeFavorito;
}
