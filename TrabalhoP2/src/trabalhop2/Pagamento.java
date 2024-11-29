package trabalhop2;

import java.time.LocalDate;

public class Pagamento {
    private String matriculaAluno;
    private double valor;
    private LocalDate dataPagamento;
    private boolean pago;

    public Pagamento(String matriculaAluno, double valor, LocalDate dataPagamento, boolean pago) {
        this.matriculaAluno = matriculaAluno;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.pago = pago;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public double getValor() {
        return valor;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public boolean isPago() {
        return pago;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
               "matriculaAluno='" + matriculaAluno + '\'' +
               ", valor=" + valor +
               ", dataPagamento=" + dataPagamento +
               ", pago=" + pago +
               '}';
    }
}
