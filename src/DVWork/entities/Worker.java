package DVWork.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import DVWork.entities.enums.WorkLevel;

public class Worker {
	private String name;
	private WorkLevel level;
	private Double baseSalary;

	private Departament department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {}

	public Worker(String name, WorkLevel level, Double baseSalary, Departament department) {
		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartment() {
		return department;
	}

	public void setDepartment(Departament department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract hour) {
		this.contracts.add(hour);
	}
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	public double income(int year, int month) {
		double soma = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month){
				soma += c.totalValue();
			}
		}
		return soma;
	}
}
