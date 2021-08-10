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
package ec.edu.espe.distribuidas.examen.service;

import ec.edu.espe.distribuidas.examen.dao.PerfilRepository;
import ec.edu.espe.distribuidas.examen.dao.UsuarioPerfilRepository;
import ec.edu.espe.distribuidas.examen.dao.UsuarioRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author mikeq
 */
@Slf4j
@Service
public class UsuarioService {
       private final PerfilRepository usuarioActivoRepo;
    private final UsuarioPerfilRepository usuarioRepository;
    private final UsuarioRepository perfilUsuarioRepository;

    public UsuarioService(PerfilRepository usuarioActivoRepo, UsuarioPerfilRepository usuarioRepository, UsuarioRepository perfilUsuarioRepository) {
        this.usuarioActivoRepo = usuarioActivoRepo;
        this.usuarioRepository = usuarioRepository;
        this.perfilUsuarioRepository = perfilUsuarioRepository;
    }
    
    public List<UsuarioActivo> ListarUsuario(String estado){
    return this.usuarioActivoRepo.findByEstadoLikeACT ();
    }
}
