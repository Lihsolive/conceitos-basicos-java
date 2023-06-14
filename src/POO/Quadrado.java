package POO;
								//BaseFigura é a classe está implementando a interface figura
public class Quadrado extends BaseFigura implements Figuras { 	// se houvesse mais interfaces, elas poderiam ser
																// implementadas também, bastava colocar a vírgula e
		Quadrado(double lado, String nome) {					// acrescentar o nome da interface. Ex.: Figura, Figura1, Figura2
				super(lado, lado, nome);
				nomeClass = "Quadrado";
		}
		public double getDiagonal() {
			return Math.sqrt(2)*lado1;
		}
}
