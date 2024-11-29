package trabalhop2;


public class AlunoVip extends Aluno {
    public AlunoVip(String nome, String matricula) {
        super(nome, matricula, true);
    }

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public void setMatricula(String matricula) {
		// TODO Auto-generated method stub
		super.setMatricula(matricula);
	}

	@Override
	public void setVIP(boolean isVIP) {
		// TODO Auto-generated method stub
		super.setVIP(isVIP);
	}

	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return super.getMatricula();
	}

	@Override
	public boolean isVIP() {
		// TODO Auto-generated method stub
		return super.isVIP();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
