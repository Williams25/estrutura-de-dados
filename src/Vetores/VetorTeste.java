package Vetores;

public class VetorTeste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("aluno 1");
		Aluno a2 = new Aluno("aluno 2");
		Aluno a3 = new Aluno("aluno 3");

		Vetor vetor = new Vetor();
		vetor.adiciona(a1);
		vetor.adiciona(a2);
		vetor.adiciona(a3, 0);
		vetor.remove(0);
		Aluno x = vetor.pega(0);

		System.out
				.println(vetor + "\n" + vetor.tamanho() + "\n" + vetor.contem(a1) + "\n" + vetor.contem(a3) + "\n" + x);
	}
}
