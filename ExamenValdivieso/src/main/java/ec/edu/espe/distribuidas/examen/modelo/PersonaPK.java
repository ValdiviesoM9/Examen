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

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;

/**
 *
 * @author mikeq
 */
@Data
@Embeddable
public class PersonaPK implements Serializable {
    @Column(name = "cod_usuario")
    private Integer codigoUsuario;
    @Column(name = "sec_usuario_perfil")
    private Integer secPersonaDireccion;
    @Column(name = "cod_persona")
    private Integer codigoPersona;
    @Column(name = "cod_perfil")
    private Integer codPerfil;
}
