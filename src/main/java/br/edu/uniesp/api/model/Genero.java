package br.edu.uniesp.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
public class Genero {

    @Id
    @GeneratedValue
    private Integer id;

    private  String nome;

    @JsonIgnore
    @OneToMany (mappedBy = "genero")
    private Set<Filme> listarFilme;


}
