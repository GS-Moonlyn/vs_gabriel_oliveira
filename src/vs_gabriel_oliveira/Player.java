package vs_gabriel_oliveira;

public class Player extends Thread {
	
	private String nome;
	private Player adv1;
	private Player adv2;
	
	public Player(String nome, Player adv1, Player adv2){
		this.nome = nome;
		this.adv1 = adv1;
		this.adv2 = adv2;
	}
	
	public enum Gesto{
		PEDRA,
		PAPEL,
		TESOURA;
		
		static {
			PEDRA.ganhaDe = TESOURA;
			PAPEL.ganhaDe = PEDRA;
			TESOURA.ganhaDe = PAPEL;
		}
		
		private Gesto ganhaDe;
		
		public Resultado comparar(Gesto gesto) {
			if(ganhaDe.equals(gesto)) {
				return Resultado.GANHOU;
			} else {
				return Resultado.PERDEU;
			}
		}
	}
	
	public enum Resultado{
		GANHOU(1),
		PERDEU(-1);
		
		private int pontos;
		private Resultado(int pontos) {
			this.pontos = pontos;
		}
		
		public int getPontos() {
			return this.pontos;
		}
	}
	
	public void run() {
		
	};
}
