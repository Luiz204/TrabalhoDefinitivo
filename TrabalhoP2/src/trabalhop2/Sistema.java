package trabalhop2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;

public class Sistema {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	private List<Turma> turmas = new ArrayList<Turma>();
	private List<Pagamento> pagamentos = new ArrayList<>();
	
	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Menu:");
			System.out.println("1. Cadastrar Aluno");
			System.out.println("2. Cadastrar Turma");
			System.out.println("3. Adicionar Aluno a Turma");
			System.out.println("4. Adicionar Curso ao Historico");
			System.out.println("5. Mostrar Histórico Acadêmico");
			System.out.println("6. Emissão de certificados e histórico de cursos");
			System.out.println("7. Mostrar Histórico Completo");		
			System.out.println("8. Suporte e acesso prioritário para VIPs");
			System.out.println("9. Controle de pagamentos e relatórios financeiros");
			System.out.println("10. Sair");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer

			switch (opcao) {
			case 1:
				cadastroAlunos(scanner);
				break;
			case 2:
				cadastroTurma(scanner);
				break;
			case 3:
				cadastroAlunoTurma(scanner);
				break;
			case 4:				
				adicionarCursoAoHistorico(scanner);
				    break;				
			case 5:
				mostrarHistorico(scanner);
				break;
			case 6:
				emissaodeCertificados(scanner);
				break;
			case 7:
			    mostrarHistorico(scanner);
			    break;
			case 8:
				suporteVIP(scanner);
				break;
			case 9:
				PagamentosERelatorios(scanner);
				break;
			case 10:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 9);

