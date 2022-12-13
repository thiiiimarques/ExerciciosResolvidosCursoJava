package ExercicioLista.Entidades;

public class Funcionario {

	private String nome;
	private Integer id;
	private Double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, Integer id, Double salario) {
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
			this.id = id;
	}

	public Double getSalario() {
		return salario;
	}

	public void incrementarSalario(double porcentagem) {
		salario = salario + (salario * porcentagem / 100);

	}

	@Override
	public String toString() {
		return "Lista de Funcionarios /n" + id + " , " + nome + " , " + salario;
	}

}
