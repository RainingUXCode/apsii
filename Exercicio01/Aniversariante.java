package Exercicio01;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;
	
	
	//Questão 01
	public boolean equals(Object outroAniversariante) {
		if (outroAniversariante instanceof Aniversariante) {
			Aniversariante outroNomeAniversariante = (Aniversariante) outroAniversariante;
	        return this.nome.equals(outroNomeAniversariante.nome) && this.dataAniversario.equals(outroNomeAniversariante.dataAniversario);
		}
		  return false;
	}

	// Questão 02
	public Aniversariante(String nome, int dia, int mes){
		this.nome = nome;
		this.dataAniversario = new DataAniversario (dia, mes);
		}
	
	public Aniversariante(String nome, DataAniversario dataAniversario) {
	    this.nome = nome;
	    this.dataAniversario = dataAniversario;
	}
	
	// Questão 03 - Puxando da nova Classe MinhaAgendaDeAniversarios
	public String getNome() {
	    return nome;
	}

	public DataAniversario getDataAniversario() {
	    return dataAniversario;
	}
}
