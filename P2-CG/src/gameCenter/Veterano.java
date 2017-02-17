package gameCenter;

public class Veterano extends Usuario{
		
	public Veterano(String nome, String nomeLogin) throws Exception{
		super(nome, nomeLogin);
		this.desconto = 20;
		this.x2p = 1000;
	}
	
	public void comprarJogo(Jogo jogo) throws Exception{
		double preco = jogo.getPreco() - (jogo.getPreco() * desconto) / 100;
		if (preco > dinheiro) {
			throw new Exception("Jogo muito caro");
		}
		dinheiro -= preco;
		lista.add(jogo);
		x2p += (15 * jogo.getPreco());
	}
	
	@Override
	public String toString() {
		return "Veterano " + nome + " " + nomeLogin;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Veterano) {
			if (((Veterano) obj).getNomeLogin().equals(this.getNomeLogin())) {
				return true;
			}
		}
		return false;
	}
}
