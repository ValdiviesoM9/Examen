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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author mikeq
 */
@Data
@Entity
@Table(name = "seg_perfil", schema = "public", catalog = "examen_direcciones")
public class Estado {
    
    @Id
    @Column(name = "cod_perfil")
    private String codPerfil;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "estado")
    private String estado;
    
    
    
}
