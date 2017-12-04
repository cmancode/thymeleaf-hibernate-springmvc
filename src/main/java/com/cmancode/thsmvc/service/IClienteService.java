package com.cmancode.thsmvc.service;

import java.util.List;

import com.cmancode.thsmvc.model.Cliente;

public interface IClienteService {
	
	/**
	 * Por lo pronto solo se creará este método, pero aquí irán todos los métodos que 
	 * necesiten para acceder a los datos mediante los DAO's 
	 */
	public List<Cliente> clientes ();
	
}
