package exerciciosAula05;

import java.util.Scanner;

public class exercicio_02testeNave {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a velocidade da partida do Avi�o: ");
		int acel = sc.nextInt();
		
		System.out.println("Digite ap�s partida: ");
		int frear = sc.nextInt();
		
		//Estanciando Objeto || Criando Objetos
		
		exercicio_02nave nave1 = new exercicio_02nave();
		exercicio_02nave nave2 = new exercicio_02nave();
		
		System.out.println("\n");
		
		nave1.empresa = "Boeing";
		nave1.modelo = "Boeing 777-200ER";
		nave1.tempodeUso = "20 anos";
		nave1.Velocidade = 0;
		
		nave2.empresa = "Airbus";
		nave2.modelo = "Airbus A380";
		nave2.tempodeUso = "15 anos";
		nave2.Velocidade = 0;
		
		//Primeiro Avi�o
		
		System.out.println("Empresa: " + nave1.empresa);
		System.out.println("Modelo: " + nave1.modelo);
		System.out.println("Velocidade: " + nave1.Velocidade);
		
		nave1.correr(acel);
		System.out.println("Velocidade: " + nave1.Velocidade);
		
		nave1.frear(frear);
		
		System.out.println("Velocidade ap�s planar: " + nave1.Velocidade);
		
		// Segundo Avi�o
		
		System.out.println("\n\nEmpresa: " + nave2.empresa);
		System.out.println("Modelo: " + nave2.modelo);
		System.out.println("Velocidade: " + nave2.Velocidade);
		
		nave2.correr(acel);
		System.out.println("Velocidade: " + nave2.Velocidade);
		
		nave2.frear(frear);
		
		System.out.println("Velocidade ap�s planar: " + nave2.Velocidade);

		
		
	}

}
