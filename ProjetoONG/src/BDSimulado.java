import java.util.ArrayList;

public class BDSimulado {

	ArrayList<ONG> organizacoes;
	ArrayList<Unidade> unidades;

	public BDSimulado() {

		// instanciar o atributo ONG
		this.organizacoes = new ArrayList<ONG>();

		// this.unidades = new ArrayList<Unidade>();

		// instanciar Objetos
		ONG ong1 = new ONG("Fome Zero", "luiz Junior", "Pernambuco", 2007, unidades);
		ONG ong2 = new ONG("Novo inicio", "João Paulo", "Minas Gerais", 2003, unidades);
		ONG ong3 = new ONG("Comendo Bem", "Azterix", "Rio de Janeiro", 2012, unidades);
		ONG ong4 = new ONG("Comer de novo", "Rodrigo Alves", "São Paulo", 1997, unidades);
		ONG ong5 = new ONG("Chance de comer", "Antonio Lopes", "Brasilia", 2004, unidades);
		ONG ong6 = new ONG("Satisfação", "Leonardo Pereira", "Parana", 2005, unidades);

		// colocando ONGs na Lista
		this.organizacoes.add(ong1);
		this.organizacoes.add(ong2);
		this.organizacoes.add(ong3);
		this.organizacoes.add(ong4);
		this.organizacoes.add(ong5);
		this.organizacoes.add(ong6);
	}

	// Metodo que busca informações pelo nome
	public ArrayList<ONG> getinfoONG(String nome) {

		ArrayList<ONG> resultado = new ArrayList<>();

		// Percorrendo lista de ONG's
		for (int i = 0; i < organizacoes.size(); i++) {
			if (this.organizacoes.get(i).equals(nome)) {
				resultado.add(this.organizacoes.get(i));
			}
		}
		return resultado;
	}

	// Metodo que retorna numero de ONG's por estado

}
