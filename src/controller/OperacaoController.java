package controller;

import br.edu.fateczl.fila.Fila;
import model.Cliente;

public class OperacaoController {
	
	public void caixa(Fila<Cliente> fila) {
		int tamanhoFila = fila.size();
		
		for (int i = 0; i < tamanhoFila; i++) {
			try {
				Cliente cliente = fila.remove();
				float total = cliente.quantidadePecas * cliente.valorPecas;
				System.out.println(String.format("Total %s: %.2f", cliente.nome, total));
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
	}

}
