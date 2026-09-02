package com.MiPetSalud.MiPetSaludApp.domain.mascota;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name="Mascota")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

//Estructura de la clase Mascota
public class MascotaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String usuarioId;

    @Column(nullable = false)
    private String nombreMascota;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private String raza;

    @Column(nullable = false)
    private LocalDate fecNacimiento;
}
