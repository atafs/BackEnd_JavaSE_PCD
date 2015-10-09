package OO_07Encapsulamento;

public class Jogador {

	public static void main(String[] args) {

		/* instantiate */
		Jogador j = new Jogador();
		ControlGame c = new ControlGame();

		/* use methods */
		j.jogar(5, 5, c);

	}

	/**
	 * se direito mover 5 unidades de uma vez, o esquerdo desloca -1 (logica do jogo)
	 */
	public void jogar(int direita, int esquerda, ControlGame c) {
		c.setEsquerda(esquerda);
		c.setDireita(direita);

		System.out.println("Direita:  " + c.getDireita() + "\nEsquerda: "
				+ c.getEsquerda());
	}

}
