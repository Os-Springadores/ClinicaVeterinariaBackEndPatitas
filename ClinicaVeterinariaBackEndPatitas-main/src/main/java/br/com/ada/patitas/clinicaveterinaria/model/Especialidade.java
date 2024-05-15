package br.com.ada.patitas.clinicaveterinaria.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public enum Especialidade {

    CARDIOLOGIA, CIRURGIA, DERMATOLOGIA, ACUPUNTURA, HOMEOPATIA, ENDOCRINOLOGIA
}
