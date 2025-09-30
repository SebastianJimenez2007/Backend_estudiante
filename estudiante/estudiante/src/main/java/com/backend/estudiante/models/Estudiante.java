package com.backend.estudiante.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "estudiantes")
@Data //getters setters constructors hascode
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(name = "codigo_estudiantil",nullable = false, unique = true, length = 10)
    private String codigoEstudiantil;

    @Column(
        name = "horas_acomuladas",
        nullable = false
    )
    private Integer horasAcomuladas;

    @Column(
            nullable = false,
            length = 10
    )
    private String programaAcademico;

    @Column(nullable = false)
    private String semestre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoEstudiante estado = EstadoEstudiante.ACTIVO;

    /*
    public String getNombreCompleto(){
        return usuario.getNombre();
    }

     */
}
