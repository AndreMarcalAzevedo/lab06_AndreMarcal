package gameCenter;

public class Noob extends Usuario{
	
	public Noob(String nome, String nomeLogin) throws Exception {
		super(nome, nomeLogin);
		this.desconto = 10;
		this.x2p = 0;
	}
	
	public void comprarJogo(Jogo jogo) throws Exception{
		double preco = jogo.getPreco() - (jogo.getPreco() * desconto) / 100;
		if (preco > dinheiro) {
			throw new Exception("Jogo muito caro");
		}
		dinheiro -= preco;
		lista.add(jogo);
		x2p += (10 * jogo.getPreco());
	}

	@Override
	public String toString() {
		return "Noob " + nome + " " + nomeLogin;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Noob) {
			if (((Noob) obj).getNomeLogin().equals(this.getNomeLogin())) {
				return true;
			}
		}
		return false;
	}
}
