package com.cadastrousuario.crm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastrousuario.crm.model.Usuario;

@RestController
@RequestMapping("/usuários")
public class UsuarioController {

	@GetMapping
	public List<Usuario> listar() {

	}
}
