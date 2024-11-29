package trabalhop2;

import java.util.List;

public class GerarCertificado {
    private List<Aluno> alunos; // 

    public GerarCertificado(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void gerarCertificado(String matricula) {
        Aluno alunoEncontrado = null;

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunoEncontrado = aluno;
                break;
            }
        }

        if (alunoEncontrado == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

       
        System.out.println("Certificado gerado para: " + alunoEncontrado.getNome());
        
    }
}
