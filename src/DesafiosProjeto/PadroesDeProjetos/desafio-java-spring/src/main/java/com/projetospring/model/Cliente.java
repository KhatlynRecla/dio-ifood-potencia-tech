package com.projetospring.model;
//import jakarta.persistence.Entity;
import lombok.Data;
import javax.annotation.processing.Generated;
import javax.persistence.*;
@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    private Endereco endereco;
}
