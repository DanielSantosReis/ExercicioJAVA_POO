package exerciciosAula05;

public class exercicio_01testeCliente {

	public static void main(String[] args) {
		
						//estanciando o objeto || criando o objeto
		
		exercicio_01cliente c1 = new exercicio_01cliente();
		
		exercicio_01cliente c2 = new exercicio_01cliente();
			
			c1.nome  = "Daniel";
			c1.segundonome = "da Hora";
			c1.idade = 23;
			
			c2.nome  = "Valéria";
			c2.segundonome = "Reis";
			c2.idade = 34;
			
			System.out.println("Nome do Cliente: " + c1.nome);
			System.out.println("Sobrenome do Cliente: " + c1.segundonome);
			System.out.println("Idade do Cliente: " + c1.idade);
			c1.produto();
			c1.analisando();
			
			
			System.out.println("\n");
			
			System.out.println("Nome do Cliente: " + c2.nome);
			System.out.println("Sobrenome do Cliente: " + c2.segundonome);
			System.out.println("Idade do Cliente: " + c2.idade);
			c2.produto();
			c2.analisando();
	}

}
