package view;

import br.edu.fateczl.fila.Fila;
import controller.OperacaoController;
import model.Cliente;

public class Principal {
	
	public static void main(String[] args) {
		
		Fila<Cliente> fila = new Fila<>();
		
		for (int i = 1; i <= 20; i++) {
			Cliente cliente = new Cliente();
			cliente.nome = "Cliente" + i;
			cliente.quantidadePecas = (int) (Math.random() * (50 - 20 + 1) + 20);
			cliente.valorPecas = (float) (Math.random() * (100.0 - 5.0 + 1) + 5.0);
			fila.insert(cliente);
		}
		
		OperacaoController operacaoController = new OperacaoController();
		operacaoController.caixa(fila);
		
	}

}
