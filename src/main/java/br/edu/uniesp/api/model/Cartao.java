package br.edu.uniesp.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class Cartao {

    @Id
    @GeneratedValue
    private Integer id;

    private String numeroCartao;

    private LocalDate validade;

    private String cvv;

    @JsonIgnore
    @OneToOne(mappedBy = "cartao")
    private Usuario usuario;
}
