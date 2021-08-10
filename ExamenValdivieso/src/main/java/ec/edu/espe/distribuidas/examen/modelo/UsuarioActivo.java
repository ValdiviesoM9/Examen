/*
 * Copyright (c) 2021 mikeq.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    mikeq - initial API and implementation and/or initial documentation
 */
package ec.edu.espe.distribuidas.examen.modelo;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;

/**
 *
 * @author mikeq
 */
@Data
@Entity
@Table(name = "seg_usuario-Perfil", schema = "public", catalog = "examen_direcciones")
class UsuarioActivo {
    
    @EmbeddedId
     private UsuarioActivo pk;
    @Column(name = "estado", nullable = false, length = 100)
    private String estado;
    @Column(name = "calle_principal", nullable = false, length = 100)
    private String callePrincipal;
    @Column(name = "por_omision", nullable = false, length = 100)
    private String porOmision;
    
    @MapsId("codigoUsuario")
    @JoinColumn(name = "cod_persona",
            referencedColumnName = "cod_persona",
            nullable = false,
            insertable = false,
            updatable = false)
    @ManyToOne(optional = false)
    @ToString.Exclude
    SegUsuario segUsuario;
    
    @JoinColumn(name = "estado",
            referencedColumnName = "estado",
            nullable = false,
            insertable = false,
            updatable = false)
    @ManyToOne(optional = false)
    @ToString.Exclude
    Estado estadoAc;
    
    
}
