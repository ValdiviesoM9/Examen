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
package ec.edu.espe.distribuidas.examen.controller;

import ec.edu.espe.distribuidas.examen.service.UsuarioService;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import ec.edu.espe.distribuidas.examen.model.UsuarioActivo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mikeq
 */
@RestController
@RequestMapping("/v1/usuarioActivo")
@Slf4j
public class PersonaEstadoController {
    
    private final UsuarioService service;

    public PersonaEstadoController(UsuarioService service) {
        this.service = service;
    }
    
    @GetMapping(value = "{codigoUsuario}")
    @ApiOperation(value = "Lista personas activas")
    public ResponseEntity obtenerDireccionesDePersona(@PathVariable("codigoPersona") Integer codigoPersona) {
       

