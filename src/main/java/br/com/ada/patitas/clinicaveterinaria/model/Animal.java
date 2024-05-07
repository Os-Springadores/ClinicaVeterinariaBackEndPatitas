package br.com.ada.patitas.clinicaveterinaria.model;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private int tipo;
}
