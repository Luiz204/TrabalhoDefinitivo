package trabalhop2;

import java.time.LocalDate;

public class Cursoenota {
    private Curso curso;
    private double nota;
    private LocalDate dataConclusao;
    
    public Cursoenota(Curso curso, double nota) {
        this.curso = curso;
        this.nota = nota;
        this.dataConclusao = dataConclusao;
    }

    public Cursoenota(String nomeCurso, double nota2, LocalDate dataConclusao2) {
		// TODO Auto-generated constructor stub
	}

	public Curso getCurso() {
        return curso;
    }

    public double getNota() {
        return nota;
    }


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}
    
	 public LocalDate getDataConclusao() {
	        return dataConclusao;
	    }

	public void setDataConclusao(LocalDate dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	
	@Override
    public String toString() {
        return "Curso: " + curso + ", Nota: " + nota + ", Concluído em: " + dataConclusao;
    }
	 
	}
