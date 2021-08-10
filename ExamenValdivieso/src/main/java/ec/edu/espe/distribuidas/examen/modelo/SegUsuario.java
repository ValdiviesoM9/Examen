/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.examen.modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author mikeq
 */
@Data
@Entity
@Table(name = "seg_usuario", schema = "public", catalog = "examen_direcciones")
public class SegUsuario {
    @Id
      @Column(name = "cod_usuario",
            nullable = false)
    private String codigo;
    @Column(name = "nombre",
            nullable = false,
            length = 150)
    private String nombre;
    @Column(name = "identificacion",
            nullable = false,
            length = 30)
    private String identificacion;
    @Column(name = "email",
            nullable = false,
            length = 150)
    private String email;
    @Column(name = "nro_intentos_fallidos",
            nullable = false,
            length = 5)
    private Integer nro_intentos_fallidos;
    @Temporal(TemporalType.DATE)
    private Date fecha_ultima_modificacion;
    
    @OneToMany(mappedBy = "segUsuario", cascade = CascadeType.ALL)
    private List<UsuarioActivo> direcciones;
}
