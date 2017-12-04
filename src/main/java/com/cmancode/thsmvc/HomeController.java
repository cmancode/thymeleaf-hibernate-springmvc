package com.cmancode.thsmvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cmancode.thsmvc.model.Cliente;
import com.cmancode.thsmvc.service.IClienteService;


@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("clienteService")
	private IClienteService clienteService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listClient(Model model) {
		List<Cliente> clientes = null;
		clientes = clienteService.clientes();
		model.addAttribute("listClientes", clientes);
		return "home";
	}
	
}
