package view;
import br.edu.fateczl.fila.*;
import controller.OperaçãoController;
import model.Cliente;
public class Main {

	public static void main(String[] args) {

		Fila<Cliente> f = new Fila<>();
		OperaçãoController op = new OperaçãoController();
		
		int qtdPeças;
		float valorPeças;
		String Cliente = "Cliente";
		
		for(int i = 0; i < 20; i++) {
			qtdPeças = (int) (Math.random()*30)+20;
			valorPeças = (float) (Math.random()*95) + 5;
			Cliente c = new Cliente(Cliente + (i+1), qtdPeças, valorPeças);
			f.insert(c);	
		}
		op.caixa(f);
	}

}
