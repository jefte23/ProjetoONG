
public class Unidade {

	private String unidades;
	private String local;
	private String capacidade;
	private String tipoAlimento; // P - padrão | R - restrição

	public Unidade(String unidade, String local, String capacidade, String tipoAlimento) {
		super();
		this.unidades = unidade;
		this.local = local;
		this.capacidade = capacidade;
		this.tipoAlimento = tipoAlimento;
	}

	@Override
	public String toString() {
		return " - Unidade :" + unidades + "\n - local=" + local + "\n - capacidade=" + capacidade
				+ "\n - tipoAlimento=" + tipoAlimento;
	}

	public String getUnidade() {
		return unidades;
	}

	public void setUnidade(String unidade) {
		this.unidades = unidade;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

	public String getNome() {
		return unidades;
	}

	public void setNome(String nome) {
		this.unidades = nome;
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
