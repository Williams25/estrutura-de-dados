package Vetores;

public class Aluno {

	private String nome;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Aluno aluno = (Aluno) obj;
		return aluno.getNome().equals(this.nome);
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
