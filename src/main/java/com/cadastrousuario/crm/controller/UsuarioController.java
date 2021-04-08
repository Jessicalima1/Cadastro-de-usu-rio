package com.cadastrousuario.crm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuários")
public class UsuarioController {

	@GetMapping
	public List<Usuario> listar() {

	}
}
