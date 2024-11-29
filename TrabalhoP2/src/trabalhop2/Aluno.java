package trabalhop2;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Aluno {
    private String nome;
    private String matricula;
    private boolean isVIP;
    private List<Cursoenota> historico = new ArrayList<>();
    
    public Aluno(String nome, String matricula, boolean isVIP) {
        this.nome = nome;
        this.matricula = matricula;
        this.isVIP = isVIP;
        this.historico = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public void setVIP(boolean isVIP) {
		this.isVIP = isVIP;
	}

	public String getMatricula() {
        return matricula;
    }

    public boolean isVIP() {
        return isVIP;
    }
    
    public List<Cursoenota> getHistorico() {
        return historico;
    }
    
    public void adicionarCurso(String nomeCurso, double nota, LocalDate dataConclusao) {
        historico.add(new Cursoenota(nomeCurso, nota, dataConclusao));
    }
}
