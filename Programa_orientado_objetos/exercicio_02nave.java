package exerciciosAula05;

public class exercicio_02nave {
	
	
	String modelo;
	String empresa;
	int Velocidade;
	String tempodeUso;
	
	void correr(int correndo) {
		Velocidade = Velocidade + correndo;
	}
	void frear(int reduzir) {
		Velocidade = Velocidade - reduzir;
	}

}
