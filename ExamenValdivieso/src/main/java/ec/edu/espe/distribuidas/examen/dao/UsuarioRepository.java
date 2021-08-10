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
package ec.edu.espe.distribuidas.examen.dao;

import ec.edu.espe.distribuidas.examen.modelo.SegUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author mikeq
 */
public interface UsuarioRepository extends JpaRepository<SegUsuario, Integer> {
    
}
