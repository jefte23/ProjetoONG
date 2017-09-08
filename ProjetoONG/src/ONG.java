import java.util.ArrayList;

public class ONG {
	private String nome;
	private String administrador;
	private String estado;
	private String anoFuncacao;
	ArrayList<Unidade> unidades;

	public ONG(String nome, String administrador, String estado, String anoFuncacao, ArrayList<Unidade> unidades) {
		super();
		this.nome = nome;
		this.administrador = administrador;
		this.estado = estado;
		this.anoFuncacao = anoFuncacao;
		this.unidades = unidades;
	}

	@Override
	public String toString() {
		return " - ONG : " + nome + "\n - administrador=" + administrador + "\n - estado=" + estado
				+ "\n - anoFuncacao=" + anoFuncacao + "\n - unidades=" + unidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAdministrador() {
		return administrador;
	}

	public void setAdministrador(String administrador) {
		this.administrador = administrador;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAnoFuncacao() {
		return anoFuncacao;
	}

	public void setAnoFuncacao(String anoFuncacao) {
		this.anoFuncacao = anoFuncacao;
	}

	public ArrayList<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(ArrayList<Unidade> unidades) {
		this.unidades = unidades;
	}

}
