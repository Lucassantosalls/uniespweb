package br.edu.uniesp.api.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Assistidos {

    @Id
    @GeneratedValue
    private Integer id;

    private  String nome;

    @ManyToOne
    private Filme filme;
}
