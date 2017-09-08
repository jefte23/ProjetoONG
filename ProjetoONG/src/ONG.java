import java.util.ArrayList;

public class ONG {
	private String nome;
	private String administrador;
	private String estado;
	private int anoFuncacao;
	ArrayList<Unidade> unidades;

	public ONG(String nome, String administrador, String estado, int anoFuncacao, ArrayList<Unidade> unidades) {
		super();
		this.nome = nome;
		this.administrador = administrador;
		this.estado = estado;
		this.anoFuncacao = anoFuncacao;
		this.unidades = unidades;
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

	public int getAnoFuncacao() {
		return anoFuncacao;
	}

	public void setAnoFuncacao(int anoFuncacao) {
		this.anoFuncacao = anoFuncacao;
	}

	public ArrayList<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(ArrayList<Unidade> unidades) {
		this.unidades = unidades;
	}

}
