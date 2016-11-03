package v1;

import junit.framework.Assert;

public class Testes {

	public void exemplo() {
		Pessoa p1 = new Pessoa("Fulano", false, false);
		Pessoa p2 = new Pessoa("Ciclana", false, false);
		Pessoa p3 = new Pessoa("Beltrana", false, false);

		Fila f = new Fila();

		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);

		Pessoa proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Fulano");

		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Ciclana");

		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Beltrana");

		f.removePessoa(proximo);
	}

	public void testeGravida() {
		
		Fila f = new Fila();
		Pessoa p1 = new Pessoa("Andrea", false, false);
		Pessoa p2 = new Pessoa("Carla", true, false);
				
		f.addPessoa(p1);
		f.addPessoa(p2);
				
		Pessoa proximo = f.proximoFila();
		Assert.assertEquals(proximo.getNome(), "Carla");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Andrea");
		
	
	}
	
	public void testeProblema(){
		//gravida vem primeiro e idoso depois na prioridade.
		Pessoa p1 = new Pessoa("Fulano", false, true);
		Pessoa p2 = new Pessoa("Ciclana", true, false);
		Pessoa p3 = new Pessoa("Beltrana", false, false);

		Fila f = new Fila();

		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);

		Pessoa proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Ciclana");

		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Fulano");

		f.removePessoa(proximo);
		proximo = f.proximoFila();

		Assert.assertEquals(proximo.getNome(), "Beltrana");

		f.removePessoa(proximo);
		
	}
}
