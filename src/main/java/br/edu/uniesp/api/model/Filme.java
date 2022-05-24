package br.edu.uniesp.api.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Filme implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String titulo;

    @ManyToOne
    private Genero genero;
}
