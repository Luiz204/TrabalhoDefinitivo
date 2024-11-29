package trabalhop2;


public class Certificado {
    private Aluno aluno;
    private String curso;

    public Certificado(Aluno aluno, String curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}



	// Método para exibir informações do certificado
    public void exibirCertificado() {
        System.out.println("Certificado de " + aluno.getNome() + " para o curso " + curso);
    }
}