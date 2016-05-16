package com.fiap.persistencia.exercicio;

import java.util.Date;

import com.fiap.persistencia.dao.GenericDAO;
import com.fiap.persistencia.model.Cliente;
import com.fiap.persistencia.model.Pedido;

public class Main {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Teste3");
		cliente.setEmail("teste3@fiap.com.br");
			
		//GenericDAO<Cliente> clienteDAO = new GenericDAO<>(Cliente.class);
		//clienteDAO.adicionar(cliente);
			
		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);
		pedido.setData(new Date(System.currentTimeMillis()));
		pedido.setDescricao("Pedido de teste");
		pedido.setValor(99.90);
						
		GenericDAO<Pedido> pedidoDAO = new GenericDAO<>(Pedido.class);
		pedidoDAO.adicionar(pedido);
	}
	
}
