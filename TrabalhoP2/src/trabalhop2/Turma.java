package trabalhop2;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private List<Aluno> alunos;

    public Turma(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    
	public List<Aluno> getAlunos() {
		return alunos;
	}


	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getNome() {
        return nome; 
    }

    
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

   
}
