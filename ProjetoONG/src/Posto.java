
public class Posto {

	private String postos;
	private String local;
	private int capacidade;
	private String tipoAlimento; // P - padrão | R - restrição

	public Posto(String unidade, String local, int capacidade, String tipoAlimento) {
		super();
		this.postos = unidade;
		this.local = local;
		this.capacidade = capacidade;
		this.tipoAlimento = tipoAlimento;
	}

	@Override
	public String toString() {
		return " - Unidade :" + postos + "\n - local=" + local + "\n - capacidade=" + capacidade + "\n - tipoAlimento="
				+ tipoAlimento;
	}

	public String getUnidade() {
		return postos;
	}

	public void setUnidade(String unidade) {
		this.postos = unidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getNome() {
		return postos;
	}

	public void setNome(String nome) {
		this.postos = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTipoAlimento() {
		return tipoAlimento;
	}

	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}
}
