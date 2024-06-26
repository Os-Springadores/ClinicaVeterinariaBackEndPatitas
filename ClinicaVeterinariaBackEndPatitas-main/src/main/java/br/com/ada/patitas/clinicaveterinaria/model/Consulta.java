package br.com.ada.patitas.clinicaveterinaria.model;


import jakarta.persistence.*;

import java.util.Date;

public class Consulta{
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY )
        private Long id;

        @ManyToOne
        @JoinColumn(name = "veterinario_id")
        private Veterinario veterinario;

        @ManyToOne
        @JoinColumn (name = "animail_id")
        private  Animal  animal;

        @Temporal(TemporalType.DATE)
        private Date data ;

        @Temporal(TemporalType.TIME)
        private  Date hora ;


    }

