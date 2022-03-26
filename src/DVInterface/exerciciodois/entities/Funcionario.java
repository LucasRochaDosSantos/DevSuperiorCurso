package DVInterface.exerciciodois.entities;

public class Funcionario implements Comparable<Funcionario> {
	
	private String name;
	private Double Salary;
    
	public Funcionario(String name, Double salary) {
		this.name = name;
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	@Override
	public int compareTo(Funcionario o) {
		return name.compareTo(o.name);
	}

}
