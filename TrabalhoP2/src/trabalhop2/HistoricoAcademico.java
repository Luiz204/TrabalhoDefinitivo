package trabalhop2;

import java.util.ArrayList;
import java.util.List;

public class HistoricoAcademico {
    private List<Cursoenota> cursoenotas;

    public HistoricoAcademico() {
        this.cursoenotas = new ArrayList<>();
    }

    // Adicionar um curso ao histórico
    public void adicionarCurso(Curso curso, double nota) {
        cursoenotas.add(new Cursoenota(curso, nota));
    }

    // Exibir o histórico completo
    public void exibirHistorico() {
        System.out.println("=== Histórico Acadêmico ===");
        for (Cursoenota cursoComNota : cursoenotas) {
            System.out.println("Curso: " + cursoComNota.getCurso().getNome() + 
                               " | Nota: " + cursoComNota.getNota());
        }
    }

    // Calcular a média geral
    public double calcularMedia() {
        if (cursoenotas.isEmpty()) {
            return 0;
        }

        double soma = 0;
        for (Cursoenota cursoComNota : cursoenotas) {
            soma += cursoComNota.getNota();
        }
        return soma / cursoenotas.size();
    }
}