		scanner.close(); // Fechar o scanner
	}

	private void cadastroAlunos(Scanner scanner) {
		// Implementação do cadastro de alunos
		System.out.println("Cadastrar alunos");
		System.out.println("Informe o nome do aluno");
		String nome = scanner.nextLine();
		System.out.println("Informe a matricula do aluno");
		String matricula = scanner.nextLine();
		System.out.println("Informe 1 para o aluno VIP e 0 para aluno normal");
		int vip = scanner.nextInt();
		boolean valorVip = false;
		if (vip == 1) {
			valorVip = true;
		}
		alunos.add(new Aluno(nome, matricula, valorVip));
		menu();

	}

	private void cadastroTurma(Scanner scanner) {
		// Implementação do cadastro de turmas
		System.out.println("Cadastrar turma");
		System.out.println("Informe o nome da turma");
		String turma = scanner.nextLine();
		turmas.add(new Turma(turma));
		menu();

	}

	private void cadastroAlunoTurma(Scanner scanner) {

		System.out.println("Cadastrar aluno na turma");
		System.out.println("Informe o nome da turma");
		String turma = scanner.nextLine();
		for (int i = 0; i < turmas.size(); i++) {
			if (turmas.get(i).getNome().equals(turma)) {
				Turma turmaRecuperada = turmas.get(i);
				System.out.println("Informe a matricula do aluno para cadastrar na turma");
				String aluno = scanner.nextLine();
				for (int j = 0; j < alunos.size(); j++) {
					if (alunos.get(j).getMatricula().equals(aluno)) {
						Aluno alunoRecuperado = alunos.get(j);
						turmaRecuperada.setAlunos(Arrays.asList(alunoRecuperado));
						break;
					} else {
						System.out.println("Aluno nao encontrado");
					}

				}
				break;
			} else {
				System.out.println("Turma nao encontrada");
			}
		}
		menu();
	}

	

	private void suporteVIP(Scanner scanner) {

		System.out.println("Suporte e acesso prioritário para VIPs.");

		System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a matricula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.println("Olá, aqui é o suporte vip em que podemos ajudar? ");
        
        for (Aluno aluno : alunos){

            if (aluno.getNome().equals(nome) && aluno.getMatricula().equals(matricula)){
            System.out.println(aluno.getNome());
            System.out.println(aluno.getMatricula());
            return;
            }
        }
        System.out.println("Aluno não encontrado!");
		
	}

	  private void mostrarHistorico(Scanner scanner) {
		  System.out.println("Consultar Histórico Completo:");
		    System.out.print("Digite a matrícula do aluno: ");
		    String matricula = scanner.nextLine();

		    Aluno aluno = encontrarAluno(matricula);
		    if (aluno == null) {
		        System.out.println("Aluno não encontrado.");
		        return;
		    }

		    System.out.println("Histórico Acadêmico de " + aluno.getNome() + " (" + aluno.getMatricula() + "):");
		    List<Cursoenota> historico = aluno.getHistorico();
		    if (historico.isEmpty()) {
		        System.out.println("Nenhum curso concluído.");
		    } else {
		        for (Cursoenota cursoNota : historico) {
		            System.out.println(cursoNota);
		        }
		    }
		}
	        
	  private void adicionarCursoAoHistorico(Scanner scanner) {
		    System.out.println("Adicionar curso ao histórico:");
		    System.out.print("Digite a matrícula do aluno: ");
		    String matricula = scanner.nextLine();

		    Aluno aluno = encontrarAluno(matricula);
		    if (aluno == null) {
		        System.out.println("Aluno não encontrado.");
		        return;
		    }

		    System.out.print("Digite o nome do curso: ");
		    String nomeCurso = scanner.nextLine();
		    System.out.print("Digite a nota do aluno: ");
		    double nota = scanner.nextDouble();
		    scanner.nextLine(); // Limpar buffer

		    aluno.adicionarCurso(nomeCurso, nota, LocalDate.now());
		    System.out.println("Curso adicionado com sucesso ao histórico de " + aluno.getNome());
		}
	  
	  private Aluno encontrarAluno(String matricula) {
		    for (Aluno aluno : alunos) {
		        if (aluno.getMatricula().equals(matricula)) {
		            return aluno;
		        }
		    }
		    return null;
		}
	  
	  
	private void emissaodeCertificados(Scanner scanner) {

		System.out.println("Emitir certificados");

			        
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a matricula do aluno: ");
        String matricula = scanner.nextLine();

        System.out.println("Certificado foi emitido com sucesso!");
        
        for (Aluno aluno : alunos){

            if (aluno.getNome().equals(nome) && aluno.getMatricula().equals(matricula)){
            System.out.println(aluno.getNome());
            System.out.println(aluno.getMatricula());
            return;
            }
        }
        System.out.println("Aluno não encontrado!");
       
    }
		
		

	private void PagamentosERelatorios(Scanner scanner) {
		int opcao;

	    do {
	        System.out.println("Controle de Pagamentos e Relatórios Financeiros:");
	        System.out.println("1. Registrar Pagamento");
	        System.out.println("2. Consultar Pagamentos");
	        System.out.println("3. Gerar Relatório Financeiro");
	        System.out.println("4. Voltar ao Menu Principal");

	        opcao = scanner.nextInt();
	        scanner.nextLine(); // Limpa o buffer

	        switch (opcao) {
	            case 1:
	                registrarPagamento(scanner);
	                break;
	            case 2:
	                consultarPagamentos(scanner);
	                break;
	            case 3:
	                gerarRelatorioFinanceiro();
	                break;
	            case 4:
	                System.out.println("Voltando ao menu principal...");
	                break;
	            default:
	                System.out.println("Opção inválida. Tente novamente.");
	        }
	    } while (opcao != 4);
	}
		
	private void registrarPagamento(Scanner scanner) {
	    System.out.print("Digite a matrícula do aluno: ");
	    String matricula = scanner.nextLine();

	    System.out.print("Digite o valor do pagamento: ");
	    double valor = scanner.nextDouble();
	    scanner.nextLine(); // Limpa o buffer

	    pagamentos.add(new Pagamento(matricula, valor, LocalDate.now(), true));
	    System.out.println("Pagamento registrado com sucesso.");
	}
	
	private void consultarPagamentos(Scanner scanner) {
	    System.out.println("Consultar Pagamentos:");

	    System.out.print("Digite a matrícula do aluno: ");
	    String matricula = scanner.nextLine();

	    System.out.println("Pagamentos do aluno:");
	    for (Pagamento pagamento : pagamentos) {
	        if (pagamento.getMatriculaAluno().equals(matricula)) {
	            System.out.println(pagamento);
	        }
	    }
	}
	
	private void gerarRelatorioFinanceiro() {
	    System.out.println("Relatório Financeiro:");

	    double totalRecebido = 0;
	    int pagamentosPendentes = 0;

	    for (Pagamento pagamento : pagamentos) {
	        if (pagamento.isPago()) {
	            totalRecebido += pagamento.getValor();
	        } else {
	            pagamentosPendentes++;
	        }
	    }

	    System.out.println("Total Recebido: R$ " + totalRecebido);
	    System.out.println("Pagamentos Pendentes: " + pagamentosPendentes);
	}
	
	
	
	
	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		sistema.menu();
	}
}
