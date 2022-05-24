package br.edu.uniesp.api.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Ator {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

    private String cidadeNascimento;

}
