package com.cmancode.thsmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmancode.thsmvc.dao.IClienteDao;
import com.cmancode.thsmvc.exeptions.InstanceNotFoundException;
import com.cmancode.thsmvc.model.Cliente;

@Service("clienteService")
public class ClienteServiceImpl implements IClienteService{

	
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	public List<Cliente> clientes() {
		List<Cliente> clientes = null;
		try {
			clientes = clienteDao.findAll();
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientes;
	}

}
