package controller;

import br.edu.fateczl.fila.Fila;
import model.Cliente;

public class OperaçãoController {

	public void caixa(Fila<Cliente> fila) {
		
		Cliente c = new Cliente();
		
		if(fila.isEmpty()) {
			System.out.println("Fila vazia");
		}
		else {
			while(!fila.isEmpty()) {
				try {
					c = fila.remove();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(c.nome + "\nvalor dos gastos: "+(c.qtdPeças * c.valorPeças));
			}
		}
	}
	
}
