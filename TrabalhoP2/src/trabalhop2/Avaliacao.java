package trabalhop2;

public class Avaliacao {
    private String nome;
    private double nota;

    public Avaliacao(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getNota() {
        return nota;
    }
}